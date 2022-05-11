import com.github.gmazzo.gradle.plugins.BuildConfigSourceSet

plugins {
    id("sorapointa-conventions")
    id("com.github.gmazzo.buildconfig")
    kotlin("plugin.serialization")
}

dependencies {
    api(KotlinX.serialization.json)
    api(KotlinX.datetime)
}


fun BuildConfigSourceSet.string(name: String, value: String) = buildConfigField("String", name, "\"$value\"")
fun BuildConfigSourceSet.stringNullable(name: String, value: String?) =
    buildConfigField("String?", name, value?.let { "\"$value\"" } ?: "null")

fun BuildConfigSourceSet.long(name: String, value: Long) = buildConfigField("long", name, value.toString())
fun BuildConfigSourceSet.longNullable(name: String, value: Long?) =
    buildConfigField("Long?", name, value?.let { "$value" } ?: "null")

val commitHash by lazy {
    val commitHashCommand = "git rev-parse --short HEAD"
    Runtime.getRuntime().exec(commitHashCommand).inputStream.bufferedReader().readLine() ?: "UnkCommit"
}

val branch by lazy {
    val branchCommand = "git rev-parse --abbrev-ref HEAD"
    Runtime.getRuntime().exec(branchCommand).inputStream.bufferedReader().readLine() ?: "UnkBranch"
}

buildConfig {
    packageName("$group.config")
    useKotlinOutput { topLevelConstants = true }
    string("VERSION", version.toString())
    string("BUILD_BRANCH", branch)
    string("COMMIT_HASH", commitHash)

    sourceSets["test"].apply {
        string("TEST_DIR", rootProject.rootDir.absolutePath.replace("\\", "/"))
    }
}

tasks.test {
    dependsOn("generateTestBuildConfig")
}
