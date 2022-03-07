package team.karakum.component.showcase

import csstype.number
import csstype.px
import mui.icons.material.Menu
import mui.material.*
import mui.system.sx
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML

val AppBarShowcase = FC<Props> {
    Box {
        sx { flexGrow = number(1.0) }

        AppBar {
            position = AppBarPosition.static

            Toolbar {
                IconButton {
                    sx { marginRight = 2.px }
                    edge = IconButtonEdge.start
                    size = Size.large
                    color = IconButtonColor.inherit
                    ariaLabel = "menu"

                    Menu()
                }

                Typography {
                    sx { flexGrow = number(1.0) }
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
