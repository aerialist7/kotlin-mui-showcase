package io.github.aerialist7.page

import io.github.aerialist7.muiZIndex
import io.github.aerialist7.router.useShowcase
import io.github.aerialist7.router.useShowcaseIdParam
import io.github.aerialist7.theme.Themes
import io.github.aerialist7.theme.useSetTheme
import io.github.aerialist7.theme.useTheme
import js.objects.unsafeJso
import js.uri.decodeURIComponent
import mui.icons.material.Brightness4
import mui.icons.material.Brightness7
import mui.icons.material.GitHub
import mui.icons.material.MenuBook
import mui.material.*
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.FC
import react.ReactNode
import react.create
import react.dom.aria.AriaHasPopup.Companion.`false`
import react.dom.html.ReactHTML
import web.cssom.integer
import web.cssom.number
import web.location.location

private const val REPOSITORY_URL = "https://github.com/aerialist7/kotlin-mui-showcase"
private const val SHOWCASES_PATH = "src/jsMain/kotlin/io/github/aerialist7/showcase/material"

val Header = FC {
    val theme = useTheme()
    val setTheme = useSetTheme()
    val showcaseId = useShowcaseIdParam()
    val showcase = useShowcase()

    AppBar {
        sx {
            gridArea = Area.Header
            zIndex = integer(theme.muiZIndex().drawer.toInt() + 1)
        }

        position = AppBarPosition.fixed

        Toolbar {
            Typography {
                sx {
                    flexGrow = number(1.0)
                }

                component = ReactHTML.div
                variant = TypographyVariant.h6
                noWrap = true

                +"Kotlin MUI Showcase"
            }

            Tooltip {
                title = ReactNode("Theme")

                Switch {
                    name = "theme"
                    slotProps = unsafeJso {
                        input = unsafeJso { ariaLabel = "Dark theme" }
                    }

                    icon = Brightness7.create()
                    checkedIcon = Brightness4.create()
                    checked = theme == Themes.Dark

                    onChange = { _, checked ->
                        setTheme(if (checked) Themes.Dark else Themes.Light)
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
                    onClick = {
                        val path = decodeURIComponent(showcaseId).ifEmpty { "material-ui" }
                        location.href = "https://mui.com/$path/"
                    }

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
                        location.href = when (showcase) {
                            null -> "$REPOSITORY_URL/tree/main/$SHOWCASES_PATH"
                            else -> "$REPOSITORY_URL/blob/main/$SHOWCASES_PATH/${showcase.source}"
                        }
                    }

                    GitHub()
                }
            }
        }
    }
}
