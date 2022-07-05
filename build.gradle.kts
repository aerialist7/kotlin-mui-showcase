plugins {
    kotlin("js")
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:1.0.0-pre.351")))

    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
    implementation(kotlinw("react-router-dom"))

    implementation(kotlinw("emotion"))
    implementation(kotlinw("mui"))
    implementation(kotlinw("mui-icons"))

    implementation(npm("date-fns", "2.28.0"))
    implementation(npm("@date-io/date-fns", "2.14.0"))
}

kotlin.js {
    browser()
    binaries.executable()
}

// TODO: Remove when will be fixed in newest version of Kotlin
extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
    versions.webpackCli.version = "4.10.0"
}

tasks {
    wrapper {
        gradleVersion = "7.4.2"
    }
}
