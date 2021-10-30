package showcase

import mui.material.Input
import react.Props
import react.fc

val InputShowcase = fc<Props> {
    Input {
        attrs.defaultValue = "Hello World"
    }
    Input {
        attrs.placeholder = "Placeholder"
    }
    Input {
        attrs.defaultValue = "Disabled"
        attrs.disabled = true
    }
    Input {
        attrs.defaultValue = "Error"
        attrs.error = true
    }
}
