import component.Footer
import component.Header
import component.Showcase
import kotlinx.browser.document
import org.w3c.dom.HTMLDivElement
import react.dom.render

fun main() {
    val container = with(document) {
        createElement("div")
            .unsafeCast<HTMLDivElement>()
            .apply {
                style.minHeight = "100vh"
                style.display = "flex"
                style.flexDirection = "column"
            }
            .also { body!!.append(it) }
    }

    render(container) {
        Header()
        Showcase()
        Footer()
    }
}
