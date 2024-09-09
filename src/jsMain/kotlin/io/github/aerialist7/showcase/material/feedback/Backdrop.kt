package io.github.aerialist7.showcase.material.feedback

import mui.material.Backdrop
import mui.material.Button
import mui.material.CircularProgress
import mui.material.CircularProgressColor
import mui.system.sx
import react.FC
import react.Props
import react.useState
import web.cssom.Color
import web.cssom.integer

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
