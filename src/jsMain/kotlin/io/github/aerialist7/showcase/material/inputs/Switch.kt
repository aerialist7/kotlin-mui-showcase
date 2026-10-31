package io.github.aerialist7.showcase.material.inputs

import js.objects.unsafeJso
import mui.material.Switch
import mui.material.SwitchBaseSlotProps
import react.FC
import react.Props
import react.dom.html.ReactHTML.div

private val LABEL: SwitchBaseSlotProps = unsafeJso {
    input = unsafeJso { ariaLabel = "Switch demo" }
}

val SwitchShowcase = FC<Props> {
    div {
        Switch {
            slotProps = LABEL
            defaultChecked = true
        }
        Switch {
            slotProps = LABEL
        }
        Switch {
            slotProps = LABEL
            disabled = true
            defaultChecked = true
        }
        Switch {
            slotProps = LABEL
            disabled = true
        }
    }
}
