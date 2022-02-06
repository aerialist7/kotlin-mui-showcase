package team.karakum

import csstype.*
import kotlinext.js.jso
import kotlinx.browser.document
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
                        gridTemplateRows = GridTemplateRows(
                            Header.Height,
                            Length.auto,
                        )
                        gridTemplateColumns = GridTemplateColumns(
                            Sidebar.Width, Length.auto,
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
