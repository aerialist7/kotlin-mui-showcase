package showcase

import mui.material.Input
import react.Props
import react.fc

val InputShowcase = fc<Props> {
    // TODO: Unable to use all InputProps [MUI]
    Input {
        attrs.asDynamic().defaultValue = "Hello World"
    }
    Input {
        attrs.asDynamic().placeholder = "Placeholder"
    }
    Input {
        attrs.asDynamic().defaultValue = "Disabled"
        attrs.asDynamic().disabled = true
    }
    Input {
        attrs.asDynamic().defaultValue = "Error"
        attrs.asDynamic().error = true
    }
}
