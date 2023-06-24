package team.karakum.components

import emotion.react.css
import mui.material.*
import mui.material.DrawerAnchor.Companion.left
import mui.system.Box
import mui.system.sx
import react.*
import react.dom.html.ReactHTML.nav
import react.router.dom.NavLink
import react.router.useLoaderData
import react.router.useLocation
import team.karakum.common.Sizes
import team.karakum.entities.Showcases
import web.cssom.Color
import web.cssom.None.Companion.none
import web.cssom.Position.Companion.absolute
import web.cssom.px
import mui.icons.material.Menu as MenuIcon

val Menu = FC<Props> {
    var isOpen by useState(false)

    val showcases = useLoaderData().unsafeCast<Showcases>()
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    Box {
        component = nav

        SwipeableDrawer {
            anchor = left
            open = isOpen
            onOpen = { isOpen = true }
            onClose = { isOpen = false }

            // TODO: Reorganize in mobile manner. No `List`
            Box {
                Toolbar()

                List {
                    sx { width = Sizes.Sidebar.Width }

                    for ((key, name) in showcases) {
                        NavLink {
                            to = key

                            css {
                                textDecoration = none
                                color = Color.currentcolor
                            }

                            ListItemButton {
                                selected = lastPathname == key

                                ListItemText {
                                    primary = ReactNode(name)
                                }
                            }
                        }
                    }
                }
            }
        }

        SpeedDial {
            sx {
                position = absolute
                bottom = 16.px
                left = 16.px
            }
            ariaLabel = "Menu"
            icon = MenuIcon.create()
            onClick = { isOpen = true }
        }
    }
}
