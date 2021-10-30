package showcase

import mui.material.Chip
import react.Props
import react.ReactNode
import react.fc

val ChipShowcase = fc<Props> {
    Chip {
        attrs.label = ReactNode("Chip Filled")
    }
    Chip {
        attrs.label = ReactNode("Chip Outlined")
        attrs.variant = "outlined"
    }
}
