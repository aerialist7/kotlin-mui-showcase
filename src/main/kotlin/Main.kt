import kotlinx.browser.document
import react.dom.div
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        div {
            +"Hello Material UI!"
        }
    }
}
