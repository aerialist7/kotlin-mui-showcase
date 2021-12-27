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

external interface HeaderProps : Props {
    var sourceCodeKey: String
}

val Header = FC<HeaderProps> { props ->
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
                        window.location.href = "https://mui.com/components/${props.sourceCodeKey}/"
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
                        val name = props.sourceCodeKey
                            .split("-")
                            .asSequence()
                            .map { it.replaceFirstChar { it.titlecase() } }
                            .reduce { accumulator, word -> accumulator.plus(word) }

                        window.location.href = "https://github.com/karakum-team/kotlin-mui-showcase/blob/main/src/main/kotlin/showcase/$name.kt"
                    }

                    GitHub()
                }
            }
        }
    }
}
