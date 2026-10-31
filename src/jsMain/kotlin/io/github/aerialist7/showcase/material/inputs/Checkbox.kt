package io.github.aerialist7.showcase.material.inputs

import js.objects.unsafeJso
import mui.material.Checkbox
import mui.material.SwitchBaseSlotProps
import react.FC
import react.Props

private val LABEL: SwitchBaseSlotProps = unsafeJso {
    input = unsafeJso { ariaLabel = "Checkbox demo" }
}

val CheckboxShowcase = FC<Props> {
    Checkbox {
        slotProps = LABEL
        defaultChecked = true
    }
    Checkbox {
        slotProps = LABEL
    }
    Checkbox {
        slotProps = LABEL
        disabled = true
    }
    Checkbox {
        slotProps = LABEL
        disabled = true
        checked = true
    }
}
