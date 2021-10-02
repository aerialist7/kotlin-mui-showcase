package showcase

import mui.material.Fab
import mui.material.SpeedDialIcon
import react.Props
import react.fc

val FabShowcase = fc<Props> {
    Fab {
        attrs.color = "primary"
        // TODO: No ability to use AddIcon from [MUI]
        SpeedDialIcon {}
    }
}
