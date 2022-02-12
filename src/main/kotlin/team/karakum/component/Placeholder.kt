package team.karakum.component

import csstype.*
import kotlinx.js.jso
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
            gridTemplateRows = GridTemplateRows(0.fr, 0.fr)
        }

        Typography {
            variant = "h6"

            +"To start the showcase please select a component"
        }

        img {
            css {
                width = 450.px
                transform = scale(1, -1)
            }

            src = "arrow.png"
        }
    }
}
