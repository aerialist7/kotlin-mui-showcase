package team.karakum.components.showcases

import mui.material.Button
import mui.material.ButtonVariant.Companion.contained
import mui.material.ButtonVariant.Companion.outlined
import mui.material.ButtonVariant.Companion.text
import react.FC
import react.Props

val ButtonsShowcase = FC<Props> {
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
