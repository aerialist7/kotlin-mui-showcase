package showcase

import csstype.px
import kotlinext.js.jso
import mui.material.Button
import mui.material.ButtonVariant
import mui.material.Popover
import mui.material.Typography
import org.w3c.dom.Element
import react.FC
import react.Props
import react.dom.aria.ariaDescribedBy
import react.dom.events.MouseEventHandler
import react.useState

val PopoverShowcase = FC<Props> {
    var anchorEl by useState<Element?>(null)

    val handleClick: MouseEventHandler<*> = { anchorEl = it.currentTarget }

    val handleClose = { anchorEl = null }

    val isOpen = anchorEl != null
    val id = if (isOpen) "simple-popover" else undefined

    Button {
        id?.let { ariaDescribedBy = id }
        variant = ButtonVariant.contained
        onClick = handleClick

        +"Open Popover"
    }

    Popover {
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

        Typography {
            sx = jso {
                padding = 2.px
            }
            +"The content of the Popover."
        }
    }
}
