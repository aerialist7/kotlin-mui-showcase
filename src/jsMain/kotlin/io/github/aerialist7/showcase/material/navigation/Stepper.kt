package io.github.aerialist7.showcase.material.navigation

import mui.material.*
import mui.material.MobileStepperPosition.Companion.static
import mui.material.MobileStepperVariant.Companion.dots
import mui.system.sx
import react.FC
import react.Props
import react.create
import web.cssom.number
import web.cssom.pct
import web.cssom.px

val StepperShowcase = FC<Props> {
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
            variant = dots
            steps = 3
            position = static
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
