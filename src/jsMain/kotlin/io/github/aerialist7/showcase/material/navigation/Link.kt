package io.github.aerialist7.showcase.material.navigation

import mui.material.Link
import mui.material.LinkUnderline
import mui.material.Typography
import react.FC
import react.Props

val LinkShowcase = FC<Props> {
    Link {
        href = "#"
        underline = LinkUnderline.none
        Typography { +"underline='none'" }
    }
    Link {
        href = "#"
        underline = LinkUnderline.hover
        Typography { +"underline='hover'" }
    }
    Link {
        href = "#"
        underline = LinkUnderline.always
        Typography { +"underline='always'" }
    }
}
