package showcase

import mui.material.Alert
import mui.material.AlertColor.*
import mui.material.AlertTitle
import react.Props
import react.fc

val Alert = fc<Props> {
    Alert {
        attrs.severity = error
        AlertTitle { +"Error" }
        +"This is an error alert — check it out!"
    }
    Alert {
        attrs {
            severity = warning
            // TODO: Unable to use correct value [MUI]
            // color = info
        }
        AlertTitle { +"Warning" }
        +"This is an warning alert — check it out!"
    }
    Alert {
        attrs {
            severity = info
            // TODO: Unable to use [MUI] components here
            // action = Button()
        }
        AlertTitle { +"Info" }
        +"This is an info alert — check it out!"
    }
    Alert {
        attrs {
            severity = success
            onClose = {}
        }
        AlertTitle { +"Success" }
        +"This is an success alert — check it out!"
    }
}
