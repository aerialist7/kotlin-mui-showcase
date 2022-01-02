package example.showcase

import mui.material.Button
import mui.material.ButtonVariant
import mui.material.Drawer
import react.FC
import react.Props
import react.useState

val DrawersShowcase = FC<Props> {
    var isOpen by useState(false)

    Button {
        variant = ButtonVariant.outlined
        onClick = { isOpen = true }
        +"Open drawer"
    }

    Drawer {
        open = isOpen

        Button {
            variant = ButtonVariant.outlined
            onClick = { isOpen = false }
            +"Close drawer"
        }
    }
}
