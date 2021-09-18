import component.Footer
import component.Header
import kotlinx.browser.document
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        Header()
        Footer()
    }
}
