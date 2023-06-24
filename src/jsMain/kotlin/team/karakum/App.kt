package team.karakum

import js.core.jso
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
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

private val hashRouter = createHashRouter(
    routes = arrayOf(
        jso {
            path = "/"
            loader = showcasesLoader
            Component = Showcases
            ErrorBoundary = Error
            children = arrayOf(
                jso {
                    path = ":showcaseId"
                    loader = showcaseLoader
                    Component = Showcase
                    ErrorBoundary = Error
                },
                jso {
                    path = "*"
                    Component = Error
                }
            )
        },
    ),
)

private val App = FC<Props> {
    ThemeModule {
        RouterProvider {
            router = hashRouter
        }
    }
}
