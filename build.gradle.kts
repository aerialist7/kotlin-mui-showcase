plugins {
    kotlin("js") version "1.5.30"
    id("com.github.turansky.kfc.webpack") version "4.32.0"
}

repositories {
    mavenCentral()
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:0.0.1-pre.246-kotlin-1.5.30")))

    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))

    implementation(kotlinw("ring-ui"))
    implementation(npm("core-js", "3.17.3"))
}

kotlin.js {
    browser()
    binaries.executable()
}

tasks.wrapper {
    gradleVersion = "7.2"
    distributionType = Wrapper.DistributionType.ALL
}

tasks {
    patchWebpackConfig {
        patch(
            """
            config.module.rules.push(
                ...require('@jetbrains/ring-ui/webpack.config').config.module.rules
            )
        """
        )
    }
}
