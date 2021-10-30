package showcase

import mui.material.*
import react.Props
import react.ReactNode
import react.createElement
import react.dom.aria.ariaLabel
import react.fc

val RadioShowcase = fc<Props> {
    FormControl {
        // TODO: Unable to se `component` prop correctly [MUI]
        attrs.asDynamic().component = "fieldset"
        FormLabel {
            attrs.asDynamic().component = "legend"
            +"Gender"
        }
        RadioGroup {
            attrs {
                ariaLabel = "gender"
                defaultValue = "female"
                name = "radio-buttons-group"
            }
            FormControlLabel {
                attrs {
                    value = "female"
                    control = createElement(Radio)
                    label = ReactNode("Female")
                }
            }
            FormControlLabel {
                attrs {
                    value = "male"
                    control = createElement(Radio)
                    label = ReactNode("Male")
                }
            }
            FormControlLabel {
                attrs {
                    value = "other"
                    control = createElement(Radio)
                    label = ReactNode("Other")
                }
            }
        }
    }
}
