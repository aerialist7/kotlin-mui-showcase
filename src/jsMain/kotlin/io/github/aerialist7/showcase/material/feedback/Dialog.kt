package io.github.aerialist7.showcase.material.feedback

import mui.material.*
import mui.material.ButtonVariant.Companion.outlined
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.useState

val DialogShowcase = FC<Props> {
    var isOpen by useState(false)

    div {
        Button {
            variant = outlined
            onClick = { isOpen = true }
            +"Open dialog"
        }

        Dialog {
            open = isOpen
            onClose = { _, _ -> isOpen = false }

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
