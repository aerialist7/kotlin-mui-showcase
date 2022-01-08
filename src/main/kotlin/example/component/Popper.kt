package example.component

import csstype.AlignItems
import csstype.JustifyContent
import csstype.px
import kotlinext.js.jso
import mui.material.*
import mui.system.ResponsiveStyleValue
import org.w3c.dom.Element
import popper.core.Placement
import react.FC
import react.Props
import react.dom.events.MouseEvent
import react.dom.html.ReactHTML.br
import react.useState

val PopperShowcase = FC<Props> {
    var isOpen by useState(false)
    var anchor by useState<Element>()
    var place by useState<Placement>()

    fun MouseEvent<*, *>.handleClick(newPlacement: Placement) {
        isOpen = place != newPlacement || !isOpen
        place = newPlacement
        anchor = currentTarget
    }

    Box {
        sx = jso { width = 500.px }

        Popper {
            open = isOpen
            anchorEl = anchor
            placement = place

            Typography {
                sx = jso { padding = 2.px }

                +"The content of the Popper."
            }
        }

        Grid {
            container = true
            sx = jso { justifyContent = JustifyContent.center }

            Grid {
                item = true
                Button {
                    val newPlacement = Placement.topStart
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
                Button {
                    val newPlacement = Placement.top
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
                Button {
                    val newPlacement = Placement.topEnd
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
            }
        }
        Grid {
            container = true
            sx = jso { justifyContent = JustifyContent.center }

            Grid {
                item = true
                xs = 6
                Button {
                    val newPlacement = Placement.leftStart
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
                br()
                Button {
                    val newPlacement = Placement.left
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
                br()
                Button {
                    val newPlacement = Placement.leftEnd
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
            }
            Grid {
                sx = jso { alignItems = AlignItems.flexEnd }
                item = true
                container = true
                xs = 6
                direction = ResponsiveStyleValue(GridDirection.column)

                Grid {
                    item = true

                    Button {
                        val newPlacement = Placement.rightStart
                        onClick = { it.handleClick(newPlacement) }

                        +"$newPlacement"
                    }
                }
                Grid {
                    item = true

                    Button {
                        val newPlacement = Placement.right
                        onClick = { it.handleClick(newPlacement) }

                        +"$newPlacement"
                    }
                }
                Grid {
                    item = true
                    Button {
                        val newPlacement = Placement.rightEnd
                        onClick = { it.handleClick(newPlacement) }

                        +"$newPlacement"
                    }
                }
            }
        }
        Grid {
            container = true
            sx = jso { justifyContent = JustifyContent.center }

            Grid {
                item = true
                Button {
                    val newPlacement = Placement.bottomStart
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
                Button {
                    val newPlacement = Placement.bottom
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
                Button {
                    val newPlacement = Placement.bottomEnd
                    onClick = { it.handleClick(newPlacement) }

                    +"$newPlacement"
                }
            }
        }
    }
}
