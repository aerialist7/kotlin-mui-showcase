package showcase

import kotlinext.js.jso
import mui.material.*
import react.Props
import react.fc

val ListShowcase = fc<Props> {
    List {
        attrs.sx = jso<dynamic> {
            width = "100%"
            maxWidth = 360
        }.unsafeCast<SxProps<Theme>>()
        ListItem {
            attrs.asDynamic().disablePadding = true
            ListItemButton {
                ListItemIcon {
                    // TODO: Unable to use StarIcon [MUI]
                    SpeedDialIcon {}
                }
                // TODO: Unable to use ListItemText [MUI]
                Typography {
                    +"Chelsea Otakan"
                }
            }
        }
        ListItem {
            attrs.asDynamic().disablePadding = true
            ListItemButton {
                // TODO: Unable to use ListItemText [MUI]
                Typography {
                    +"Eric Hoffman"
                }
            }
        }
    }
}
