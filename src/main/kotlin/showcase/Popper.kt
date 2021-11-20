package showcase

import csstype.AlignItems
import csstype.JustifyContent
import csstype.px
import kotlinext.js.jso
import mui.material.*
import org.w3c.dom.Element
import react.Props
import react.dom.br
import react.dom.events.MouseEvent
import react.fc
import react.useState

val PopperShowcase = fc<Props> {
    var anchorElement by useState<Element?>(null)
    var isOpen by useState(false)
    var placementPosition by useState<String>()

    fun MouseEvent<*, *>.handleClick(newPlacement: String) {
        isOpen = placementPosition != newPlacement || !isOpen
        placementPosition = newPlacement
        anchorElement = currentTarget
    }

    Box {
        attrs.sx = jso {
            width = 500.px
        }
        Popper {
            // TODO: Remove `asDynamic` after [MUI] update
            with(attrs.asDynamic()) {
                open = isOpen
                anchorEl = anchorElement
                placement = placementPosition
            }
            Typography {
                attrs.sx = jso {
                    padding = 2.px
                }
                +"The content of the Popper."
            }
        }

        Grid {
            attrs.container = true
            attrs.sx = jso {
                justifyContent = JustifyContent.center
            }
            Grid {
                attrs.item = true
                Button {
                    val newPlacement = "top-start"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                Button {
                    val newPlacement = "top"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                Button {
                    val newPlacement = "top-end"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
            }
        }
        Grid {
            attrs.container = true
            attrs.sx = jso {
                justifyContent = JustifyContent.center
            }
            Grid {
                attrs.item = true
                attrs.xs = 6
                Button {
                    val newPlacement = "left-start"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                br {}
                Button {
                    val newPlacement = "left"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                br {}
                Button {
                    val newPlacement = "left-end"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
            }
            Grid {
                attrs.item = true
                attrs.container = true
                attrs.xs = 6
                attrs.sx = jso {
                    alignItems = AlignItems.flexEnd
                }
                // TODO: Unable to set `direction` prop correctly
                attrs.direction = "column".unsafeCast<mui.system.ResponsiveStyleValue<GridDirection>?>()
                Grid {
                    attrs.item = true
                    Button {
                        val newPlacement = "right-start"
                        attrs.onClick = { it.handleClick(newPlacement) }
                        +newPlacement
                    }
                }
                Grid {
                    attrs.item = true
                    Button {
                        val newPlacement = "right"
                        attrs.onClick = { it.handleClick(newPlacement) }
                        +newPlacement
                    }
                }
                Grid {
                    attrs.item = true
                    Button {
                        val newPlacement = "right-end"
                        attrs.onClick = { it.handleClick(newPlacement) }
                        +newPlacement
                    }
                }
            }
        }
        Grid {
            attrs.container = true
            attrs.sx = jso {
                justifyContent = JustifyContent.center
            }
            Grid {
                attrs.item = true
                Button {
                    val newPlacement = "bottom-start"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                Button {
                    val newPlacement = "bottom"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
                Button {
                    val newPlacement = "bottom-end"
                    attrs.onClick = { it.handleClick(newPlacement) }
                    +newPlacement
                }
            }
        }
    }
}
