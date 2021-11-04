package showcase

import mui.material.*
import react.Props
import react.dom.aria.ariaLabel
import react.fc
import react.useState

// TODO: Unable to use [MUI] icon components
val ToggleButtonShowcase = fc<Props> {
    var alignment by useState("left")

    ToggleButtonGroup {
        attrs {
            value = alignment
            exclusive = true
            onChange = { _, newAlignment -> alignment = newAlignment }
            ariaLabel = "text alignment"
        }

        ToggleButton {
            attrs {
                value = "left"
                ariaLabel = "left aligned"
            }
        }
        ToggleButton {
            attrs {
                value = "center"
                ariaLabel = "centered"
            }
            SpeedDialIcon {}
        }
        ToggleButton {
            attrs {
                value = "right"
                ariaLabel = "right aligned"
            }
            ListItemIcon {}
        }
        ToggleButton {
            attrs {
                value = "justify"
                ariaLabel = "justified"
                disabled = true
            }
            SvgIcon {}
        }
    }
}
