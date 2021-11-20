package showcase

import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import mui.material.Button
import mui.material.MobileStepper
import react.Props
import react.ReactNode
import react.createElement
import react.fc

val MobileStepperShowcase = fc<Props> {
    MobileStepper {
        attrs {
            variant = "dots"
            steps = 3
            position = "static"
            activeStep = 1

            sx = jso {
                maxWidth = 400.px
                flexGrow = FlexGrow(1.0)
            }

            nextButton = createElement(
                type = Button,
                props = jso { size = "small" },
                children = arrayOf(ReactNode("Next"))
            )
            backButton = createElement(
                type = Button,
                props = jso { size = "small" },
                children = arrayOf(ReactNode("Back"))
            )
        }
    }
}
