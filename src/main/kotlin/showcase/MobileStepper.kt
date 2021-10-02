package showcase

import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import mui.material.Button
import mui.material.MobileStepper
import mui.material.SxProps
import mui.material.Theme
import react.*

val MobileStepperShowcase = fc<Props> {
    MobileStepper {
        attrs {
            variant = "dots"
            steps = 3
            position = "static"
            activeStep = 1

            sx = jso<CSSProperties> {
                maxWidth = 400.px
                flexGrow = FlexGrow(1.0)
            }.unsafeCast<SxProps<Theme>>()

            nextButton = createElement(
                type = Button,
                props = jso { size = "small" },
                child = arrayOf(ReactNode("Next"))
            )
            backButton = createElement(
                type = Button,
                props = jso { size = "small" },
                child = arrayOf(ReactNode("Back"))
            )
        }
    }
}
