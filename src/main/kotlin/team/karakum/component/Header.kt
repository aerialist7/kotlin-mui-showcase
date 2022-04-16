package team.karakum.component

import csstype.integer
import csstype.number
import mui.icons.material.Brightness4
import mui.icons.material.Brightness7
import mui.icons.material.GitHub
import mui.icons.material.MenuBook
import mui.material.*
import mui.system.sx
import react.*
import react.dom.aria.AriaHasPopup.`false`
import react.dom.aria.ariaHasPopup
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML
import react.router.useLocation
import react.router.useNavigate
import team.karakum.common.Area
import team.karakum.common.Themes

val Header = FC<Props> {
    var theme by useContext(ThemeContext)
    val lastPathname = useLocation().pathname.substringAfterLast("/")
    val navigate = useNavigate()

    AppBar {
        position = AppBarPosition.fixed
        sx {
            gridArea = Area.Header
            zIndex = integer(1_500)
        }

        Toolbar {
            Typography {
                sx { flexGrow = number(1.0) }
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
                    onClick = { navigate("https://mui.com/material-ui/$lastPathname") }

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

                        navigate("https://github.com/karakum-team/kotlin-mui-showcase/blob/main/src/main/kotlin/team/karakum/component/showcase/$name")
                    }

                    GitHub()
                }
            }
        }
    }
}
