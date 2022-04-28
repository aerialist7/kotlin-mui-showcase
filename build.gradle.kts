plugins {
    kotlin("js")
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:0.0.1-pre.333")))

    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
    implementation(kotlinw("react-router-dom"))

    implementation(kotlinw("emotion"))
    implementation(kotlinw("mui"))
    implementation(kotlinw("mui-icons"))
}

kotlin.js {
    browser()
    binaries.executable()
}

tasks {
    wrapper {
        gradleVersion = "7.4.2"
    }
}
