package showcase

import mui.material.Link
import react.Props
import react.fc

val LinkShowcase = fc<Props> {
    Link {
        attrs.href = "#"
        attrs.underline = "none"
        +"underline='none'"
    }
    Link {
        attrs.href = "#"
        attrs.underline = "hover"
        +"underline='hover'"
    }
    Link {
        attrs.href = "#"
        attrs.underline = "always"
        +"underline='always'"
    }
}
