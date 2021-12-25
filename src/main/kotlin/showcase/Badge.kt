package showcase

import mui.material.Badge
import mui.material.Button
import react.FC
import react.Props

val BadgeShowcase = FC<Props> {
    Badge {
        color = "primary"
        // TODO: Unable to set badge content correctly [MUI]
        asDynamic().badgeContent = "4"
        // TODO: Unable to use <MailIcon/> [MUI]
        Button {
            +"Badge"
        }
    }
}
