package team.karakum.showcase.material.inputs

import mui.material.Box
import mui.material.Button
import mui.material.ButtonVariant.Companion.contained
import mui.material.ButtonVariant.Companion.outlined
import mui.material.ButtonVariant.Companion.text
import mui.system.sx
import react.FC
import react.Props
import web.cssom.Display
import web.cssom.JustifyContent
import web.cssom.em

val ButtonShowcase = FC<Props> {
    Box {
        sx {
            display = Display.flex
            justifyContent = JustifyContent.left
            gap = 1.em
        }

        Button {
            variant = text
            +"Text"
        }
        Button {
            variant = contained
            +"Contained"
        }
        Button {
            variant = outlined
            +"Outlined"
        }
    }
}
