package example

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

val Sidebar = FC<Props> {
    val showcases = useContext(ShowcasesContext)
    val (sidebarOpened, setSidebarOpened) = useContext(SidebarOpenedContext)
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
                    sx = jso { paddingLeft = 16.px }
                    onClick = { setSidebarOpened(false) }

                    ChevronLeft()
                }

                showcases.map { (key, name) ->
                    NavLink {
                        to = key

                        css {
                            textDecoration = TextDecoration.none
                            color = Color.currentcolor
                        }

                        ListItemButton {
                            // TODO: Needs an ability to set generic type to `ListItemButton` component [MUI]
                            this as ListItemButtonBaseProps

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
