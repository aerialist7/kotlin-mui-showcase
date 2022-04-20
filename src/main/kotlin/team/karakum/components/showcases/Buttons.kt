package team.karakum.components.showcases

import mui.material.Button
import mui.material.ButtonVariant.*
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
