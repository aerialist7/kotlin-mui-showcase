package io.github.aerialist7.showcase.material.surfaces

import mui.material.Box
import mui.material.Paper
import mui.material.PaperVariant.Companion.outlined
import mui.material.Typography
import mui.system.sx
import react.FC
import react.Props
import web.cssom.Display
import web.cssom.FlexWrap.Companion.wrap
import web.cssom.px

val PaperShowcase = FC<Props> {
    Box {
        sx {
            display = Display.flex
            flexWrap = wrap
            width = 128.px
            height = 128.px
        }

        Paper {
            variant = outlined

            Typography {
                +"Outlined Paper Component"
            }
        }
    }
}
