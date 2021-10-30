package showcase

import csstype.Color
import csstype.ZIndex
import kotlinext.js.jso
import mui.material.Backdrop
import mui.material.Button
import mui.material.CircularProgress
import react.Props
import react.fc
import react.useState

val BackdropShowcase = fc<Props> {
    var open by useState(false)

    Button {
        attrs.onClick = { open = !open }
        +"Show backdrop"
    }
    Backdrop {
        attrs.sx = jso {
            color = Color("#FFFFFF")
            zIndex = ZIndex(1000)
        }
        attrs.open = open
        attrs.onClick = { open = false }
        CircularProgress {
            attrs.color = "inherit"
        }
    }
}
