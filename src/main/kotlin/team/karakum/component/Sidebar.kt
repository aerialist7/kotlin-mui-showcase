package team.karakum.component

import csstype.Color
import csstype.Display
import csstype.TextDecoration
import csstype.px
import kotlinext.js.jso
import mui.icons.material.ChevronLeft
import mui.material.*
import mui.system.Box
import react.FC
import react.Props
import react.ReactNode
import react.css.css
import react.dom.html.ReactHTML
import react.router.dom.NavLink
import react.router.useLocation
import react.useContext
import team.karakum.common.Sizes

val Sidebar = FC<Props> {
    val showcases = useContext(ShowcasesContext)
    var sidebarOpened by useContext(SidebarOpenedContext)
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    Box {
        component = ReactHTML.nav
        sx = jso {
            width = Sizes.Sidebar.Width
            if (!sidebarOpened)
                display = Display.none
        }

        Drawer {
            variant = DrawerVariant.persistent
            open = sidebarOpened
            anchor = DrawerAnchor.left

            List {
                sx = jso { width = Sizes.Sidebar.Width }

                IconButton {
                    sx = jso { marginLeft = 8.px }
                    onClick = { sidebarOpened = false }

                    ChevronLeft()
                }

                for ((key, name) in showcases) {
                    NavLink {
                        to = key

                        css {
                            textDecoration = TextDecoration.none
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
}
