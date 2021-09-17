plugins {
    kotlin("js") version "1.5.21"
}

repositories {
    mavenCentral()
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:0.0.1-pre.221-kotlin-1.5.21")))
    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
}

kotlin.js {
    browser()
    binaries.executable()
}

tasks.wrapper {
    gradleVersion = "7.1.1"
    distributionType = Wrapper.DistributionType.ALL
}
