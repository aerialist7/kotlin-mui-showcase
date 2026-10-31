package io.github.aerialist7.showcase.material.inputs

import io.github.aerialist7.autoComplete
import io.github.aerialist7.noValidate
import io.github.aerialist7.slotProps
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

private val INPUT_LABEL: InputBaseComponentProps = unsafeJso { ariaLabel = "description" }

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

            val labelProps = unsafeJso<InputLabelProps> { shrink = true }
            slotProps = unsafeJso { inputLabel = labelProps }
        }

        Divider {
            variant = fullWidth

            Chip {
                label = ReactNode("Base Inputs")
            }
        }

        Input {
            id = ElementId("input-default")
            defaultValue = "Hello World"
            inputProps = INPUT_LABEL
        }
        Input {
            id = ElementId("input-placeholder")
            placeholder = "Placeholder"
            inputProps = INPUT_LABEL
        }
        Input {
            id = ElementId("input-disabled")
            defaultValue = "Disabled"
            inputProps = INPUT_LABEL
            disabled = true
        }
        Input {
            id = ElementId("input-error")
            defaultValue = "Error"
            inputProps = INPUT_LABEL
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
            slotProps = unsafeJso {
                input = unsafeJso {
                    startAdornment = InputAdornment.create {
                        position = InputAdornmentPosition.start
                        +"kg"
                    }
                }
            }
        }
    }
}
