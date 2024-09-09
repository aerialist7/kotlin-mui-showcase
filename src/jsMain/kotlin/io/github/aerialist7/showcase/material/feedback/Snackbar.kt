package io.github.aerialist7.showcase.material.feedback

import mui.material.Snackbar
import mui.material.Typography
import react.FC
import react.Props
import react.ReactNode

val SnackbarShowcase = FC<Props> {
    Typography {
        +"Find me in a bottom-left corner"
    }
    Snackbar {
        open = true
        autoHideDuration = 6000
        message = ReactNode("Note archived")
    }
}
