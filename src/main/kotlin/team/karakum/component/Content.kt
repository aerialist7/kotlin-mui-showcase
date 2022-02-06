package team.karakum.component

import csstype.FlexGrow
import csstype.Length
import csstype.minus
import csstype.px
import kotlinext.js.jso
import kotlinx.browser.document
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
import team.karakum.common.Sizes.Header
import team.karakum.common.Sizes.Padding

val Content = FC<Props> {
    val showcases = useContext(ShowcasesContext)

    Routes {
        Route {
            path = "/"
            element = Box.create {
                component = ReactHTML.main
                sx = jso {
                    flexGrow = FlexGrow(1.0)
                    marginTop = Header.Height
                    padding = Padding.Graceful
                }

                Paper {
                    sx = jso {
                        minHeight = visibleHeight - Header.Height - Padding.Graceful - Padding.Graceful
                        padding = Padding.Graceful
                    }
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

private val visibleHeight: Length
    get() {
        val body = document.body!!
        val html = document.documentElement!!
        return maxOf(
            body.offsetHeight,
            body.scrollHeight,
            html.clientHeight,
            html.scrollHeight
        ).px
    }
