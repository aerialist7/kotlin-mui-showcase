package component

import mui.material.Box
import mui.material.Rating
import mui.material.Typography
import react.FC
import react.Props
import react.useState

val RatingShowcase = FC<Props> {
    var rating by useState<Number?>(null)

    Box {
        Typography {
            // TODO: Need `component` attribute support [MUI]
            asDynamic().component = "legend"
            +"Controlled"
        }
        Rating {
            name = "simple-controlled"
            value = rating
            onChange = { _, newValue -> rating = newValue }

            Typography {
                // TODO: Need `component` attribute support [MUI]
                asDynamic().component = "legend"
                +"Read only"
            }
            Rating {
                name = "read-only"
                value = rating
                readOnly = true
            }
            Typography {
                // TODO: Need `component` attribute support [MUI]
                asDynamic().component = "legend"
                +"Disabled"
            }
            Rating {
                name = "disabled"
                value = rating
                disabled
            }
            Typography {
                // TODO: Need `component` attribute support [MUI]
                asDynamic().component = "legend"
                +"No rating given"
            }
            Rating {
                name = "no-value"
                value = null
            }
        }
    }
}
