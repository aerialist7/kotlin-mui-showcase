package showcase

import mui.material.LinearProgress
import mui.material.LinearProgressColor
import mui.material.Stack
import mui.system.ResponsiveStyleValue
import react.FC
import react.Props

val LinearProgressShowcase = FC<Props> {
    Stack {
        // TODO: Unable to set `spacing` prop value correctly [MUI]
        spacing = 2.unsafeCast<ResponsiveStyleValue<Int>>()

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
