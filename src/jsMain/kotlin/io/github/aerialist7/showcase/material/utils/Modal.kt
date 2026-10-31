package io.github.aerialist7.showcase.material.utils

import io.github.aerialist7.muiShadow
import mui.material.Box
import mui.material.Button
import mui.material.Modal
import mui.material.Typography
import mui.material.styles.Theme
import mui.material.styles.TypographyVariant
import mui.material.styles.useTheme
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import react.useState
import web.cssom.*
import web.cssom.LineStyle.Companion.solid
import web.dom.ElementId

val ModalShowcase = FC<Props> {
    val theme = useTheme<Theme>()
    var isOpen by useState(false)

    div {
        Button {
            onClick = { isOpen = true }

            +"Open modal"
        }

        Modal {
            keepMounted = true
            open = isOpen
            onClose = { _, _ -> isOpen = false }

            ariaLabelledBy = ElementId("keep-mounted-modal-title")
            ariaDescribedBy = ElementId("keep-mounted-modal-description")

            Box {
                sx {
                    position = Position.absolute
                    top = 50.pct
                    left = 50.pct
                    transform = translate(-50.pct, -50.pct)
                    width = 400.px
                    backgroundColor = Color("background.paper")
                    border = Border(2.px, solid, Color("#000"))
                    boxShadow = theme.muiShadow(24)
                    padding = 32.px
                }

                Typography {
                    id = ElementId("keep-mounted-modal-title")
                    variant = TypographyVariant.h6
                    component = ReactHTML.h2

                    +"Text in modal"
                }

                Typography {
                    id = ElementId("keep-mounted-modal-description")
                    sx {
                        marginTop = 16.px
                    }

                    +"Duis mollis, est non commodo luctus, nisi erat porttitor ligula."
                }
            }
        }
    }
}
