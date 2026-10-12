package io.github.aerialist7.showcase.material.layout

import emotion.styled.styled
import io.github.aerialist7.body2Typography
import io.github.aerialist7.cssSpacing
import io.github.aerialist7.muiPalette
import io.github.aerialist7.muiTheme
import mui.material.Box
import mui.material.Paper
import mui.material.Stack
import mui.system.responsive
import mui.system.sx
import react.FC
import react.Props
import web.cssom.Color
import web.cssom.TextAlign
import web.cssom.pct

val StackShowcase = FC<Props> {
    Box {
        sx {
            width = 100.pct
        }

        Stack {
            spacing = responsive(2)

            Item {
                +"Item 1"
            }

            Item {
                +"Item 2"
            }

            Item {
                +"Item 3"
            }
        }
    }
}

private val Item = Paper.styled { props ->
    val theme = props.muiTheme()
    val palette = theme.muiPalette()

    backgroundColor = Color(if (palette.mode == mui.material.PaletteMode.dark) "#1A2027" else "#fff")
    +theme.body2Typography()
    padding = theme.cssSpacing(0.5)
    textAlign = TextAlign.center
    color = Color(palette.text.secondary)
}
