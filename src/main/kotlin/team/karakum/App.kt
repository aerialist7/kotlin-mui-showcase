package team.karakum

import csstype.Auto.auto
import csstype.Display
import csstype.GridTemplateAreas
import csstype.array
import mui.material.useMediaQuery
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.router.dom.HashRouter
import team.karakum.common.Area
import team.karakum.common.Sizes.Header
import team.karakum.common.Sizes.Sidebar
import team.karakum.components.*
import web.dom.document
import web.html.HTML.div

fun main() {
    val root = document.createElement(div)
        .also { document.body.appendChild(it) }

    createRoot(root)
        .render(App.create())
}

private val App = FC<Props> {
    val mobileMode = useMediaQuery("(max-width:960px)")

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
                            if (mobileMode)
                                arrayOf(Area.Content, Area.Content)
                            else
                                arrayOf(Area.Sidebar, Area.Content),
                        )
                    }

                    Header()
                    if (mobileMode) Menu() else Sidebar()
                    Content()
                }
            }
        }
    }
}
