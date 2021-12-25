import kotlinext.js.jso
import mui.material.*
import mui.system.Box
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.nav

external interface SidebarProps : Props {
    var items: Iterable<String>

    var selectedItem: String
    var onSelectedItemChange: (String) -> Unit
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
                props.items.map { showcaseName ->
                    ListItemButton {
                        // TODO: Needs an ability to set generic type to `ListItemButton` component [MUI]
                        this as ListItemButtonBaseProps

                        selected = props.selectedItem == showcaseName
                        onClick = { props.onSelectedItemChange(showcaseName) }

                        ListItemText {
                            primary = ReactNode(showcaseName)
                        }
                    }
                }
            }
        }
    }
}
