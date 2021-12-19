package component

import mui.material.Link
import mui.material.Typography
import react.FC
import react.Props

val LinkShowcase = FC<Props> {
    Link {
        href = "#"
        underline = "none"
        Typography { +"underline='none'" }
    }
    Link {
        href = "#"
        underline = "hover"
        Typography { +"underline='hover'" }
    }
    Link {
        href = "#"
        underline = "always"
        Typography { +"underline='always'" }
    }
}
