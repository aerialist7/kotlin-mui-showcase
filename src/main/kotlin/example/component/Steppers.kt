package example.component

import csstype.FlexGrow
import csstype.pct
import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.FC
import react.Props
import react.create
import react.key

val SteppersShowcase = FC<Props> {
    Box {
        sx = jso { width = 100.pct }

        Stepper {
            activeStep = 1
            alternativeLabel = true

            steps.map {
                Step {
                    key = it
                    StepLabel { +it }
                }
            }
        }

        MobileStepper {
            variant = MobileStepperVariant.dots
            steps = 3
            position = MobileStepperPosition.static
            activeStep = 1

            sx = jso {
                maxWidth = 400.px
                flexGrow = FlexGrow(1.0)
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
