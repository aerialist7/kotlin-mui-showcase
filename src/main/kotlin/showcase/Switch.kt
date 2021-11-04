package showcase

import mui.material.Switch
import react.Props
import react.dom.html.ReactHTML.div
import react.fc

val SwitchShowcase = fc<Props> {
    div {
        Switch {
            attrs.defaultChecked = true
        }
        Switch {}
        Switch {
            attrs.disabled = true
            attrs.defaultChecked = true
        }
        Switch {
            attrs.disabled = true
        }
    }
}
