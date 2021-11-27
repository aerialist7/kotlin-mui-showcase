import component.Footer
import component.Header
import component.Showcase
import kotlinx.browser.document
import react.dom.render

fun main() {
    val container = with(document) {
        createElement("div").also { body!!.append(it) }
    }

    render(container) {
        Header()
        Showcase()
        Footer()
    }
}
