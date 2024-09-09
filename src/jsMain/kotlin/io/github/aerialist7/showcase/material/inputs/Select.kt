package io.github.aerialist7.showcase.material.inputs

import mui.material.*
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.useState
import web.cssom.px

val SelectShowcase = FC<Props> {
    var age by useState("10")

    Box {
        sx {
            minWidth = 120.px
        }
        FormControl {
            fullWidth = true
            InputLabel {
                id = "demo-simple-select-label"
                +"Age"
            }
            Select {
                labelId = "demo-simple-select-label"
                id = "demo-simple-select"
                value = age
                label = ReactNode("Age")
                onChange = { event, _ ->
                    age = event.target.value
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
