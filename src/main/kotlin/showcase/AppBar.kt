package showcase

import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.FC
import react.Props

val AppBarShowcase = FC<Props> {
    Box {
        sx = jso {
            flexGrow = FlexGrow(1.0)
        }
        AppBar {
            position = "static"

            Toolbar {
                IconButton {
                    size = "large"
                    edge = "start"
                    color = "inherit"
                    sx = jso {
                        marginRight = 2.px
                    }
                    // TODO: Unable to use 'aria-label="menu"' [MUI]
                    // TODO: Unable to use MenuIcon [MUI] component

                    Typography {
                        variant = "h6"
                        sx = jso {
                            flexGrow = FlexGrow(1.0)
                        }
                        // TODO: Unable to use 'component="div"' [MUI]
                        +"News"
                    }
                    Button {
                        color = "inherit"
                        +"Login"
                    }
                }
            }
        }
    }
}
