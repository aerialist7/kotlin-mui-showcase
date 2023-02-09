package team.karakum.components.showcases

import csstype.Display
import csstype.JustifyContent
import js.core.jso
import mui.material.*
import mui.material.DividerVariant.fullWidth
import mui.material.FormControlVariant.*
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.create
import react.dom.html.ReactHTML.form
import team.karakum.common.InputProps
import team.karakum.common.autoComplete
import team.karakum.common.noValidate
import web.html.InputType

val TextFieldsShowcase = FC<Props> {
    Box {
        sx {
            display = Display.grid
            justifyContent = JustifyContent.left
        }
        component = form
        noValidate = true
        autoComplete = "off"

        Divider {
            variant = fullWidth

            Chip {
                label = ReactNode("Text Fields")
            }
        }

        TextField {
            id = "outlined-basic"
            label = ReactNode("Outlined")
            variant = outlined
        }
        TextField {
            id = "filled-basic"
            label = ReactNode("Filled")
            variant = filled
        }
        TextField {
            id = "standard-basic"
            label = ReactNode("Standard")
            variant = standard
        }
        TextField {
            id = "type-date"
            label = ReactNode("Start Day")
            variant = outlined
            type = InputType.date
        }

        Divider {
            variant = fullWidth

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

        Divider {
            variant = fullWidth

            Chip {
                label = ReactNode("Input Adornments")
            }
        }

        TextField {
            id = "outlined-start-adornment"
            label = ReactNode("With normal TextField")
            InputProps = jso {
                startAdornment = InputAdornment.create {
                    position = InputAdornmentPosition.start
                    +"kg"
                }
            }
        }
    }
}
