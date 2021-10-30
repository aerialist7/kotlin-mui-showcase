package showcase

import mui.material.Avatar
import mui.material.AvatarGroup
import react.Props
import react.fc

val AvatarShowcase = fc<Props> {
    AvatarGroup {
        attrs.max = 4
        Avatar {
            attrs {
                alt = "Remy Sharp"
                src = "avatar.jpg"
            }
        }
        Avatar {
            attrs { alt = "Travis Howard" }
            +"TH"
        }
        Avatar {
            attrs { alt = "Cindy Baker" }
        }
        Avatar {
            attrs { alt = "Agnes Walker" }
            +"AW"
        }
        Avatar {
            attrs { alt = "Trevor Henderson" }
        }
    }
}
