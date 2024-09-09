package io.github.aerialist7.showcase.material.utils

import mui.material.Box
import mui.material.Fade
import mui.material.FormControlLabel
import mui.material.Switch
import mui.system.sx
import react.*
import web.cssom.Display
import web.cssom.px
import mui.icons.material.WarningAmber as WarningAmberIcon

val TransitionsShowcase = FC<Props> {
    var isChecked by useState(false)

    Box {
        sx {
            height = 180.px
        }

        FormControlLabel {
            control = Switch.create {
                checked = isChecked
                onChange = { _, _ -> isChecked = !isChecked }
            }
            label = ReactNode("Show")

            Box {
                sx {
                    display = Display.flex
                }

                Fade {
                    `in` = isChecked

                    // TODO: Check why don't shows
                    WarningAmberIcon()
                }
            }
        }
    }
}
