package showcase

import mui.material.Snackbar
import mui.material.Typography
import react.Props
import react.ReactNode
import react.fc

val SnackbarShowcase = fc<Props> {
    Typography {
        +"Find me in a bottom-left corner"
    }
    Snackbar {
        attrs {
            open = true
            autoHideDuration = 6000
            message = ReactNode("Note archived")
        }
    }
}
