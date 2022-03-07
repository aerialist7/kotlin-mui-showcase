package team.karakum

import csstype.Auto.auto
import csstype.Display
import csstype.GridTemplateAreas
import csstype.array
import kotlinx.browser.document
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.create
import react.dom.render
import react.router.dom.HashRouter
import team.karakum.common.Area
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
                    sx {
                        display = Display.grid
                        gridTemplateRows = array(
                            Header.Height,
                            auto,
                        )
                        gridTemplateColumns = array(
                            Sidebar.Width, auto,
                        )
                        gridTemplateAreas = GridTemplateAreas(
                            arrayOf(Area.Header, Area.Header),
                            arrayOf(Area.Sidebar, Area.Content),
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
