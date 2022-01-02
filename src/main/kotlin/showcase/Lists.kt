package showcase

import csstype.pct
import csstype.px
import kotlinext.js.jso
import mui.icons.material.Star
import mui.material.*
import react.FC
import react.Props

val ListsShowcase = FC<Props> {
    List {
        sx = jso {
            width = 100.pct
            maxWidth = 360.px
        }

        ListItem {
            // TODO: Unable to use `disablePadding` prop correctly - whole file  [MUI]
            asDynamic().disablePadding = true

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
            asDynamic().disablePadding = true

            ListItemButton {
                ListItemText {
                    +"Eric Hoffman"
                }
            }
        }
    }
}
