package showcase

import csstype.Color
import mui.icons.material.Add
import mui.material.Fab
import react.FC
import react.Props

val FabShowcase = FC<Props> {
    Fab {
        // TODO: Should be union [MUI]
        color = Color("primary")

        Add()
    }
}
