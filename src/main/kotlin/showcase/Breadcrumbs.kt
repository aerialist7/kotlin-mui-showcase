package showcase

import mui.material.Breadcrumbs
import mui.material.Link
import mui.material.Typography
import react.Props
import react.dom.aria.ariaLabel
import react.fc

val BreadcrumbsShowcase = fc<Props> {
    Breadcrumbs {
        attrs.ariaLabel = "breadcrumb"

        Link {
            attrs {
                underline = "hover"
                color = "inherit"
                href = "/"
            }
            +"MUI"
        }
        Link {
            attrs {
                underline = "hover"
                color = "inherit"
                href = "/getting-started/installation/"
            }
            +"Core"
        }
        Typography {
            // TODO: Unable to set `color` prop correctly [MUI]
            attrs.asDynamic().color = "text.primary"
            +"Breadcrumbs"
        }
    }
}
