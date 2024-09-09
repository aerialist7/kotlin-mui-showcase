package io.github.aerialist7.showcase.material.inputs

import mui.material.Checkbox
import react.FC
import react.Props

val CheckboxShowcase = FC<Props> {
    Checkbox {
        defaultChecked = true
    }
    Checkbox {
    }
    Checkbox {
        disabled = true
    }
    Checkbox {
        disabled = true
        checked = true
    }
}
