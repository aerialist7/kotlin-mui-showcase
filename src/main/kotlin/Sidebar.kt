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

external interface SidebarProps : Props {
    var value: Iterable<ShowcaseInfo>
    var basePath: String
}

val Sidebar = FC<SidebarProps> { props ->
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    Box {
        component = nav

        Drawer {
            sx = jso {
                width = Sizes.Sidebar.Width
                variant = "permanent"
                anchor = "left"
                open = true
            }

            List {
                props.value.map { (key, name) ->
                    NavLink {
                        to = "${props.basePath}$key"

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
