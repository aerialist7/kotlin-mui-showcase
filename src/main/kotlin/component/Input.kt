package component

import mui.material.Input
import react.FC
import react.Props

val InputShowcase = FC<Props> {
    Input {
        defaultValue = "Hello World"
    }
    Input {
        placeholder = "Placeholder"
    }
    Input {
        defaultValue = "Disabled"
        disabled = true
    }
    Input {
        defaultValue = "Error"
        error = true
    }
}
