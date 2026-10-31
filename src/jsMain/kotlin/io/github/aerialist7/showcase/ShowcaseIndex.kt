package io.github.aerialist7.showcase

import mui.material.Link
import mui.material.Typography
import mui.material.styles.TypographyVariant.Companion.h4
import react.FC
import react.Props

val ShowcaseIndex = FC<Props> {
    Typography {
        variant = h4
        gutterBottom = true

        +"Kotlin MUI Showcase"
    }

    Typography {
        gutterBottom = true

        +"Interactive examples of Material UI and MUI X components written in Kotlin with the "
        Link {
            href = "https://github.com/JetBrains/kotlin-wrappers"

            +"Kotlin Wrappers"
        }
        +"."
    }

    Typography {
        color = "textSecondary"

        +"Select a component in the navigation to see its demo. "
        +"The header buttons open its MUI documentation and its Kotlin sources."
    }
}
