package team.karakum.component.showcase

import mui.material.Button
import mui.material.ButtonVariant
import react.FC
import react.Props

val ButtonsShowcase = FC<Props> {
    Button {
        variant = ButtonVariant.text
        +"Text"
    }
    Button {
        variant = ButtonVariant.contained
        +"Contained"
    }
    Button {
        variant = ButtonVariant.outlined
        +"Outlined"
    }
}
