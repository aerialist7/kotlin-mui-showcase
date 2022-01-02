package example.component

import mui.material.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.useState

val DialogsShowcase = FC<Props> {
    var isOpen by useState(false)

    div {
        Button {
            variant = ButtonVariant.outlined
            onClick = { isOpen = true }
            +"Open dialog"
        }

        Dialog {
            open = isOpen
            onClose = { isOpen = false }

            DialogTitle {
                +"Subscribe"
            }
            DialogContent {
                DialogContentText {
                    +"To subscribe to this website, please click on 'subscribe' button"
                }
                DialogActions {
                    Button {
                        onClick = { isOpen = false }
                        +"Cancel"
                    }
                    Button {
                        onClick = { isOpen = false }
                        +"Subscribe"
                    }
                }
            }
        }
    }
}
