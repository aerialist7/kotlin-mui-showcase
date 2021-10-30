plugins {
    kotlin("js") version "1.5.31"
    id("com.github.turansky.kfc.webpack") version "4.32.0"
}

repositories {
    mavenCentral()
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:0.0.1-pre.262-kotlin-1.5.31")))

    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))

    implementation(kotlinw("mui"))

    implementation(kotlinw("styled"))

    implementation(kotlinw("ring-ui"))
    implementation(npm("core-js", "3.19.0"))

    implementation(npm("@emotion/react", "11.5.0"))
    implementation(npm("@emotion/styled", "11.3.0"))
    implementation(npm("@mui/material", "5.0.5"))
}

kotlin.js {
    browser()
    binaries.executable()
}

// TODO: Temporary until Kotlin update
rootProject.plugins.withType(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin::class.java) {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().versions.webpackCli.version = "4.9.0"
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

    wrapper {
        gradleVersion = "7.2"
    }
}
