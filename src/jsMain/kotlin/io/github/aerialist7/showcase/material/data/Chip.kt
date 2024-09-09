package io.github.aerialist7.showcase.material.data

import mui.material.Box
import mui.material.Chip
import mui.material.ChipVariant.Companion.outlined
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import web.cssom.Display
import web.cssom.JustifyContent
import web.cssom.px

val ChipShowcase = FC<Props> {
    Box {
        sx {
            display = Display.flex
            justifyContent = JustifyContent.left
            gap = 8.px
        }

        Chip {
            label = ReactNode("Chip Filled")
        }
        Chip {
            label = ReactNode("Chip Outlined")
            variant = outlined
        }
    }
}
