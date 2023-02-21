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

private val App = FC<Props> {
    val hashRouter = createHashRouter(
        routes = arrayOf(
            jso {
                path = "/"
                loader = showcasesLoader
                element = Showcases.create()
                errorElement = Error.create()
                children = arrayOf(
                    jso {
                        path = ":showcaseId"
                        loader = showcaseLoader
                        element = Showcase.create()
                        errorElement = Error.create()
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
