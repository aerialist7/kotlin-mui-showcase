package io.github.aerialist7.showcase.material.muix

import mui.material.Box
import mui.system.sx
import muix.tree.view.SimpleTreeView
import muix.tree.view.TreeItem
import react.FC
import react.Props
import react.ReactNode
import web.cssom.px

val TreeViewShowcase = FC<Props> {
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
}
