import de.undercouch.gradle.tasks.download.Download

plugins {
    kotlin("js") version "1.5.31"
    id("com.github.turansky.kfc.webpack") version "4.32.0"

    id("de.undercouch.download") version "4.1.2"
}

repositories {
    mavenCentral()
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:0.0.1-pre.251-kotlin-1.5.31")))

    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))

    implementation(kotlinw("styled"))

    implementation(kotlinw("ring-ui"))
    implementation(npm("core-js", "3.17.3"))

    implementation(npm("@emotion/react", "11.4.1"))
    implementation(npm("@emotion/styled", "11.3.0"))
    implementation(npm("@mui/material", "5.0.0"))
}

kotlin {
    sourceSets {
        main {
            kotlin.srcDir("./build/mui-kotlin-main/mui-kotlin/src/main/kotlin")
        }
    }
    js {
        browser()
        binaries.executable()
    }
}

tasks {

    val downloadSources by registering(Download::class) {
        src("https://github.com/turansky/mui-kotlin/archive/refs/heads/main.zip")
        dest(File(buildDir, "mui.zip"))
    }

    val unzipSources by registering(Copy::class) {
        from(zipTree(downloadSources.get().dest))
        into(buildDir)
    }

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
        distributionType = Wrapper.DistributionType.ALL
    }
}
