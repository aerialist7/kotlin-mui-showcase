package showcase

import mui.material.Chip
import react.Props
import react.ReactNode
import react.fc

val Chip = fc<Props> {
    Chip {
        attrs.label = "Chip Filled".unsafeCast<ReactNode>() // TODO: [MUI]
    }
    Chip {
        attrs.label = "Chip Outlined".unsafeCast<ReactNode>() // TODO: [MUI]
        attrs.variant = "outlined"
    }
}