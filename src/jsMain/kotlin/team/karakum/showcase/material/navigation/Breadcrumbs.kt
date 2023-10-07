package team.karakum.showcase.material.navigation

import mui.material.Breadcrumbs
import mui.material.Link
import mui.material.LinkUnderline
import mui.material.Typography
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import team.karakum.color

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
            color = "text.primary"

            +"Breadcrumbs"
        }
    }
}
