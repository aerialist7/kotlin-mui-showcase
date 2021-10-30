package showcase

import mui.material.Box
import mui.material.Rating
import mui.material.Typography
import react.Props
import react.fc
import react.useState

val RatingShowcase = fc<Props> {
    var value by useState(2)

    Box {
        Typography {
            attrs.asDynamic().component = "legend"
            +"Controlled"
        }
        Rating {
            attrs.name = "simple-controlled"
            attrs.value = value
            attrs.onChange = { _, newValue ->
                value = newValue as Int
            }
            Typography {
                attrs.asDynamic().component = "legend"
                +"Read only"
            }
            Rating {
                attrs.name = "read-only"
                attrs.value = value
                attrs.readOnly = true
            }
            Typography {
                attrs.asDynamic().component = "legend"
                +"Disabled"
            }
            Rating {
                attrs.name = "disabled"
                attrs.value = value
                attrs.disabled
            }
            Typography {
                attrs.asDynamic().component = "legend"
                +"No rating given"
            }
            Rating {
                attrs.name = "no-value"
                attrs.value = null
            }
        }
    }
}
