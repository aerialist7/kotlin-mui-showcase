package showcase

import mui.material.Fab
import mui.material.SpeedDialIcon
import react.FC
import react.Props

val FabShowcase = FC<Props> {
    Fab {
        color = "primary"
        // TODO: No ability to use `AddIcon` from [MUI]
        SpeedDialIcon()
    }
}
