package io.github.aerialist7.showcase.material.data

import io.github.aerialist7.divider
import mui.material.Divider
import mui.material.List
import mui.material.ListItemButton
import mui.material.ListItemText
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML

val DividerShowcase = FC<Props> {
    List {
        component = ReactHTML.nav
        ariaLabel = "mailbox folders"

        ListItemButton {
            ListItemText {
                primary = ReactNode("Inbox")
            }
        }

        Divider()

        ListItemButton {
            divider = true

            ListItemText {
                primary = ReactNode("Drafts")
            }
        }

        ListItemButton {
            ListItemText {
                primary = ReactNode("Trash")
            }
        }

        Divider()

        ListItemButton {
            ListItemText {
                primary = ReactNode("Spam")
            }
        }
    }
}
