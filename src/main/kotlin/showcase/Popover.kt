package showcase

import csstype.px
import kotlinext.js.jso
import mui.material.Button
import mui.material.Popover
import mui.material.Typography
import org.w3c.dom.Element
import react.Props
import react.dom.aria.ariaDescribedBy
import react.dom.events.MouseEventHandler
import react.fc
import react.useState

val PopoverShowcase = fc<Props> {
    var anchorEl by useState<Element?>(null)

    val handleClick: MouseEventHandler<*> = { anchorEl = it.currentTarget }

    val handleClose = { anchorEl = null }

    val isOpen = anchorEl != null
    val id = if (isOpen) "simple-popover" else undefined

    Button {
        attrs {
            id?.let { ariaDescribedBy = id }
            variant = "contained"
            onClick = handleClick
        }
        +"Open Popover"
    }

    Popover {
        attrs {
            // TODO: Unable to set `id` prop directly [MUI]
            asDynamic().id = id
            // TODO: Unable to set `anchorEl` prop directly [MUI]
            asDynamic().anchorEl = anchorEl
            open = isOpen
            onClose = handleClose
            anchorOrigin = jso {
                vertical = "bottom"
                horizontal = "left"
            }
        }

        Typography {
            attrs.sx = jso {
                padding = 2.px
            }
            +"The content of the Popover."
        }
    }
}
