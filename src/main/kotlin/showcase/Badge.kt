package showcase

import mui.icons.material.Mail
import mui.material.Badge
import react.FC
import react.Props

val BadgeShowcase = FC<Props> {
    Badge {
        color = "primary"
        // TODO: Unable to set badge content correctly [MUI]
        asDynamic().badgeContent = "4"

        Mail()
    }
}
