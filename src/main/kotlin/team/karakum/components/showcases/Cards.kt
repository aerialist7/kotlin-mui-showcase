package team.karakum.components.showcases

import csstype.Display.Companion.inlineBlock
import csstype.px
import mui.material.*
import mui.material.styles.TypographyVariant.h5
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.span

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
                component = div
                variant = h5

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
        component = span
        sx {
            display = inlineBlock
            margin = 2.px
        }

        +"•"
    }
}
