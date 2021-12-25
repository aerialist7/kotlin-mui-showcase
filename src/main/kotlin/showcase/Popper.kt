package showcase

import csstype.AlignItems
import csstype.JustifyContent
import csstype.px
import kotlinext.js.jso
import mui.material.*
import mui.system.ResponsiveStyleValue
import org.w3c.dom.Element
import react.FC
import react.Props
import react.dom.events.MouseEvent
import react.dom.html.ReactHTML.br
import react.useState

val PopperShowcase = FC<Props> {
    var anchorElement by useState<Element?>(null)
    var isOpen by useState(false)
    var placementPosition by useState<String>()

    fun MouseEvent<*, *>.handleClick(newPlacement: String) {
        isOpen = placementPosition != newPlacement || !isOpen
        placementPosition = newPlacement
        anchorElement = currentTarget
    }

    Box {
        sx = jso {
            width = 500.px
        }
        Popper {
            // TODO: Remove `asDynamic` after [MUI] update
            with(asDynamic()) {
                open = isOpen
                anchorEl = anchorElement
                placement = placementPosition
            }
            Typography {
                sx = jso {
                    padding = 2.px
                }
                +"The content of the Popper."
            }
        }

        Grid {
            container = true
            sx = jso {
                justifyContent = JustifyContent.center
            }
            Grid {
                item = true
                Button {
                    val newPlacement = "top-start"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                Button {
                    val newPlacement = "top"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                Button {
                    val newPlacement = "top-end"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
            }
        }
        Grid {
            container = true
            sx = jso {
                justifyContent = JustifyContent.center
            }
            Grid {
                item = true
                xs = 6
                Button {
                    val newPlacement = "left-start"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                br()
                Button {
                    val newPlacement = "left"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                br()
                Button {
                    val newPlacement = "left-end"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
            }
            Grid {
                item = true
                container = true
                xs = 6
                sx = jso {
                    alignItems = AlignItems.flexEnd
                }
                // TODO: Unable to set `direction` prop correctly
                direction = GridDirection.column.unsafeCast<ResponsiveStyleValue<GridDirection>?>()
                Grid {
                    item = true
                    Button {
                        val newPlacement = "right-start"
                        onClick = { it.handleClick(newPlacement) }
                        +newPlacement
                    }
                }
                Grid {
                    item = true
                    Button {
                        val newPlacement = "right"
                        onClick = { it.handleClick(newPlacement) }
                        +newPlacement
                    }
                }
                Grid {
                    item = true
                    Button {
                        val newPlacement = "right-end"
                        onClick = { it.handleClick(newPlacement) }
                        +newPlacement
                    }
                }
            }
        }
        Grid {
            container = true
            sx = jso {
                justifyContent = JustifyContent.center
            }
            Grid {
                item = true
                Button {
                    val newPlacement = "bottom-start"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                Button {
                    val newPlacement = "bottom"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                Button {
                    val newPlacement = "bottom-end"
                    onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
            }
        }
    }
}
