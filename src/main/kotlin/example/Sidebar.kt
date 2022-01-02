package example

import csstype.Color
import csstype.TextDecoration
import kotlinext.js.jso
import mui.material.*
import mui.system.Box
import react.FC
import react.Props
import react.ReactNode
import react.css.css
import react.dom.html.ReactHTML.nav
import react.router.dom.NavLink
import react.router.useLocation
import react.useContext

val Sidebar = FC<Props> {
    val showcases = useContext(ShowcasesContext)
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    Box {
        component = nav

        Drawer {
            sx = jso {
                width = Sizes.Sidebar.Width
                variant = DrawerVariant.permanent
                anchor = DrawerAnchor.left
                open = true
            }

            List {
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
