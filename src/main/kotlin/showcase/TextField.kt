package showcase

import mui.material.Box
import mui.material.FormControlVariant
import mui.material.TextField
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.form

val TextFieldShowcase = FC<Props> {
    Box {
        component = form
        // TODO: Unable to set `noValidate` & `autoComplete` props correctly [MUI]
        asDynamic().noValidate = true
        asDynamic().autoComplete = "off"

        TextField {
            id = "outlined-basic"
            label = ReactNode("Outlined")
            variant = FormControlVariant.outlined
        }
        TextField {
            id = "filled-basic"
            label = ReactNode("Filled")
            variant = FormControlVariant.filled
        }
        TextField {
            id = "standard-basic"
            label = ReactNode("Standard")
            variant = FormControlVariant.standard
        }
    }
}
