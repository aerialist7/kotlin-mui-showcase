package io.github.aerialist7.showcase.material.layout

import mui.material.Box
import mui.material.Container
import mui.material.CssBaseline
import mui.system.sx
import react.FC
import react.Fragment
import react.Props
import web.cssom.Color
import web.cssom.vh

val ContainerShowcase = FC<Props> {
    Fragment {
        CssBaseline()

        Container {
            maxWidth = "sm"

            Box {
                sx {
                    backgroundColor = Color("#cfe8fc")
                    height = 50.vh
                }
            }
        }
    }
}
