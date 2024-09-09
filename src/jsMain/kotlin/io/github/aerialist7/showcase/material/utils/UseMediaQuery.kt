package io.github.aerialist7.showcase.material.utils

import mui.system.useMediaQuery
import react.FC
import react.Props
import react.dom.html.ReactHTML.span

val UseMediaQueryShowcase = FC<Props> {
    val matches = useMediaQuery("(min-width:600px)")

    span {
        +"(min-width:600px) matches: $matches"
    }
}
