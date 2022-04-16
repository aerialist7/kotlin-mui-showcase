package team.karakum.components.showcases

import csstype.number
import csstype.pct
import csstype.px
import mui.material.*
import mui.system.sx
import react.FC
import react.Props
import react.create
import react.key

val SteppersShowcase = FC<Props> {
    Box {
        sx { width = 100.pct }

        Stepper {
            activeStep = 1
            alternativeLabel = true

            for (step in steps) {
                Step {
                    key = step
                    StepLabel { +step }
                }
            }
        }

        MobileStepper {
            variant = MobileStepperVariant.dots
            steps = 3
            position = MobileStepperPosition.static
            activeStep = 1

            sx {
                maxWidth = 400.px
                flexGrow = number(1.0)
            }

            nextButton = Button.create {
                size = Size.small
                +"Next"
            }
            backButton = Button.create {
                size = Size.small
                +"Back"
            }
        }
    }
}

private val steps = listOf(
    "Select master blaster campaign settings",
    "Create an ad group",
    "Create an ad",
)
