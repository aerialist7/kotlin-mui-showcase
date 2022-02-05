package team.karakum.component.showcase

import mui.material.LinearProgress
import mui.material.LinearProgressColor
import mui.material.Stack
import mui.system.ResponsiveStyleValue
import react.FC
import react.Props

// TODO: Add other progresses
val ProgressShowcase = FC<Props> {
    Stack {
        spacing = ResponsiveStyleValue(2)

        LinearProgress {
            color = LinearProgressColor.secondary
        }
        LinearProgress {
            color = LinearProgressColor.success
        }
        LinearProgress {
            color = LinearProgressColor.inherit
        }
    }
}
