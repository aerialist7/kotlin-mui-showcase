package team.karakum.components

import emotion.react.css
import mui.material.*
import mui.material.DrawerAnchor.Companion.left
import mui.material.DrawerVariant.Companion.permanent
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.nav
import react.router.dom.NavLink
import react.router.useLoaderData
import react.router.useLocation
import team.karakum.common.Area
import team.karakum.common.Sizes
import team.karakum.entities.Showcases
import web.cssom.Color
import web.cssom.None.Companion.none

val Sidebar = FC<Props> {
    val showcases = useLoaderData().unsafeCast<Showcases>()
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    Box {
        component = nav
        sx { gridArea = Area.Sidebar }

        Drawer {
            variant = permanent
            anchor = left

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
    }
}
