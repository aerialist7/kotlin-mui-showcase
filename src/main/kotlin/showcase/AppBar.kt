package showcase

import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.Props
import react.fc

val AppBarShowcase = fc<Props> {
    Box {
        attrs.sx = jso {
            flexGrow = FlexGrow(1.0)
        }
        AppBar {
            attrs.position = "static"
            Toolbar {
                IconButton {
                    attrs {
                        size = "large"
                        edge = "start"
                        color = "inherit"
                        sx = jso {
                            marginRight = 2.px
                        }
                        // TODO: Unable to use 'aria-label="menu"' [MUI]
                        // TODO: Unable to use MenuIcon [MUI] component
                    }
                    Typography {
                        attrs {
                            variant = "h6"
                            sx = jso {
                                flexGrow = FlexGrow(1.0)
                            }
                            // TODO: Unable to use 'component="div"' [MUI]
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
