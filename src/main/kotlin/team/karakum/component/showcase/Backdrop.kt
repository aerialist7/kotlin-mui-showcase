package team.karakum.component.showcase

import csstype.Color
import csstype.integer
import mui.material.Backdrop
import mui.material.Button
import mui.material.CircularProgress
import mui.material.CircularProgressColor
import mui.system.sx
import react.FC
import react.Props
import react.useState

val BackdropShowcase = FC<Props> {
    var isOpen by useState(false)

    Button {
        onClick = { isOpen = !isOpen }

        +"Show backdrop"
    }
    Backdrop {
        open = isOpen
        onClick = { isOpen = false }
        sx {
            color = Color("#FFFFFF")
            zIndex = integer(1000)
        }

        CircularProgress {
            color = CircularProgressColor.inherit
        }
    }
}
