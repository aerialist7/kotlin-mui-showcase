package team.karakum.component.showcase

import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import mui.icons.material.Menu
import mui.material.*
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML

val AppBarShowcase = FC<Props> {
    Box {
        sx = jso { flexGrow = FlexGrow(1.0) }

        AppBar {
            position = AppBarPosition.static

            Toolbar {
                IconButton {
                    sx = jso { marginRight = 2.px }
                    edge = IconButtonEdge.start
                    size = Size.large
                    color = IconButtonColor.inherit
                    ariaLabel = "menu"

                    Menu()
                }

                Typography {
                    sx = jso { flexGrow = FlexGrow(1.0) }
                    variant = "h6"
                    component = ReactHTML.div

                    +"News"
                }

                Button {
                    color = ButtonColor.inherit

                    +"Login"
                }
            }
        }
    }
}
