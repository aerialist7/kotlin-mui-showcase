package team.karakum

import js.core.ReadonlyArray
import js.core.jso
import react.FC
import react.Props
import react.ReactNode
import react.create
import react.dom.client.createRoot
import react.router.RouteObject
import react.router.RouterProvider
import react.router.dom.createHashRouter
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
    val hashRouter = createHashRouter(
        routes = arrayOf(
            jso {
                path = "/"
                loader = ::showcasesLoader
                element = Showcases.create()
                errorElement = Error.create()
                children = arrayOf(
                    jso {
                        path = ":showcaseId"
                        element = Showcase.create()
                    },
                    jso {
                        path = "*"
                        element = Error.create()
                    }
                )
            },
        ),
    )


    ThemeModule {
        RouterProvider {
            router = hashRouter
        }
    }
}

// TODO: Remove when declarations will be updated
private var RouteObject.loader: () -> Any?
    get() = asDynamic().loader
    set(value) {
        asDynamic().loader = value
    }

private var RouteObject.element: ReactNode
    get() = asDynamic().element
    set(value) {
        asDynamic().element = value
    }

private var RouteObject.errorElement: ReactNode
    get() = asDynamic().errorElement
    set(value) {
        asDynamic().errorElement = value
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
