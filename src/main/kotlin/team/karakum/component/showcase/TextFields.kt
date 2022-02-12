package team.karakum.component.showcase

import csstype.Display
import csstype.JustifyContent
import kotlinx.js.jso
import mui.material.*
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML

val TextFieldsShowcase = FC<Props> {
    Box {
        sx = jso {
            display = Display.grid
            justifyContent = JustifyContent.left
        }
        component = ReactHTML.form
        // TODO: Unable to set `noValidate` & `autoComplete` props correctly [MUI]
        asDynamic().noValidate = true
        asDynamic().autoComplete = "off"

        Divider {
            variant = DividerVariant.fullWidth

            Chip {
                label = ReactNode("Text Fields")
            }
        }

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

        Divider {
            variant = DividerVariant.fullWidth

            Chip {
                label = ReactNode("Base Inputs")
            }
        }

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
}
