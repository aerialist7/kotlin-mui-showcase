package showcase

import mui.material.Button
import mui.material.Drawer
import react.Props
import react.fc
import react.useState

val DrawerShowcase = fc<Props> {
    var open by useState(false)

    Button {
        attrs.variant = "outlined"
        attrs.onClick = { open = true }
        +"Open drawer"
    }

    Drawer {
        attrs.open = open

        Button {
            attrs.variant = "outlined"
            attrs.onClick = { open = false }
            +"Close drawer"
        }
    }
}
