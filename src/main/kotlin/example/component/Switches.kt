package example.component

import mui.icons.material.AirplanemodeActive
import mui.icons.material.AirplanemodeInactive
import mui.material.Switch
import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML.div

val SwitchesShowcase = FC<Props> {
    div {
        Switch {
            defaultChecked = true
        }
        Switch {
        }
        Switch {
            disabled = true
            defaultChecked = true
        }
        Switch {
            disabled = true
        }
        Switch {
            icon = AirplanemodeInactive.create()
            checkedIcon = AirplanemodeActive.create()
        }
    }
}
