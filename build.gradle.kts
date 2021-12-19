plugins {
    kotlin("js") version "1.6.0"
    id("com.github.turansky.kfc.webpack") version "4.52.0"
}

repositories {
    mavenCentral()
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:0.0.1-pre.279-kotlin-1.6.0")))

    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
    implementation(kotlinw("react-css"))

    implementation(kotlinw("mui"))

    implementation(npm("@emotion/react", "11.7.0"))
    implementation(npm("@emotion/styled", "11.6.0"))
}

kotlin.js {
    browser()
    binaries.executable()
}

tasks {
    wrapper {
        gradleVersion = "7.3.1"
    }
}
