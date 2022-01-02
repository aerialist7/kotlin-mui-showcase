package example

import csstype.*
import kotlinext.js.jso
import mui.material.Box
import mui.material.Typography
import react.FC
import react.Props
import react.css.css
import react.dom.html.ReactHTML.img

val Placeholder = FC<Props> {
    Box {
        sx = jso {
            display = Display.grid
            justifyContent = JustifyContent.center
            gridTemplateRows = "repeat(2, 0fr)".unsafeCast<GridTemplateRows>()
        }

        Typography {
            variant = "h6"

            +"To start the showcase please select a component"
        }

        img {
            css {
                width = 450.px
                transform = "scale(1, -1)".unsafeCast<Transform>()
            }

            src = "arrow.png"
        }
    }
}
