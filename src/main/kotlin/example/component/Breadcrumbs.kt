package example.component

import mui.material.Breadcrumbs
import mui.material.Link
import mui.material.LinkUnderline
import mui.material.Typography
import react.FC
import react.Props
import react.dom.aria.ariaLabel

val BreadcrumbsShowcase = FC<Props> {
    Breadcrumbs {
        ariaLabel = "breadcrumb"

        Link {
            underline = LinkUnderline.hover
            color = "inherit"
            href = "/"

            +"MUI"
        }
        Link {
            underline = LinkUnderline.hover
            color = "inherit"
            href = "/getting-started/installation/"

            +"Core"
        }
        Typography {
            // TODO: Unable to set `color` prop correctly [MUI]
            asDynamic().color = "text.primary"

            +"Breadcrumbs"
        }
    }
}
