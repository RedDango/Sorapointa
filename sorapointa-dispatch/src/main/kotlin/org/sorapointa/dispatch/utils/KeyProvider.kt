package org.sorapointa.dispatch.utils

import io.ktor.network.tls.extensions.*
import io.ktor.util.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.sorapointa.dispatch.DispatchConfig
import java.io.File
import java.security.KeyStore
import kotlin.text.toCharArray

object KeyProvider {

    const val DEFAULT_CERT_NAME = "sorapointa-cert.jks"
    const val DEFAULT_ALIAS = "sorapointa-dispatch-cert"
    const val DEFAULT_CERT_PASSWORD = "sorapointa-dispatch-private"
    const val DEFAULT_KEY_STORE_PASSWORD = "sorapointa-dispatch"
    private const val DEFAULT_EXPIRED_DAYS = 365 * 10L // 10 Years

    private val ANIME_URL_1 = "Ki5taWhveW8uY29t".decodeBase64String()
    private val ANIME_URL_2 = "Ki55dWFuc2hlbi5jb20=".decodeBase64String()
    private val ANIME_URL_3 = "Ki5ob3lvdmVyc2UuY29t".decodeBase64String()

    suspend fun getCertsFromConfigOrGenerate(): KeyStore = withContext(Dispatchers.IO) {
        val dispatchConfig = DispatchConfig.data
        val keyStoreFile = File(dispatchConfig.certification.keyStoreFilePath)
        if (!keyStoreFile.exists()) {
            val alias: String = DEFAULT_ALIAS
            val privateKeyPassword: String = DEFAULT_CERT_PASSWORD
            val keyStorePassword: String = DEFAULT_KEY_STORE_PASSWORD
            val expiredDays: Long = DEFAULT_EXPIRED_DAYS
            val generatedKeyStore = buildKeyStore {
                certificate(alias) {
                    hash = HashAlgorithm.SHA256
                    sign = SignatureAlgorithm.RSA
                    keySizeInBits = 2048
                    password = privateKeyPassword
                    daysValid = expiredDays
                    hosts = listOf("localhost", ANIME_URL_1, ANIME_URL_2, ANIME_URL_3)
                    keyType = KeyType.Server
                }
            }
            generatedKeyStore.saveToFile(keyStoreFile, keyStorePassword)
            generatedKeyStore.saveCertToFile(
                File(keyStoreFile.parentFile, keyStoreFile.nameWithoutExtension + ".cert"), alias
            )
            dispatchConfig.certification = DispatchConfig.Certification(
                keyStore = "JKS",
                keyAlias = alias,
                keyStorePassword = keyStorePassword,
                privateKeyPassword = privateKeyPassword
            )
            DispatchConfig.save()
            generatedKeyStore
        } else {
            fromCertFile(keyStoreFile, dispatchConfig.certification.keyStorePassword)
        }
    }

    private fun fromCertFile(certFile: File, password: String): KeyStore {
        val store = KeyStore.getInstance("JKS")!!
        store.load(certFile.inputStream(), password.toCharArray())
        return store
    }
}
