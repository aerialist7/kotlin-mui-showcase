package io.github.aerialist7.showcase.material.muix

import io.github.aerialist7.label
import mui.material.Stack
import mui.system.responsive
import mui.system.sx
import muix.pickers.AdapterDateFns
import muix.pickers.DatePicker
import muix.pickers.DateTimePicker
import muix.pickers.LocalizationProvider
import muix.pickers.TimePicker
import react.FC
import react.Props
import react.ReactNode
import web.cssom.px

val DateAndTimePickersShowcase = FC<Props> {
    LocalizationProvider {
        dateAdapter = AdapterDateFns

        Stack {
            sx { maxWidth = 300.px }
            spacing = responsive(2)

            DatePicker {
                label = ReactNode("Basic date picker")
            }
            TimePicker {
                label = ReactNode("Basic time picker")
            }
            DateTimePicker {
                label = ReactNode("Basic date time picker")
            }
        }
    }
}
