plugins {
    kotlin("multiplatform")
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

kotlin {
    js {
        browser {
            commonWebpackConfig {
                outputFileName = "index.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            val wrappersVersion = extra["kotlin.wrappers.version"]

            dependencies {
                implementation(enforcedPlatform(kotlinw("wrappers-bom:$wrappersVersion")))

                implementation(kotlinw("react"))
                implementation(kotlinw("react-dom"))
                implementation(kotlinw("react-router-dom"))

                implementation(kotlinw("emotion"))
                implementation(kotlinw("mui-material"))
                implementation(kotlinw("mui-icons-material"))
                implementation(kotlinw("muix-date-pickers"))

                implementation(npm("date-fns", "2.30.0"))
                implementation(npm("@date-io/date-fns", "2.17.0"))
            }
        }
    }
}

tasks.wrapper {
    gradleVersion = "8.6"
}
