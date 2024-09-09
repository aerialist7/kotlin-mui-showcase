package io.github.aerialist7.showcase.material.inputs

import mui.material.Switch
import react.FC
import react.Props
import react.dom.html.ReactHTML.div

val SwitchShowcase = FC<Props> {
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
    }
}
