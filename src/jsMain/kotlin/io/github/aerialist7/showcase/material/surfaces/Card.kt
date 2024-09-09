package io.github.aerialist7.showcase.material.surfaces

import io.github.aerialist7.color
import mui.material.*
import mui.material.styles.TypographyVariant.Companion.h5
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.span
import web.cssom.Display.Companion.inlineBlock
import web.cssom.px

val CardShowcase = FC<Props> {
    Card {
        CardContent {
            Typography {
                color = "text.secondary"
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
