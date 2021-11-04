package showcase

import mui.material.IconButton
import mui.material.SpeedDialIcon
import mui.material.Tooltip
import react.Props
import react.ReactNode
import react.fc

val TooltipShowcase = fc<Props> {
    Tooltip {
        attrs.title = ReactNode("Speed Dial")
        IconButton {
            SpeedDialIcon {}
        }
    }
}
