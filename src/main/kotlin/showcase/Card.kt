package showcase

import csstype.Display
import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.ElementType
import react.Props
import react.fc

val CardShowcase = fc<Props> {
    Card {
        CardContent {
            Typography {
                // TODO: Unable set color legally [MUI]
                attrs.asDynamic().color = "text.secondary"
                attrs.gutterBottom = true
                +"Word of the Day"
            }
            Typography {
                // TODO: Unable set component legally [MUI]
                attrs.asDynamic().component = "div"
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

private val Bull = fc<Props> {
    Box {
        attrs.sx = jso {
            display = Display.inlineBlock
            margin = 2.px
        }
        // TODO: Can't set component type [MUI]
        attrs.component = "span".unsafeCast<ElementType<Props>>()
        +"•"
    }
}
