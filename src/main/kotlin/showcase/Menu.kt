package showcase

import kotlinext.js.jso
import mui.material.Menu
import mui.material.MenuItem
import mui.material.Typography
import react.Props
import react.dom.MouseEvent
import react.dom.div
import react.dom.onContextMenu
import react.fc
import react.useState

val MenuShowcase = fc<Props> {
    var coordinate by useState<Coordinate?>(null)

    val handleContextMenu = { event: MouseEvent<*, *> ->
        event.preventDefault()
        coordinate = if (coordinate == null) {
            Coordinate(
                x = event.clientX - 2,
                y = event.clientY - 4,
            )
        } else {
            null
        }
    }

    val handleClose = { coordinate = null }

    div {
        attrs.onContextMenu = handleContextMenu

        Typography {
            +"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ipsum purus, bibendum sit amet vulputate eget, porta semper ligula. Donec bibendum vulputate erat, ac fringilla mi finibus nec. Donec ac dolor sed dolor porttitor blandit vel vel purus. Fusce vel malesuada ligula. Nam quis vehicula ante, eu finibus est. Proin ullamcorper fermentum orci, quis finibus massa. Nunc lobortis, massa ut rutrum ultrices, metus metus finibus ex, sit amet facilisis neque enim sed neque. Quisque accumsan metus vel maximus consequat. Suspendisse lacinia tellus a libero volutpat maximus"
        }
        Menu {
            attrs.open = coordinate != null
            attrs.onClose = handleClose

            // TODO: Unable to use props correctly [MUI]
            attrs.asDynamic().anchorReference = "anchorPosition"
            attrs.asDynamic().anchorPosition = if (coordinate != null) {
                jso {
                    top = coordinate?.y
                    left = coordinate?.x
                }
            } else {
                undefined
            }

            MenuItem {
                // TODO: Unable to use props correctly [MUI]
                attrs.asDynamic().onClick = handleClose
                +"Copy"
            }
            MenuItem {
                // TODO: Unable to use props correctly [MUI]
                attrs.asDynamic().onClick = handleClose
                +"Print"
            }
            MenuItem {
                // TODO: Unable to use props correctly [MUI]
                attrs.asDynamic().onClick = handleClose
                +"Highlight"
            }
            MenuItem {
                // TODO: Unable to use props correctly [MUI]
                attrs.asDynamic().onClick = handleClose
                +"Email"
            }
        }
    }
}

private data class Coordinate(
    val x: Double,
    val y: Double,
)