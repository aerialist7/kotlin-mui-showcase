import kotlinext.js.jso
import mui.material.*
import mui.system.Box
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.nav

external interface SidebarProps : Props {
    var value: Iterable<String>

    var selected: String
    var onSelectedChange: (String) -> Unit
}

val Sidebar = FC<SidebarProps> { props ->
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
                props.value.map { showcaseName ->
                    ListItemButton {
                        // TODO: Needs an ability to set generic type to `ListItemButton` component [MUI]
                        this as ListItemButtonBaseProps

                        selected = props.selected == showcaseName
                        onClick = { props.onSelectedChange(showcaseName) }

                        ListItemText {
                            primary = ReactNode(showcaseName)
                        }
                    }
                }
            }
        }
    }
}
