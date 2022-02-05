package team.karakum.component

import csstype.*
import kotlinext.js.jso
import kotlinx.browser.window
import mui.icons.material.Brightness4
import mui.icons.material.Brightness7
import mui.icons.material.GitHub
import mui.icons.material.Menu
import mui.icons.material.MenuBook
import mui.material.*
import mui.material.Size
import react.*
import react.dom.aria.AriaHasPopup.`false`
import react.dom.aria.ariaHasPopup
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML
import react.router.useLocation
import team.karakum.common.Sizes
import team.karakum.common.Sizes.Header
import team.karakum.common.Themes

val Header = FC<Props> {
    var theme by useContext(ThemeContext)
    var sidebarOpened by useContext(SidebarOpenedContext)
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    AppBar {
        position = AppBarPosition.fixed
        sx = jso {
            val ml = if (sidebarOpened) Sizes.Sidebar.Width else 0.px

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
                title = ReactNode("Theme")

                Switch {
                    icon = Brightness7.create()
                    checkedIcon = Brightness4.create()
                    checked = theme == Themes.Dark
                    ariaLabel = "theme"

                    onChange = { _, checked ->
                        theme = if (checked) Themes.Dark else Themes.Light
                    }
                }
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

                        window.location.href =
                            "https://github.com/karakum-team/kotlin-mui-showcase/blob/main/src/main/kotlin/team/karakum/component/showcase/$name"
                    }

                    GitHub()
                }
            }
        }
    }
}
