package showcase

import mui.material.Box
import mui.material.CardActions
import mui.material.CardContent
import mui.material.Typography
import mui.material.Button
import react.ElementType
import react.Props
import react.fc

// TODO: Unable to use sx at all [MUI]
val Card = fc<Props> {
    val Bull = fc<Props> {
        Box {
            attrs.component = "span".unsafeCast<ElementType<Props>>() // TODO: Can't set component type [MUI]
            +"•"
        }
    }

    mui.material.Card {
        CardContent {
            Typography {
                attrs.asDynamic().color = "text.secondary" // TODO: Unable set color legally [MUI]
                attrs.gutterBottom = true
                +"Word of the Day"
            }
            Typography {
                attrs.asDynamic().component = "div" // TODO: Unable set component legally [MUI]
                attrs.variant = "h5"
                +"be"
                Bull {}
                +"nev"
                Bull {}
                +"o"
                Bull {}
                +"lent"
            }
        }
        CardActions {
            Button {
                attrs.size = "small"
                +"Learn More"
            }
        }
    }
}