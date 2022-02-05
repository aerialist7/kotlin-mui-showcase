package team.karakum

import csstype.Display
import kotlinext.js.jso
import kotlinx.browser.document
import mui.system.Box
import react.FC
import react.Props
import react.create
import react.dom.render
import react.router.dom.HashRouter
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
            SidebarOpenedModule {
                ThemeModule {
                    Box {
                        sx = jso { display = Display.flex }

                        Header()
                        Sidebar()
                        Content()
                    }
                }
            }
        }
    }
}
