
plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.ktor) apply false
}

subprojects {
    repositories {
        mavenCentral()
    }

    group = "com.example"
    version = "0.0.1"
}
