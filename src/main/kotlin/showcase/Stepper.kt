package showcase

import csstype.pct
import kotlinext.js.jso
import mui.material.Box
import mui.material.Step
import mui.material.StepLabel
import mui.material.Stepper
import react.Props
import react.fc
import react.key

val StepperShowcase = fc<Props> {
    Box {
        attrs.sx = jso {
            width = 100.pct
        }
        Stepper {
            attrs {
                activeStep = 1
                alternativeLabel = true
            }
            steps.map { label ->
                Step {
                    attrs.key = label
                    StepLabel {
                        +label
                    }
                }
            }
        }
    }
}

private val steps = listOf(
    "Select master blaster campaign settings",
    "Create an ad group",
    "Create an ad",
)
