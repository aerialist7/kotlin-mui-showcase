plugins {
    kotlin("js")
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:1.0.0-pre.511")))

    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
    implementation(kotlinw("react-router-dom"))

    implementation(kotlinw("emotion"))
    implementation(kotlinw("mui"))
    implementation(kotlinw("mui-icons"))

    implementation(npm("date-fns", "2.29.3"))
    implementation(npm("@date-io/date-fns", "2.16.0"))
}

kotlin.js {
    browser()
    binaries.executable()
}

tasks {
    wrapper {
        gradleVersion = "8.0.2"
    }
}
