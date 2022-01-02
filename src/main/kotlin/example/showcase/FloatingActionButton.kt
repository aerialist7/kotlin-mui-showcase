package example.showcase

import csstype.Color
import mui.icons.material.Add
import mui.material.Fab
import react.FC
import react.Props

val FloatingActionButtonShowcase = FC<Props> {
    Fab {
        // TODO: Should be union [MUI]
        color = Color("primary")

        Add()
    }
}
