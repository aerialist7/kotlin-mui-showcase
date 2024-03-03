package team.karakum.showcase.material.utils

import mui.material.Box
import mui.system.BoxProps
import mui.system.sx
import react.FC
import web.cssom.Display
import web.cssom.JustifyContent
import web.cssom.px

val ShowcaseContainer = FC<BoxProps> { props ->
    Box {
        sx {
            display = Display.flex
            justifyContent = JustifyContent.left
            gap = 8.px
        }

        +props
    }
}
