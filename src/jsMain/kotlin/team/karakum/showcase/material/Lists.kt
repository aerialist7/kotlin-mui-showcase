package team.karakum.showcase.material

import mui.icons.material.Star
import mui.material.*
import mui.system.sx
import react.FC
import react.Props
import web.cssom.pct
import web.cssom.px

val ListsShowcase = FC<Props> {
    List {
        sx {
            width = 100.pct
            maxWidth = 360.px
        }

        ListItem {
            disablePadding = true

            ListItemButton {
                ListItemIcon {
                    Star()
                }
                ListItemText {
                    +"Chelsea Otakan"
                }
            }
        }
        ListItem {
            disablePadding = true

            ListItemButton {
                ListItemText {
                    +"Eric Hoffman"
                }
            }
        }
    }
}
