package showcase

import csstype.Display
import csstype.FlexWrap.Companion.wrap
import csstype.px
import kotlinext.js.jso
import mui.material.Box
import mui.material.Paper
import react.Props
import react.fc

val PaperShowcase = fc<Props> {
    Box {
        attrs.sx = jso {
            display = Display.flex
            flexWrap = wrap
            width = 128.px
            height = 128.px
        }

        Paper {
            attrs.elevation = 3
            attrs.variant = "outlined"
            +"Outlined Paper Component"
        }
    }
}
