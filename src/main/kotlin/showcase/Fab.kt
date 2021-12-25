package showcase

import mui.icons.material.Add
import mui.material.Fab
import react.FC
import react.Props

val FabShowcase = FC<Props> {
    Fab {
        color = "primary"

        Add()
    }
}
