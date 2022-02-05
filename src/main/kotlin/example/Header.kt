package example

import csstype.*
import example.Sizes.Header
import kotlinext.js.jso
import kotlinx.browser.window
import mui.icons.material.GitHub
import mui.icons.material.Menu
import mui.icons.material.MenuBook
import mui.material.*
import mui.material.Size
import react.FC
import react.Props
import react.ReactNode
import react.dom.aria.AriaHasPopup.`false`
import react.dom.aria.ariaHasPopup
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML
import react.router.useLocation
import react.useContext

val Header = FC<Props> {
    var sidebarOpened by useContext(SidebarOpenedContext)
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    val ml = if (sidebarOpened) Sizes.Sidebar.Width else 0.px

    AppBar {
        position = AppBarPosition.fixed
        sx = jso {
            width = 100.pct - ml
            height = Header.Height
            marginLeft = ml
        }

        Toolbar {
            IconButton {
                ariaLabel = "open drawer"
                edge = IconButtonEdge.start
                color = IconButtonColor.inherit
                onClick = { sidebarOpened = true }
                sx = jso {
                    marginRight = 16.px
                    if (sidebarOpened)
                        display = Display.none
                }

                Menu()
            }

            Typography {
                sx = jso { flexGrow = FlexGrow(1.0) }
                variant = "h6"
                noWrap = true
                component = ReactHTML.div

                +"Kotlin MUI Showcase"
            }

            Tooltip {
                title = ReactNode("Read Documentation")

                IconButton {
                    ariaLabel = "official documentation"
                    ariaHasPopup = `false`
                    size = Size.large
                    color = IconButtonColor.inherit
                    onClick = { window.location.href = "https://mui.com/components/$lastPathname" }

                    MenuBook()
                }
            }

            Tooltip {
                title = ReactNode("View Sources")

                IconButton {
                    ariaLabel = "source code"
                    ariaHasPopup = `false`
                    size = Size.large
                    color = IconButtonColor.inherit
                    onClick = {
                        var name = lastPathname
                            .split("-")
                            .asSequence()
                            .map { it.replaceFirstChar { it.titlecase() } }
                            .reduce { accumulator, word -> accumulator.plus(word) }

                        if (name.isNotEmpty()) {
                            name += ".kt"
                        }

                        window.location.href = "https://github.com/karakum-team/kotlin-mui-showcase/blob/main/src/main/kotlin/example/component/$name"
                    }

                    GitHub()
                }
            }
        }
    }
}
