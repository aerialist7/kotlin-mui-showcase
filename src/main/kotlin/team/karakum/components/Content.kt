package team.karakum.components

import csstype.px
import js.core.ReadonlyArray
import js.core.jso
import mui.material.Typography
import mui.system.Box
import mui.system.sx
import react.*
import react.dom.html.ReactHTML.main
import react.router.Outlet
import react.router.RouteObject
import react.router.useRoutes

private val DEFAULT_PADDING = 30.px

val Content = FC<Props> {
    val showcases = useContext(ShowcasesContext)

    +useRoutes(
        routes = arrayOf(
            jso {
                path = "/"
                element = Box.create {
                    component = main
                    sx {
                        gridArea = team.karakum.common.Area.Content
                        padding = DEFAULT_PADDING
                    }

                    Outlet()
                }
                children = showcases.mapIndexed { i, (key, _, Component) ->
                    jso<RouteObject> {
                        index = i == 0
                        path = key
                        element = Component.create()
                    }
                }.toTypedArray() + jso<RouteObject> {
                    path = "*"
                    element = Typography.create { +"404 Page Not Found" }
                }
            },
        ),
        // TODO: Remove after declarations update
        locationArg = "",
    )
}

// TODO: Remove when declarations will be updated
private var RouteObject.index: Boolean
    get() = asDynamic().index
    set(value) {
        asDynamic().index = value
    }

private var RouteObject.element: ReactNode
    get() = asDynamic().element
    set(value) {
        asDynamic().element = value
    }

private var RouteObject.path: String
    get() = asDynamic().path
    set(value) {
        asDynamic().path = value
    }

private var RouteObject.children: ReadonlyArray<RouteObject>
    get() = asDynamic().children
    set(value) {
        asDynamic().children = value
    }
