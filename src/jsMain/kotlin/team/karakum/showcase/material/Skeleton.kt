package team.karakum.showcase.material

import mui.material.Skeleton
import mui.material.SkeletonVariant.Companion.circular
import mui.material.SkeletonVariant.Companion.rectangular
import mui.material.SkeletonVariant.Companion.text
import react.FC
import react.Props

val SkeletonShowcase = FC<Props> {
    Skeleton {
        variant = text
        width = 210
    }
    Skeleton {
        variant = circular
        width = 40
        height = 40
    }
    Skeleton {
        variant = rectangular
        width = 210
        height = 118
    }
}
