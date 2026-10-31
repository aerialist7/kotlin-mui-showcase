import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins {
    kotlin("multiplatform")
}

kotlin {
    compilerOptions {
        optIn.addAll(
            "kotlin.js.ExperimentalWasmJsInterop",
        )
    }

    js {
        browser {
            commonWebpackConfig {
                outputFileName = "index.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        jsMain {
            dependencies {
                implementation(kotlinWrappers.react)
                implementation(kotlinWrappers.reactDom)
                implementation(kotlinWrappers.tanstack.history)
                implementation(kotlinWrappers.tanstack.reactRouter)

                implementation(kotlinWrappers.emotion.styled)
                implementation(kotlinWrappers.mui.material)
                implementation(kotlinWrappers.mui.iconsMaterial)
                implementation(kotlinWrappers.mui.lab)
                implementation(kotlinWrappers.muix.datePickers)
                implementation(kotlinWrappers.muix.treeView)

                implementation(npm("date-fns", "4.4.0"))
                // MUI X Data Grid is not published in Kotlin Wrappers, so it is declared locally.
                implementation(npm("@mui/x-data-grid", "9.15.0"))
            }
        }
    }
}

plugins.withType<NodeJsRootPlugin> {
    the<NpmExtension>().apply {
        // Keep the shared MUI X internals API aligned with the published MUI X wrappers.
        override("@mui/x-internals", "9.15.0")
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    compilerOptions {
        target.set("es2015")
    }
}

tasks.wrapper {
    gradleVersion = "9.8.2"
}
