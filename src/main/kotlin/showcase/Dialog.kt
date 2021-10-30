package showcase

import mui.material.*
import react.Props
import react.dom.div
import react.dom.events.MouseEventHandler
import react.fc
import react.useState

val DialogShowcase = fc<Props> {
    var open by useState(false)

    val handleOpen: MouseEventHandler<*> = { open = true }
    val handleClose: MouseEventHandler<*> = { open = false }

    div {
        Button {
            attrs.variant = "outlined"
            attrs.onClick = handleOpen
            +"Open dialog"
        }

        Dialog {
            attrs.open = open
            attrs.onClose = handleClose

            DialogTitle {
                +"Subscribe"
            }
            DialogContent {
                DialogContentText {
                    +"To subscribe to this website, please click on 'subscribe' button"
                }
                DialogActions {
                    Button {
                        attrs.onClick = handleClose
                        +"Cancel"
                    }
                    Button {
                        attrs.onClick = handleClose
                        +"Subscribe"
                    }
                }
            }
        }
    }
}
