package io.github.aerialist7.showcase.material.layout

import emotion.styled.styled
import mui.material.Box
import mui.material.PaletteMode
import mui.material.Paper
import mui.material.Stack
import mui.material.styles.Theme
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

// TODO: Cleanup after theme props improvements
private val Item = Paper.styled { props ->
    val theme: Theme = props.asDynamic().theme

    backgroundColor = Color(if (theme.palette.mode == PaletteMode.dark) "#1A2027" else "#fff")
    +theme.typography.body2
    padding = theme.spacing(0.5.unsafeCast<Int>())
    textAlign = TextAlign.center
    color = theme.palette.text.secondary
}
