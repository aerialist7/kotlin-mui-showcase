package showcase

import mui.material.BaseTextFieldProps
import mui.material.Box
import mui.material.TextField
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.form
import react.fc

val TextFieldShowcase = fc<Props> {
    Box {
        // TODO: Unable to set `noValidate` & `autoComplete` props correctly [MUI]
        attrs {
            component = form
            asDynamic().noValidate = true
            asDynamic().autoComplete = "off"
        }
        TextField {
            attrs {
                this as BaseTextFieldProps
                id = "outlined-basic"
                label = ReactNode("Outlined")
                variant = "outlined"
            }
        }
        TextField {
            attrs {
                this as BaseTextFieldProps
                id = "filled-basic"
                label = ReactNode("Filled")
                variant = "filled"
            }
        }
        TextField {
            attrs {
                this as BaseTextFieldProps
                id = "standard-basic"
                label = ReactNode("Standard")
                variant = "standard"
            }
        }
    }
}
