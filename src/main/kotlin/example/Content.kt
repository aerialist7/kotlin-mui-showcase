package example

import csstype.FlexGrow
import csstype.px
import example.Sizes.Header
import kotlinext.js.jso
import mui.material.Typography
import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML
import react.router.Outlet
import react.router.Route
import react.router.Routes
import react.useContext

val Content = FC<Props> {
    val showcases = useContext(ShowcasesContext)

    Routes {
        Route {
            path = "/"
            element = mui.system.Box.create {
                component = ReactHTML.main
                sx = jso {
                    flexGrow = FlexGrow(1.0)
                    marginTop = Header.Height
                    padding = 30.px
                }
                Outlet()
            }

            Route {
                index = true
                element = Placeholder.create()
            }

            showcases.map { (key, _, Component) ->
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
