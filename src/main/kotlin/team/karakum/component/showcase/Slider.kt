package team.karakum.component.showcase

import csstype.AlignItems
import csstype.px
import kotlinext.js.jso
import mui.icons.material.VolumeDown
import mui.icons.material.VolumeUp
import mui.material.Slider
import mui.material.Stack
import mui.material.StackDirection
import mui.system.ResponsiveStyleValue
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
        spacing = ResponsiveStyleValue(2)
        direction = ResponsiveStyleValue(StackDirection.row)

        VolumeDown()

        Slider {
            ariaLabel = "Volume"
            value = volume
            onChange = { _, newValue, _ -> volume = newValue }
        }

        VolumeUp()
    }

    Slider {
        ariaLabel = "Disabled slider"
        disabled = true
        defaultValue = 30
    }
}
