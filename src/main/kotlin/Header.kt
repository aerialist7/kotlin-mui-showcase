import Sizes.Header
import Sizes.Sidebar
import csstype.FlexGrow
import csstype.minus
import csstype.pct
import kotlinext.js.jso
import kotlinx.browser.window
import mui.icons.material.GitHub
import mui.icons.material.MenuBook
import mui.material.*
import react.FC
import react.Props
import react.ReactNode
import react.dom.aria.AriaHasPopup.`false`
import react.dom.aria.ariaHasPopup
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML.div
import react.router.useLocation

val Header = FC<Props> {
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    AppBar {
        sx = jso {
            width = 100.pct - Sidebar.Width
            height = Header.Height
            marginLeft = Sidebar.Width
        }
        position = "fixed"

        Toolbar {
            Typography {
                sx = jso {
                    flexGrow = FlexGrow(1.0)
                }
                variant = "h6"
                noWrap = true
                asDynamic().component = div

                +"Kotlin MUI Showcase"
            }

            Tooltip {
                title = ReactNode("Read Documentation")

                IconButton {
                    ariaLabel = "official documentation"
                    ariaHasPopup = `false`
                    size = "large"
                    color = "inherit"
                    onClick = {
                        window.location.href = "https://mui.com/components/$lastPathname/"
                    }

                    MenuBook()
                }
            }

            Tooltip {
                title = ReactNode("View Sources")

                IconButton {
                    ariaLabel = "source code"
                    ariaHasPopup = `false`
                    size = "large"
                    color = "inherit"
                    onClick = {
                        var name = lastPathname
                            .split("-")
                            .asSequence()
                            .map { it.replaceFirstChar { it.titlecase() } }
                            .reduce { accumulator, word -> accumulator.plus(word) }

                        if (name.isNotEmpty()) {
                            name += ".kt"
                        }

                        window.location.href = "https://github.com/karakum-team/kotlin-mui-showcase/blob/main/src/main/kotlin/showcase/$name"
                    }

                    GitHub()
                }
            }
        }
    }
}
