package example.showcase

import mui.material.Link
import mui.material.LinkUnderline
import mui.material.Typography
import react.FC
import react.Props

val LinksShowcase = FC<Props> {
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
