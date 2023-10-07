package team.karakum

import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.router.RouterProvider
import team.karakum.theme.ThemeModule
import web.dom.document
import web.html.HTML.div

fun main() {
    val root = document.createElement(div)
        .also { document.body.appendChild(it) }

    createRoot(root)
        .render(App.create())
}

private val App = FC<Props> {
    ThemeModule {
        RouterProvider {
            router = Router
        }
    }
}
