package showcase

import mui.icons.material.Mail
import mui.material.Badge
import mui.material.BadgeColor
import react.FC
import react.Props

val BadgeShowcase = FC<Props> {
    Badge {
        color = BadgeColor.primary
        // TODO: Unable to set badge content correctly [MUI]
        asDynamic().badgeContent = "4"

        Mail()
    }
}
