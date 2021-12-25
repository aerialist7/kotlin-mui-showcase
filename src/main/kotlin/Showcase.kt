import Sizes.Header
import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import mui.system.Box
import react.FC
import react.PropsWithChildren
import react.dom.html.ReactHTML.main

val Showcase = FC<PropsWithChildren> {
    Box {
        component = main
        sx = jso {
            flexGrow = FlexGrow(1.0)
            marginTop = Header.Height
            padding = 30.px
        }

        it.children()
    }
}
