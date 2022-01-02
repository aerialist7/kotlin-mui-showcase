package example.showcase

import csstype.Display
import csstype.FlexWrap.Companion.wrap
import csstype.px
import kotlinext.js.jso
import mui.material.Box
import mui.material.Paper
import mui.material.PaperVariant
import mui.material.Typography
import react.FC
import react.Props

val PaperShowcase = FC<Props> {
    Box {
        sx = jso {
            display = Display.flex
            flexWrap = wrap
            width = 128.px
            height = 128.px
        }

        Paper {
            elevation = 3
            variant = PaperVariant.outlined

            Typography {
                +"Outlined Paper Component"
            }
        }
    }
}
