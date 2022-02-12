package team.karakum.component

import csstype.GridArea
import csstype.px
import kotlinx.js.jso
import mui.material.Typography
import mui.system.Box
import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML
import react.router.Outlet
import react.router.Route
import react.router.Routes
import react.useContext
import team.karakum.common.GridAreas

private val DEFAULT_PADDING = 30.px

val Content = FC<Props> {
    val showcases = useContext(ShowcasesContext)

    Routes {
        Route {
            path = "/"
            element = Box.create {
                component = ReactHTML.main
                sx = jso {
                    gridArea = GridArea(GridAreas.Content)
                    padding = DEFAULT_PADDING
                }

                Outlet()
            }

            Route {
                index = true
                element = Placeholder.create()
            }

            for ((key, _, Component) in showcases) {
                Route {
                    path = key
                    element = Component.create()
                }
            }

            Route {
                path = "*"
                element = Typography.create { +"404 Page Not Found" }
            }
        }
    }
}
