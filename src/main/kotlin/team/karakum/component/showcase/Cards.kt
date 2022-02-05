package team.karakum.component.showcase

import csstype.Display
import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.FC
import react.Props
import react.dom.html.ReactHTML

val CardsShowcase = FC<Props> {
    Card {
        CardContent {
            Typography {
                // TODO: Unable set color legally [MUI]
                asDynamic().color = "text.secondary"
                gutterBottom = true
                +"Word of the Day"
            }
            Typography {
                component = ReactHTML.div
                variant = "h5"

                +"be"
                Bull()
                +"nev"
                Bull()
                +"o"
                Bull()
                +"lent"
            }
        }
        CardActions {
            Button {
                size = Size.small
                +"Learn More"
            }
        }
    }
}

private val Bull = FC<Props> {
    Box {
        component = ReactHTML.span
        sx = jso {
            display = Display.inlineBlock
            margin = 2.px
        }

        +"•"
    }
}
