plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    implementation(libs.ktor.server.call.logging)
    implementation(libs.slf4j.main)
}

tasks.withType<Test> {
    useJUnitPlatform()
}