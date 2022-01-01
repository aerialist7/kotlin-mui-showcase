package showcase

import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.FC
import react.Props
import react.create

val MobileStepperShowcase = FC<Props> {
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
