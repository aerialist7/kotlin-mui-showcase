package showcase

import mui.material.*
import react.Props
import react.dom.div
import react.fc
import react.useState

val DialogShowcase = fc<Props> {
    var open by useState(false)

    val handleOpen = { open = true }
    val handleClose = { open = false }

    div {

        Button {
            attrs.variant = "outlined"
            // TODO: No possibility to legally set 'onClick' props [MUI]
            attrs.asDynamic().onClick = handleOpen
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
                        // TODO: No possibility to legally set 'onClick' props [MUI]
                        attrs.asDynamic().onClick = handleClose
                        +"Cancel"
                    }
                    Button {
                        // TODO: No possibility to legally set 'onClick' props [MUI]
                        attrs.asDynamic().onClick = handleClose
                        +"Subscribe"
                    }
                }
            }
        }
    }
}
