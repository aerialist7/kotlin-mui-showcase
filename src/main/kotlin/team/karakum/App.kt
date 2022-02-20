package team.karakum

import csstype.Auto.auto
import csstype.Display
import csstype.GridArea
import csstype.GridTemplateAreas
import csstype.array
import kotlinx.browser.document
import kotlinx.js.jso
import mui.system.Box
import react.FC
import react.Props
import react.create
import react.dom.render
import react.router.dom.HashRouter
import team.karakum.common.GridAreas
import team.karakum.common.Sizes.Header
import team.karakum.common.Sizes.Sidebar
import team.karakum.component.*

fun main() {
    render(
        element = App.create(),
        container = document.createElement("div").also { document.body!!.appendChild(it) },
    )
}

private val App = FC<Props> {
    HashRouter {
        ShowcasesModule {
            ThemeModule {
                Box {
                    sx = jso {
                        display = Display.grid
                        gridTemplateRows = array(
                            Header.Height,
                            auto,
                        )
                        gridTemplateColumns = array(
                            Sidebar.Width, auto,
                        )
                        gridTemplateAreas = GridTemplateAreas(
                            GridArea("${GridAreas.Header} ${GridAreas.Header}"),
                            GridArea("${GridAreas.Sidebar} ${GridAreas.Content}"),
                        )
                    }

                    Header()
                    Sidebar()
                    Content()
                }
            }
        }
    }
}
