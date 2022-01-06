package example.component

import csstype.AlignItems
import csstype.px
import kotlinext.js.jso
import mui.icons.material.VolumeDown
import mui.icons.material.VolumeUp
import mui.material.Slider
import mui.material.Stack
import mui.system.ResponsiveStyleValue
import mui.system.Union
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import react.useState

val SliderShowcase = FC<Props> {
    var volume by useState(30)

    Stack {
        sx = jso {
            marginBottom = 1.px
            alignItems = AlignItems.center
        }
        // TODO: Unable to use `spacing` prop value correctly [MUI]
        spacing = 2.unsafeCast<ResponsiveStyleValue<dynamic>>()
        // TODO: Unable to use `direction` prop value correctly [MUI]
        direction = "row".unsafeCast<ResponsiveStyleValue<Union>>()

        VolumeDown()

        Slider {
            ariaLabel = "Volume"
            // TODO: `value` shouldn't be dynamic [MUI]
            value = volume
            onChange = { _, newValue, _ -> volume = newValue }
        }

        VolumeUp()
    }

    Slider {
        ariaLabel = "Disabled slider"
        disabled = true
        // TODO: `defaultValue` shouldn't be dynamic [MUI]
        defaultValue = 30
    }
}
