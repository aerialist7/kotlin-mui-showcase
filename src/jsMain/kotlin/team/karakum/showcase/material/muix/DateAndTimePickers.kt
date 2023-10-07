package team.karakum.showcase.material.muix

import muix.pickers.AdapterDateFns
import muix.pickers.CalendarPicker
import muix.pickers.LocalizationProvider
import react.FC
import react.Props

val DateAndTimePickersShowcase = FC<Props> {
    LocalizationProvider {
        dateAdapter = AdapterDateFns
        CalendarPicker {
            onChange = { _, _ -> }
        }
    }
}
