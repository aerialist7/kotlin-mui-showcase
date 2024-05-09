import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("multiplatform")
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

kotlin {
    js {
        useEsModules()
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
                implementation(project.dependencies.enforcedPlatform(kotlinw("wrappers-bom:$wrappersVersion")))

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

// TODO: Migrate to `compilerOptions { target.set("es2015") }` after Kotlin `2.0.0`
//  Details: https://kotlinlang.org/docs/whatsnew-eap.html#new-compilation-target
// From https://kotlinlang.org/docs/whatsnew19.html#experimental-support-for-es2015-classes-and-modules
tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        useEsClasses = true
    }
}

tasks.wrapper {
    gradleVersion = "8.7"
}
