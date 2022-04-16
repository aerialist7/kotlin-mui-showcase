package team.karakum.components.showcases

import mui.material.Chip
import mui.material.ChipVariant
import react.FC
import react.Props
import react.ReactNode

val ChipsShowcase = FC<Props> {
    Chip {
        label = ReactNode("Chip Filled")
    }
    Chip {
        label = ReactNode("Chip Outlined")
        variant = ChipVariant.outlined
    }
}
