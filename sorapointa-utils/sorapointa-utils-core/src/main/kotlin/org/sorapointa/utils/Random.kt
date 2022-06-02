package org.sorapointa.utils

import mu.KotlinLogging
import org.sorapointa.utils.encoding.hex
import java.security.SecureRandom
import java.util.*
import java.util.concurrent.ThreadLocalRandom
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

private val logger = KotlinLogging.logger {}

val secureRandom: Random
    get() = SecureRandom.getInstanceStrong()
        ?: SecureRandom.getInstance("NativePRNG")
        ?: SecureRandom.getInstance("SHA1PRNG")
        ?: run {
            logger.warn {
                "No SecureRandom Instance found, fallback to normal Random, " +
                    "please change your JDK vendor for better safety."
            }
            ThreadLocalRandom.current()
        }

fun randomByteArray(length: Int): ByteArray {
    val bytes = ByteArray(length)
    secureRandom.nextBytes(bytes)
    return bytes
}

/**
 * Random unsigned long
 *
 * [kotlin.random.nextUInt] will produce negative number
 * when convert to [Int]
 */
fun randomUInt(): UInt =
    kotlin.random.Random.nextInt(0, Int.MAX_VALUE).toUInt()

/**
 * Random unsigned long
 * [kotlin.random.nextULong] will produce negative number
 * when convert to [Long]
 */
fun randomULong(): ULong =
    kotlin.random.Random.nextLong(0, Long.MAX_VALUE).toULong()

/**
 * Random unsigned byte array
 *
 * @param length byte length
 */
fun randomUByteArray(length: UInt): UByteArray =
    randomByteArray(length.toInt()).toUByteArray()

/**
 * SHA 256 Signature
 *
 * @receiver data to be signed
 * @param key sign key
 * @return sign result
 */
fun String.sha256sign(key: String): String {
    val sha256Hmac = Mac.getInstance("HmacSHA256")
    val secretKey = SecretKeySpec(key.toByteArray(), "HmacSHA256")
    sha256Hmac.init(secretKey)
    return sha256Hmac.doFinal(this.toByteArray()).hex
}