import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("multiplatform")
}

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
            dependencies {
                implementation(libs.wrappers.react)
                implementation(libs.wrappers.react.dom)
                implementation(libs.wrappers.react.router.dom)

                implementation(libs.wrappers.emotion)
                implementation(libs.wrappers.mui.material)
                implementation(libs.wrappers.mui.icons.material)
                implementation(libs.wrappers.muix.date.pickers)

                implementation(npm("date-fns", "2.30.0"))
                implementation(npm("@date-io/date-fns", "2.17.0"))
            }
        }
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    compilerOptions {
        target.set("es2015")
    }
}

tasks.wrapper {
    gradleVersion = "8.10"
}
