package team.karakum.component.showcase

import mui.material.Avatar
import mui.material.AvatarGroup
import react.FC
import react.Props

val AvatarsShowcase = FC<Props> {
    AvatarGroup {
        max = 4

        Avatar {
            alt = "Remy Sharp"
            src = "avatar.jpg"
        }
        Avatar {
            alt = "Travis Howard"
            +"TH"
        }
        Avatar {
            alt = "Cindy Baker"
        }
        Avatar {
            alt = "Agnes Walker"
            +"AW"
        }
        Avatar {
            alt = "Trevor Henderson"
        }
    }
}
