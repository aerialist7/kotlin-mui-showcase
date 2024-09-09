package io.github.aerialist7.showcase.material.lab

import emotion.styled.styled
import mui.material.Box
import mui.material.PaletteMode
import mui.material.Paper
import mui.material.styles.Theme
import mui.system.sx
import react.FC
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
                key = "$index"
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

// TODO: Cleanup after theme props improvements
private val Item = Paper.styled { props ->
    val theme: Theme = props.asDynamic().theme

    backgroundColor = Color(if (theme.palette.mode == PaletteMode.dark) "#1A2027" else "#fff")
    +theme.typography.body2
    padding = theme.spacing(0.5.unsafeCast<Int>())
    textAlign = TextAlign.center
    color = theme.palette.text.secondary
}
