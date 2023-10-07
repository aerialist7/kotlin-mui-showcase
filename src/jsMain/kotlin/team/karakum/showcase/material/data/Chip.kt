package team.karakum.showcase.material.data

import mui.material.Chip
import mui.material.ChipVariant.Companion.outlined
import react.FC
import react.Props
import react.ReactNode

val ChipShowcase = FC<Props> {
    Chip {
        label = ReactNode("Chip Filled")
    }
    Chip {
        label = ReactNode("Chip Outlined")
        variant = outlined
    }
}
