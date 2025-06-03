package io.github.aerialist7.showcase.material.utils

import js.objects.unsafeJso
import mui.material.Button
import mui.material.ButtonVariant.Companion.contained
import mui.material.Popover
import mui.material.Typography
import mui.system.sx
import react.FC
import react.Props
import react.useState
import web.cssom.px
import web.dom.Element
import web.dom.ElementId

val PopoverShowcase = FC<Props> {
    var anchor by useState<Element>()

    Button {
        if (anchor != null) {
            ariaDescribedBy = ElementId("simple-popover")
        }
        variant = contained
        onClick = { anchor = it.currentTarget }

        +"Open Popover"
    }

    Popover {
        if (anchor != null) {
            id = ElementId("simple-popover")
            anchorEl = anchor
        }
        open = anchor != null
        onClose = { _, _ -> anchor = null }
        anchorOrigin = unsafeJso {
            vertical = "bottom"
            horizontal = "left"
        }

        Typography {
            sx { padding = 2.px }

            +"The content of the Popover."
        }
    }
}
