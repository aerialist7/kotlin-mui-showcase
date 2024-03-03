package team.karakum.showcase.material.utils

import mui.material.Box
import mui.system.sx
import react.FC
import react.PropsWithChildren
import web.cssom.Display
import web.cssom.JustifyContent
import web.cssom.em

val ShowcaseBox = FC<PropsWithChildren> { props ->
    Box {
        sx {
            display = Display.flex
            justifyContent = JustifyContent.left
            gap = 1.em
        }

        +props.children
    }
}
