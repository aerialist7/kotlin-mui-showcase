package io.github.aerialist7.showcase.material.feedback

import mui.material.LinearProgress
import mui.material.LinearProgressColor
import mui.material.Stack
import mui.system.responsive
import react.FC
import react.Props

// TODO: Add other progresses
val ProgressShowcase = FC<Props> {
    Stack {
        spacing = responsive(2)

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
