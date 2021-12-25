package showcase

import mui.material.Alert
import mui.material.AlertColor.*
import mui.material.AlertTitle
import mui.material.Button
import react.FC
import react.Props
import react.create

val AlertShowcase = FC<Props> {
    Alert {
        severity = error

        AlertTitle { +"Error" }
        +"This is an error alert — check it out!"
    }
    Alert {
        severity = warning

        AlertTitle { +"Warning" }
        +"This is an warning alert — check it out!"
    }
    Alert {
        severity = info
        color = "info"
        action = Button.create { +"Copy" }

        AlertTitle { +"Info" }
        +"This is an info alert — check it out!"
    }
    Alert {
        severity = success
        onClose = {}

        AlertTitle { +"Success" }
        +"This is an success alert — check it out!"
    }
}
