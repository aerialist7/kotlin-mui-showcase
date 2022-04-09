package team.karakum.component.showcase

import csstype.pct
import csstype.px
import mui.icons.material.Star
import mui.material.*
import mui.system.sx
import react.FC
import react.Props

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
