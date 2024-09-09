package io.github.aerialist7.showcase.material.layout

import mui.material.Box
import mui.system.sx
import react.FC
import react.Props
import web.cssom.Color
import web.cssom.array
import web.cssom.number
import web.cssom.px

val BoxShowcase = FC<Props> {
    Box {
        sx {
            width = 300.px
            height = 300.px
            backgroundColor = Color("primary.dark")
            hover {
                backgroundColor = Color("primary.main")
                opacity = array(number(0.9), number(0.8), number(0.7))
            }
        }
    }
}
