package showcase

import mui.material.Skeleton
import react.Props
import react.fc

val SkeletonShowcase = fc<Props> {
    Skeleton {
        attrs {
            variant = "text"
            width = 210
        }
    }
    Skeleton {
        attrs {
            variant = "circular"
            width = 40
            height = 40
        }
    }
    Skeleton {
        attrs {
            variant = "rectangular"
            width = 210
            height = 118
        }
    }
}
