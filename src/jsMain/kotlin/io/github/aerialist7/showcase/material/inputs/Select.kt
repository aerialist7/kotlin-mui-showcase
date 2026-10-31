package io.github.aerialist7.showcase.material.inputs

import io.github.aerialist7.selectValue
import js.objects.unsafeJso
import mui.material.*
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.useState
import web.cssom.px
import web.dom.ElementId

val SelectShowcase = FC<Props> {
    var age by useState("10")

    Box {
        sx {
            minWidth = 120.px
        }
        FormControl {
            fullWidth = true
            InputLabel {
                id = ElementId("demo-simple-select-label")
                htmlFor = ElementId("demo-simple-select-input")
                +"Age"
            }
            Select {
                labelId = "demo-simple-select-label"
                id = ElementId("demo-simple-select")
                // MUI passes this id to the hidden native input, so the label can be associated with it.
                inputProps = unsafeJso { id = ElementId("demo-simple-select-input") }
                value = age
                label = ReactNode("Age")
                onChange = { event, _ ->
                    age = event.selectValue
                }
                MenuItem {
                    value = "10"
                    +"Ten"
                }
                MenuItem {
                    value = "20"
                    +"Twenty"
                }
                MenuItem {
                    value = "30"
                    +"Thirty"
                }
            }
        }
    }
}
