package io.github.aerialist7.showcase.material.muix

import mui.material.Box
import mui.material.Chip
import mui.material.Divider
import mui.material.DividerVariant.Companion.fullWidth
import mui.system.sx
import muix.tree.view.RichTreeView
import muix.tree.view.SimpleTreeView
import muix.tree.view.TreeItem
import react.FC
import react.Props
import react.ReactNode
import web.cssom.px

private external interface TreeViewBaseItem {
    var id: String
    var label: String
    var children: Array<TreeViewBaseItem>?
}

private fun item(id: String, label: String, vararg children: TreeViewBaseItem): TreeViewBaseItem {
    val obj = js("{}").unsafeCast<TreeViewBaseItem>()
    obj.id = id
    obj.label = label
    if (children.isNotEmpty()) {
        obj.children = arrayOf(*children)
    }
    return obj
}

private val MUI_X_PRODUCTS = arrayOf(
    item(
        "grid", "Data Grid",
        item("grid-community", "@mui/x-data-grid"),
        item("grid-pro", "@mui/x-data-grid-pro"),
        item("grid-premium", "@mui/x-data-grid-premium"),
    ),
    item(
        "pickers", "Date and Time Pickers",
        item("pickers-community", "@mui/x-date-pickers"),
        item("pickers-pro", "@mui/x-date-pickers-pro"),
    ),
    item(
        "charts", "Charts",
        item("charts-community", "@mui/x-charts"),
    ),
    item(
        "tree-view", "Tree View",
        item("tree-view-community", "@mui/x-tree-view"),
    ),
)

val TreeViewShowcase = FC<Props> {
    Divider {
        variant = fullWidth

        Chip {
            label = ReactNode("SimpleTreeView")
        }
    }

    Box {
        sx {
            minHeight = 352.px
            minWidth = 250.px
        }

        SimpleTreeView {
            TreeItem {
                itemId = "grid"
                label = ReactNode("Data Grid")

                TreeItem {
                    itemId = "grid-community"
                    label = ReactNode("@mui/x-data-grid")
                }
                TreeItem {
                    itemId = "grid-pro"
                    label = ReactNode("@mui/x-data-grid-pro")
                }
                TreeItem {
                    itemId = "grid-premium"
                    label = ReactNode("@mui/x-data-grid-premium")
                }
            }
            TreeItem {
                itemId = "pickers"
                label = ReactNode("Date and Time Pickers")

                TreeItem {
                    itemId = "pickers-community"
                    label = ReactNode("@mui/x-date-pickers")
                }
                TreeItem {
                    itemId = "pickers-pro"
                    label = ReactNode("@mui/x-date-pickers-pro")
                }
            }
            TreeItem {
                itemId = "charts"
                label = ReactNode("Charts")

                TreeItem {
                    itemId = "charts-community"
                    label = ReactNode("@mui/x-charts")
                }
            }
            TreeItem {
                itemId = "tree-view"
                label = ReactNode("Tree View")

                TreeItem {
                    itemId = "tree-view-community"
                    label = ReactNode("@mui/x-tree-view")
                }
            }
        }
    }

    Divider {
        variant = fullWidth

        Chip {
            label = ReactNode("RichTreeView")
        }
    }

    Box {
        sx {
            minHeight = 352.px
            minWidth = 250.px
        }

        RichTreeView {
            asDynamic().items = MUI_X_PRODUCTS
        }
    }
}
