plugins {
    kotlin("js") version "1.6.10"
    id("io.github.turansky.kfc.webpack") version "5.0.0"
}

repositories {
    mavenCentral()
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:0.0.1-pre.298-kotlin-1.6.10")))

    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
    implementation(kotlinw("react-css"))
    implementation(kotlinw("react-router-dom"))

    implementation(kotlinw("mui"))
    implementation(kotlinw("mui-icons"))

    implementation(npm("@emotion/react", "11.7.1"))
    implementation(npm("@emotion/styled", "11.6.0"))
}

kotlin.js {
    browser()
    binaries.executable()
}

tasks {
    wrapper {
        gradleVersion = "7.4"
    }
}
