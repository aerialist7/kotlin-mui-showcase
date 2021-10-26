package showcase

import mui.material.LinearProgress
import mui.material.Stack
import mui.system.ResponsiveStyleValue
import react.Props
import react.fc

val LinearProgressShowcase = fc<Props> {
    Stack {
        attrs.spacing = 2.unsafeCast<ResponsiveStyleValue<Int>>()
        LinearProgress { attrs.color = "secondary" }
        LinearProgress { attrs.color = "success" }
        LinearProgress { attrs.color = "inherit" }
    }
}
