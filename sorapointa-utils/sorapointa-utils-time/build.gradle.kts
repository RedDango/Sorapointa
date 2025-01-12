plugins {
    `sorapointa-conventions`
    `sorapointa-publish`
    kotlin("plugin.serialization")
}

dependencies {
    api(KotlinX.serialization.json)
    api(KotlinX.datetime)
    implementation("io.ktor:ktor-utils:_")
}
