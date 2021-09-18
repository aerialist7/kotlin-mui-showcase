package component

import kotlinext.js.jso
import react.Props
import react.fc
import ringui.Footer
import ringui.FooterItem

external interface FooterProps : Props

val Footer = fc<FooterProps> {
    Footer {
        attrs.left = arrayOf<FooterItem>(
            jso {
                label = "MUI Docs"
                url = "https://mui.com/getting-started/usage/"
            },
        )
        attrs.center = arrayOf<FooterItem>(
            jso {
                label = "Copyright © 2021 github.com@aerialist7"
                url = "https://github.com/aerialist7"
            },
        )
        attrs.right = arrayOf<FooterItem>(
            jso {
                label = "Feedback"
                url = "https://kotlinlang.slack.com/team/UAGAL3CJE"
            }
        )
    }
}
