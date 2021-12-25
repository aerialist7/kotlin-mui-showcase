import Sizes.Header
import Sizes.Sidebar
import csstype.FlexGrow
import csstype.minus
import csstype.pct
import kotlinext.js.jso
import kotlinx.browser.window
import mui.icons.material.GitHub
import mui.material.AppBar
import mui.material.IconButton
import mui.material.Toolbar
import mui.material.Typography
import react.FC
import react.Props
import react.dom.aria.AriaHasPopup.`false`
import react.dom.aria.ariaHasPopup
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML.div

val Header = FC<Props> {
    AppBar {
        position = "fixed"
        sx = jso {
            width = 100.pct - Sidebar.Width
            height = Header.Height
            marginLeft = Sidebar.Width
        }

        Toolbar {
            Typography {
                sx = jso {
                    flexGrow = FlexGrow(1.0)
                }
                variant = "h6"
                noWrap = true
                asDynamic().component = div

                +"Kotlin MUI Showcase"
            }

            // TODO: Add IconButton with a link to https://mui.com/getting-started/usage/

            IconButton {
                size = "large"
                color = "inherit"
                title = "Author Account"
                onClick = { window.location.href = "https://github.com/aerialist7/" }

                ariaLabel = "author account"
                ariaHasPopup = `false`

                GitHub()
            }
        }
    }
}
