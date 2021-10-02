package showcase

import mui.material.Badge
import mui.material.Button
import react.Props
import react.fc

val BadgeShowcase = fc<Props> {
    Badge {
        attrs.color = "primary"
        // TODO: Unable to set badge content legally [MUI]
        attrs.asDynamic().badgeContent = "4"
        // TODO: Unable to use <MailIcon/> [MUI]
        Button {
            +"Badge"
        }
    }
}