package example.component

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
    var anchor by useState<Element?>(null)

    val handleClick: MouseEventHandler<*> = { anchor = it.currentTarget }

    val handleClose = { anchor = null }

    val isOpen = anchor != null
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
        // TODO: Redundant cast [MUI]
        anchorEl = anchor.unsafeCast<((Element) -> Element)?>()
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
