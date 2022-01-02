import csstype.Display
import csstype.px
import kotlinext.js.jso
import kotlinx.browser.document
import mui.system.Box
import org.w3c.dom.HTMLDivElement
import react.FC
import react.Props
import react.create
import react.dom.render
import react.router.dom.HashRouter

fun main() {
    render(
        element = HashRouter.create {
            App()
        },
        container = document.createElement("div").unsafeCast<HTMLDivElement>().apply {
            style.minHeight = "100vh"
            style.display = "flex"
            style.flexDirection = "column"
            document.body!!.appendChild(this)
        },
    )
}

private val App = FC<Props> {
    ShowcasesModule {
        Box {
            sx = jso { display = Display.flex }

            Header()
            Sidebar()
            Content()
        }
    }
}

object Sizes {
    object Header {
        val Height = 64.px
    }

    object Sidebar {
        val Width = 168.px
    }
}
