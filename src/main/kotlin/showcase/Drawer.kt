package showcase

import mui.material.Button
import mui.material.Drawer
import react.FC
import react.Props
import react.useState

val DrawerShowcase = FC<Props> {
    var isOpen by useState(false)

    Button {
        variant = "outlined"
        onClick = { isOpen = true }
        +"Open drawer"
    }

    Drawer {
        open = isOpen

        Button {
            variant = "outlined"
            onClick = { isOpen = false }
            +"Close drawer"
        }
    }
}
