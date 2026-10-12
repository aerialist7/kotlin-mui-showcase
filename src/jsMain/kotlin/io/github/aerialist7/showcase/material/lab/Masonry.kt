package io.github.aerialist7.showcase.material.lab

import emotion.styled.styled
import io.github.aerialist7.body2Typography
import io.github.aerialist7.cssSpacing
import io.github.aerialist7.muiPalette
import io.github.aerialist7.muiTheme
import mui.material.Box
import mui.material.Paper
import mui.system.sx
import react.FC
import react.Key
import react.Props
import web.cssom.Color
import web.cssom.TextAlign
import web.cssom.px

val MasonryShowcase = FC<Props> {
    Box {
        sx {
            width = 500.px
            minHeight = 393.px
        }
// TODO: Uncomment after `Masonry` support
//        Masonry {
//            columns = 4
//            spacing = 2

        for ((index, item) in heights.withIndex()) {
            Item {
                key = Key(index)
                sx {
                    height = item.px
                }

                +"${index + 1}"
            }
        }
    }
//    }
}

private val heights = arrayOf(150, 30, 90, 70, 110, 150, 130, 80, 50, 90, 100, 150, 30, 50, 80)

private val Item = Paper.styled { props ->
    val theme = props.muiTheme()
    val palette = theme.muiPalette()

    backgroundColor = Color(if (palette.mode == mui.material.PaletteMode.dark) "#1A2027" else "#fff")
    +theme.body2Typography()
    padding = theme.cssSpacing(0.5)
    textAlign = TextAlign.center
    color = Color(palette.text.secondary)
}
