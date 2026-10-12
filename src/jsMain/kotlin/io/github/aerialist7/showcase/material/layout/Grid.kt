package io.github.aerialist7.showcase.material.layout

import emotion.styled.styled
import io.github.aerialist7.body2Typography
import io.github.aerialist7.cssSpacing
import io.github.aerialist7.gridSize
import io.github.aerialist7.muiPalette
import io.github.aerialist7.muiTheme
import mui.material.Grid
import mui.material.Paper
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
            size = gridSize(8)

            Item {
                +"xs 8"
            }
        }

        Grid {
            size = gridSize(4)

            Item {
                +"xs 4"
            }
        }

        Grid {
            size = gridSize(4)

            Item {
                +"xs 4"
            }
        }


        Grid {
            size = gridSize(8)

            Item {
                +"xs 8"
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
