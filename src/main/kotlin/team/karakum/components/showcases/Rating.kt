package team.karakum.components.showcases

import mui.material.Box
import mui.material.Rating
import mui.material.Typography
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.useState

val RatingShowcase = FC<Props> {
    var rating by useState<Number>()

    Box {
        Typography {
            component = ReactHTML.legend

            +"Controlled"
        }
        Rating {
            name = "simple-controlled"
            value = rating
            onChange = { _, newValue -> rating = newValue }

            Typography {
                component = ReactHTML.legend

                +"Read only"
            }
            Rating {
                name = "read-only"
                value = rating
                readOnly = true
            }
            Typography {
                component = ReactHTML.legend

                +"Disabled"
            }
            Rating {
                name = "disabled"
                value = rating
                disabled = true
            }
            Typography {
                component = ReactHTML.legend

                +"No rating given"
            }
            Rating {
                name = "no-value"
                value = null
            }
        }
    }
}
