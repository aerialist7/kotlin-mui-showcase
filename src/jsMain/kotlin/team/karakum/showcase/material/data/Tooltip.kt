package team.karakum.showcase.material.data

import mui.material.IconButton
import mui.material.SpeedDialIcon
import mui.material.Tooltip
import react.FC
import react.Props
import react.ReactNode

val TooltipShowcase = FC<Props> {
    Tooltip {
        title = ReactNode("Speed Dial")

        IconButton {
            SpeedDialIcon()
        }
    }
}
