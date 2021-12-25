package showcase

import mui.material.Button
import react.FC
import react.Props

val ButtonShowcase = FC<Props> {
    Button {
        variant = "text"
        +"Text"
    }
    Button {
        variant = "contained"
        +"Contained"
    }
    Button {
        variant = "outlined"
        +"Outlined"
    }
}
