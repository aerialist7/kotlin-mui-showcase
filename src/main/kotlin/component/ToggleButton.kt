package component

import mui.material.*
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import react.useState

// TODO: Unable to use [MUI] icon components
val ToggleButtonShowcase = FC<Props> {
    var alignment by useState("left")

    ToggleButtonGroup {
        value = alignment
        exclusive = true
        onChange = { _, newAlignment -> alignment = newAlignment }
        ariaLabel = "text alignment"

        ToggleButton {
            value = "left"
            ariaLabel = "left aligned"
        }
        ToggleButton {
            value = "center"
            ariaLabel = "centered"

            SpeedDialIcon()
        }
        ToggleButton {
            value = "right"
            ariaLabel = "right aligned"

            ListItemIcon()
        }
        ToggleButton {
            value = "justify"
            ariaLabel = "justified"
            disabled = true

            SvgIcon()
        }
    }
}
