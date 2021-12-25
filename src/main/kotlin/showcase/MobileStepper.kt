package showcase

import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import mui.material.Button
import mui.material.MobileStepper
import react.FC
import react.Props
import react.create

val MobileStepperShowcase = FC<Props> {
    MobileStepper {
        variant = "dots"
        steps = 3
        position = "static"
        activeStep = 1

        sx = jso {
            maxWidth = 400.px
            flexGrow = FlexGrow(1.0)
        }

        nextButton = Button.create {
            size = "small"
            +"Next"
        }
        backButton = Button.create {
            size = "small"
            +"Back"
        }
    }
}
