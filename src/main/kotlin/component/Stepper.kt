package component

import csstype.pct
import kotlinext.js.jso
import mui.material.Box
import mui.material.Step
import mui.material.StepLabel
import mui.material.Stepper
import react.FC
import react.Props
import react.key

val StepperShowcase = FC<Props> {
    Box {
        sx = jso {
            width = 100.pct
        }
        Stepper {
            activeStep = 1
            alternativeLabel = true

            steps.map {
                Step {
                    key = it
                    StepLabel {
                        +it
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
