package team.karakum.component

import csstype.GridArea
import csstype.px
import kotlinext.js.jso
import mui.material.Paper
import mui.material.PaperVariant
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

val Content = FC<Props> {
    val showcases = useContext(ShowcasesContext)

    Routes {
        Route {
            path = "/"
            element = Box.create {
                component = ReactHTML.main
                sx = jso {
                    gridArea = GridArea(GridAreas.Content)
                    padding = 30.px
                }

                Paper {
                    variant = PaperVariant.elevation
                    elevation = 0

                    Outlet()
                }
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
