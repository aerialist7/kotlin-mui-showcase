package showcase

import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.Props
import react.ReactNode
import react.fc
import react.useState

val SelectShowcase = fc<Props> {
    var age by useState("10")

    Box {
        attrs.sx = jso {
            minWidth = 120.px
        }
        FormControl {
            attrs.fullWidth = true
            InputLabel {
                attrs.id = "demo-simple-select-label"
                +"Age"
            }
            Select<SelectProps<String>> {
                attrs {
                    labelId = "demo-simple-select-label"
                    id = "demo-simple-select"
                    value = age
                    label = ReactNode("Age")
                    onChange = {
                        // TODO: It doesn't work even with asDynamic. See console.log [MUI]
                        age = it.asDynamic().target.value
                    }
                }
                MenuItem {
                    attrs.value = "10"
                    +"Ten"
                }
                MenuItem {
                    attrs.value = "20"
                    +"Twenty"
                }
                MenuItem {
                    attrs.value = "30"
                    +"Thirty"
                }
            }
        }
    }
}
