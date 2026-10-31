package io.github.aerialist7.showcase.material.feedback

import io.github.aerialist7.muiZIndex
import mui.material.Backdrop
import mui.material.Button
import mui.material.CircularProgress
import mui.material.CircularProgressColor
import mui.material.styles.Theme
import mui.material.styles.useTheme
import mui.system.sx
import react.FC
import react.Props
import react.useState
import web.cssom.Color
import web.cssom.integer

val BackdropShowcase = FC<Props> {
    val theme = useTheme<Theme>()
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
            zIndex = integer(theme.muiZIndex().drawer.toInt() + 1)
        }

        CircularProgress {
            color = CircularProgressColor.inherit
        }
    }
}
