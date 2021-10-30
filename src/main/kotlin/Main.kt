import component.Footer
import component.Header
import component.Showcase
import kotlinx.browser.document
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        Header()
        Showcase()
        Footer()
    }
}
