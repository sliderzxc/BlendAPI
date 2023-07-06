import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

allprojects {
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf(
                "-Xcontext-receivers",
                "-opt-in=kotlin.contracts.ExperimentalContracts",
                "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
                "-language-version=2.0",
                "-XXLanguage:+UnitConversionsOnArbitraryExpressions",
            )
        }
    }
}

application {
    mainClass.set("io.timeassistant.backend.application.ApplicationKt")
}