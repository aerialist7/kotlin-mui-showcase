package showcase

import mui.material.Link
import mui.material.Typography
import react.Props
import react.fc

val LinkShowcase = fc<Props> {
    Link {
        attrs.href = "#"
        attrs.underline = "none"
        Typography { +"underline='none'" }
    }
    Link {
        attrs.href = "#"
        attrs.underline = "hover"
        Typography { +"underline='hover'" }
    }
    Link {
        attrs.href = "#"
        attrs.underline = "always"
        Typography { +"underline='always'" }
    }
}
