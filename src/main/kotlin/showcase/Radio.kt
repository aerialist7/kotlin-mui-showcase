package showcase

import mui.material.*
import react.FC
import react.Props
import react.ReactNode
import react.createElement
import react.dom.aria.ariaLabel

val RadioShowcase = FC<Props> {
    FormControl {
        // TODO: Unable to se `component` prop correctly [MUI]
        asDynamic().component = "fieldset"
        FormLabel {
            asDynamic().component = "legend"
            +"Gender"
        }
        RadioGroup {
            ariaLabel = "gender"
            defaultValue = "female"
            name = "radio-buttons-group"

            FormControlLabel {
                value = "female"
                control = createElement(Radio)
                label = ReactNode("Female")
            }
            FormControlLabel {
                value = "male"
                control = createElement(Radio)
                label = ReactNode("Male")
            }
            FormControlLabel {
                value = "other"
                control = createElement(Radio)
                label = ReactNode("Other")
            }
        }
    }
}
