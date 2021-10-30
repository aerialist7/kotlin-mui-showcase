package showcase

import csstype.pct
import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.Props
import react.fc

val ListShowcase = fc<Props> {
    List {
        attrs.sx = jso {
            width = 100.pct
            maxWidth = 360.px
        }
        ListItem {
            // TODO: Unable to use `disablePadding` prop correctly  [MUI]
            attrs.asDynamic().disablePadding = true
            ListItemButton {
                ListItemIcon {
                    // TODO: Unable to use `StarIcon` [MUI]
                    SpeedDialIcon {}
                }
                ListItemText {
                    +"Chelsea Otakan"
                }
            }
        }
        ListItem {
            // TODO: Unable to use `disablePadding` prop correctly  [MUI]
            attrs.asDynamic().disablePadding = true
            ListItemButton {
                ListItemText {
                    +"Eric Hoffman"
                }
            }
        }
    }
}
