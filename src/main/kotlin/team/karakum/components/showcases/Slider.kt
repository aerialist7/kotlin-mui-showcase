package team.karakum.components.showcases

import csstype.AlignItems.Companion.center
import csstype.px
import mui.icons.material.VolumeDown
import mui.icons.material.VolumeUp
import mui.material.Slider
import mui.material.Stack
import mui.material.StackDirection.row
import mui.system.responsive
import mui.system.sx
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import react.useState

val SliderShowcase = FC<Props> {
    var volume by useState(30)

    Stack {
        sx {
            marginBottom = 1.px
            alignItems = center
        }
        spacing = responsive(2)
        direction = responsive(row)

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
        // TODO: Because `HTMLAttributes` are higher priority then `SliderUnstyledOwnProps`
        //  Details: Need a fix in wrappers
        asDynamic().defaultValue = 30
    }
}
