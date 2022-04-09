package team.karakum.component.showcase

import csstype.px
import kotlinx.js.jso
import mui.material.Button
import mui.material.ButtonVariant
import mui.material.Popover
import mui.material.Typography
import mui.system.sx
import org.w3c.dom.Element
import react.FC
import react.Props
import react.dom.aria.ariaDescribedBy
import react.useState

val PopoverShowcase = FC<Props> {
    var anchor by useState<Element>()

    Button {
        if (anchor != null) {
            ariaDescribedBy = "simple-popover"
        }
        variant = ButtonVariant.contained
        onClick = { anchor = it.currentTarget }

        +"Open Popover"
    }

    Popover {
        if (anchor != null) {
            id = "simple-popover"
            anchorEl = { anchor as Element }
        }
        open = anchor != null
        onClose = { _, _ -> anchor = null }
        anchorOrigin = jso {
            vertical = "bottom"
            horizontal = "left"
        }

        Typography {
            sx { padding = 2.px }

            +"The content of the Popover."
        }
    }
}
