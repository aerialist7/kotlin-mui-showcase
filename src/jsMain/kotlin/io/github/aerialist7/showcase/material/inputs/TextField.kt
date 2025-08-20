package io.github.aerialist7.showcase.material.inputs

import io.github.aerialist7.InputProps
import io.github.aerialist7.autoComplete
import io.github.aerialist7.noValidate
import js.objects.unsafeJso
import mui.material.*
import mui.material.DividerVariant.Companion.fullWidth
import mui.material.FormControlVariant.Companion.filled
import mui.material.FormControlVariant.Companion.outlined
import mui.material.FormControlVariant.Companion.standard
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.create
import react.dom.html.ReactHTML.form
import web.cssom.Display
import web.cssom.JustifyContent
import web.cssom.px
import web.dom.ElementId
import web.html.InputType
import web.html.date

val TextFieldShowcase = FC<Props> {
    Box {
        sx {
            display = Display.grid
            justifyContent = JustifyContent.left
            gap = 8.px
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
            id = ElementId("outlined-basic")
            label = ReactNode("Outlined")
            variant = outlined
        }
        TextField {
            id = ElementId("filled-basic")
            label = ReactNode("Filled")
            variant = filled
        }
        TextField {
            id = ElementId("standard-basic")
            label = ReactNode("Standard")
            variant = standard
        }
        TextField {
            id = ElementId("type-date")
            label = ReactNode("Start Day")
            variant = outlined
            type = InputType.date

            InputLabelProps = unsafeJso { shrink = true }
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
            id = ElementId("outlined-start-adornment")
            label = ReactNode("With normal TextField")
            InputProps = unsafeJso {
                startAdornment = InputAdornment.create {
                    position = InputAdornmentPosition.start
                    +"kg"
                }
            }
        }
    }
}
