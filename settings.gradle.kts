rootProject.name = "kotlin-mui-showcase"

pluginManagement {
    plugins {
        val kotlinVersion = extra["kotlin.version"] as String
        kotlin("multiplatform") version kotlinVersion
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
