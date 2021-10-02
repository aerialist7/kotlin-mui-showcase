package showcase

import mui.material.Button
import mui.material.Drawer
import react.Props
import react.fc
import react.useState

val DrawerShowcase = fc<Props> {
    var open by useState(false)

    val handleOpen = { open = true }
    val handleClose = { open = false }

    Button {
        attrs.variant = "outlined"
        // TODO: No possibility to legally set 'onClick' props [MUI]
        attrs.asDynamic().onClick = handleOpen
        +"Open drawer"
    }

    Drawer {
        attrs.open = open

        Button {
            attrs.variant = "outlined"
            // TODO: No possibility to legally set 'onClick' props [MUI]
            attrs.asDynamic().onClick = handleClose
            +"Close drawer"
        }
    }
}