package io.github.aerialist7.showcase.material.data

import mui.icons.material.Mail
import mui.material.Badge
import mui.material.BadgeColor
import react.FC
import react.Props
import react.ReactNode

val BadgeShowcase = FC<Props> {
    Badge {
        color = BadgeColor.primary
        badgeContent = ReactNode("4")

        Mail()
    }
}
