package showcase

import kotlinext.js.jso
import mui.material.Menu
import mui.material.MenuItem
import mui.material.PopoverReference
import mui.material.Typography
import react.Props
import react.dom.div
import react.dom.events.MouseEvent
import react.dom.events.MouseEventHandler
import react.dom.onContextMenu
import react.fc
import react.useState

val MenuShowcase = fc<Props> {
    var point by useState<Point?>(null)

    val handleContextMenu = { event: MouseEvent<*, *> ->
        event.preventDefault()
        point = if (point == null) {
            Point(
                x = event.clientX - 2,
                y = event.clientY - 4,
            )
        } else {
            null
        }
    }

    val handleClose: MouseEventHandler<*> = { point = null }

    div {
        attrs.onContextMenu = handleContextMenu

        Typography {
            +"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ipsum purus, bibendum sit amet vulputate eget, porta semper ligula. Donec bibendum vulputate erat, ac fringilla mi finibus nec. Donec ac dolor sed dolor porttitor blandit vel vel purus. Fusce vel malesuada ligula. Nam quis vehicula ante, eu finibus est. Proin ullamcorper fermentum orci, quis finibus massa. Nunc lobortis, massa ut rutrum ultrices, metus metus finibus ex, sit amet facilisis neque enim sed neque. Quisque accumsan metus vel maximus consequat. Suspendisse lacinia tellus a libero volutpat maximus"
        }
        Menu {
            attrs.open = point != null
            attrs.onClose = handleClose

            attrs.anchorReference = PopoverReference.anchorPosition
            attrs.anchorPosition = if (point != null) {
                jso {
                    top = point!!.y
                    left = point!!.x
                }
            } else {
                undefined
            }

            MenuItem {
                attrs.onClick = handleClose
                +"Copy"
            }
            MenuItem {
                attrs.onClick = handleClose
                +"Print"
            }
            MenuItem {
                attrs.onClick = handleClose
                +"Highlight"
            }
            MenuItem {
                attrs.onClick = handleClose
                +"Email"
            }
        }
    }
}

private data class Point(
    val x: Double,
    val y: Double,
)
