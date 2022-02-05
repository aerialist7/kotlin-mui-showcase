package example.component.showcase

import mui.material.Checkbox
import react.FC
import react.Props

val CheckboxesShowcase = FC<Props> {
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
