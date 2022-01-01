package showcase

import mui.material.Skeleton
import mui.material.SkeletonVariant
import react.FC
import react.Props

val SkeletonShowcase = FC<Props> {
    Skeleton {
        variant = SkeletonVariant.text
        width = 210
    }
    Skeleton {
        variant = SkeletonVariant.circular
        width = 40
        height = 40
    }
    Skeleton {
        variant = SkeletonVariant.rectangular
        width = 210
        height = 118
    }
}
