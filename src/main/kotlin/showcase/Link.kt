package showcase

import mui.material.Link
import react.Props
import react.fc

val LinkShowcase = fc<Props> {
    Link {
        // TODO: Unable to set href correctly [MUI]
        attrs.asDynamic().href = "#"
        attrs.underline = "none"
        +"underline='none'"
    }
    Link {
        // TODO: Unable to set href correctly [MUI]
        attrs.asDynamic().href = "#"
        attrs.underline = "hover"
        +"underline='hover'"
    }
    Link {
        // TODO: Unable to set href correctly [MUI]
        attrs.asDynamic().href = "#"
        attrs.underline = "always"
        +"underline='always'"
    }
}
