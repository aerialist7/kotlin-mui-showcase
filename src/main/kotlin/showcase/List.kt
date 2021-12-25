package showcase

import csstype.pct
import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.FC
import react.Props

val ListShowcase = FC<Props> {
    List {
        sx = jso {
            width = 100.pct
            maxWidth = 360.px
        }
        ListItem {
            // TODO: Unable to use `disablePadding` prop correctly  [MUI]
            asDynamic().disablePadding = true
            ListItemButton {
                ListItemIcon {
                    // TODO: Unable to use `StarIcon` [MUI]
                    SpeedDialIcon()
                }
                ListItemText {
                    +"Chelsea Otakan"
                }
            }
        }
        ListItem {
            // TODO: Unable to use `disablePadding` prop correctly  [MUI]
            asDynamic().disablePadding = true
            ListItemButton {
                ListItemText {
                    +"Eric Hoffman"
                }
            }
        }
    }
}
