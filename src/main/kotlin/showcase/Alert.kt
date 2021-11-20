package showcase

import mui.material.Alert
import mui.material.AlertColor.*
import mui.material.AlertTitle
import mui.material.Button
import react.Props
import react.ReactNode
import react.createElement
import react.fc

val AlertShowcase = fc<Props> {
    Alert {
        attrs.severity = error
        AlertTitle { +"Error" }
        +"This is an error alert — check it out!"
    }
    Alert {
        attrs {
            severity = warning
        }
        AlertTitle { +"Warning" }
        +"This is an warning alert — check it out!"
    }
    Alert {
        attrs {
            severity = info
            color = "info"
            action = createElement(
                type = Button,
                children = arrayOf(ReactNode("Copy"))
            )
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
