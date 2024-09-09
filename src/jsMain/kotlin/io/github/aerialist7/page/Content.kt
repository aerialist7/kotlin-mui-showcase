package io.github.aerialist7.page

import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.router.Outlet
import web.cssom.px

val Content = FC<Props> {
    Box {
        sx {
            gridArea = Area.Content
            padding = 30.px
        }

        component = ReactHTML.main

        Outlet()
    }
}
