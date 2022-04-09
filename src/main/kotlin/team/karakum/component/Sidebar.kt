package team.karakum.component

import csstype.*
import kotlinx.js.jso
import mui.material.*
import mui.system.Box
import react.*
import react.css.css
import react.dom.html.ReactHTML
import react.router.dom.NavLink
import react.router.useLocation
import team.karakum.common.GridAreas
import csstype.Color
import csstype.None.none
import emotion.react.css
import mui.material.*
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML
import react.router.dom.NavLink
import react.router.useLocation
import react.useContext
import team.karakum.common.Area
import team.karakum.common.Sizes
import team.karakum.common.Sizes.Mobile
import mui.icons.material.Menu as MenuIcon

typealias SidebarState = StateInstance<Boolean>

val SidebarContext = createContext<SidebarState>()

val AdaptiveSidebar = FC<PropsWithChildren> { props ->
    val width by useContext(AdaptiveContext)
    val isMobileComponentRequired = width <= Mobile.MaxWidth

    if (isMobileComponentRequired) {
        MobileSidebar {
            props.children()
        }
    } else {
        Sidebar {
            props.children()
        }
    }
}

val SidebarModule = FC<PropsWithChildren> { props ->
    val state = useState(false)
    SidebarContext.Provider(state) {
        props.children()
    }
}

val MobileSidebar = FC<Props> {
    var opened by useContext(SidebarContext)

    Box {
        component = ReactHTML.nav

        SwipeableDrawer {
            open = opened
            anchor = DrawerAnchor.left
            onClose = {
                opened = false
            }

            SidebarContent()
        }
    }
    SpeedDial {
        ariaLabel = "sidebar button"
        sx = jso {
            hidden = opened
            position = Position.absolute
            bottom = 16.px
            left = 16.px
        }
        icon = MenuIcon.create()
        onClick = {
            opened = true
        }
    }
}

val Sidebar = FC<Props> {
    Box {
        component = ReactHTML.nav
        sx {
            gridArea = Area.Sidebar
        }

        Drawer {
            variant = DrawerVariant.permanent
            anchor = DrawerAnchor.left

            SidebarContent()
        }
    }
}

val SidebarContent = FC<Props> {
    val showcases = useContext(ShowcasesContext)
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    Toolbar()

    List {
        sx { width = Sizes.Sidebar.Width }

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
