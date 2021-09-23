package showcase

import mui.material.AppBar
import mui.material.Box
import mui.material.Toolbar
import mui.material.IconButton
import mui.material.Typography
import mui.material.Button
import react.Props
import react.fc

val AppBar = fc<Props> {
    Box {
        // TODO: Unable to use 'sx' [MUI]
        AppBar {
            attrs.position = "static"
            Toolbar {
                IconButton {
                    attrs {
                        size = "large"
                        edge = "start"
                        color = "inherit"
                        // TODO: Unable to use 'aria-label' [MUI]
                        // TODO: Unable to use 'sx' [MUI]
                        // TODO: Unable to use MenuIcon [MUI] component
                    }
                    Typography {
                        attrs {
                            variant = "h6"
                            // TODO: Unable to use 'compoennt' [MUI]
                            // TODO: Unable to use 'sx' [MUI]
                            +"News"
                        }
                    }
                    Button {
                        attrs.color = "inherit"
                        +"Login"
                    }
                }
            }
        }
    }
}
