package io.github.aerialist7.showcase.material.layout

import emotion.styled.styled
import io.github.aerialist7.xs
import mui.material.Grid
import mui.material.PaletteMode
import mui.material.Paper
import mui.material.styles.Theme
import mui.system.responsive
import react.FC
import react.Props
import web.cssom.Color
import web.cssom.TextAlign

val GridShowcase = FC<Props> {
    Grid {
        container = true
        spacing = responsive(2)

        Grid {
            item = true
            xs = 8

            Item {
                +"xs 8"
            }
        }

        Grid {
            item = true
            xs = 4

            Item {
                +"xs 4"
            }
        }

        Grid {
            item = true
            xs = 4

            Item {
                +"xs 4"
            }
        }


        Grid {
            item = true
            xs = 8

            Item {
                +"xs 8"
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
