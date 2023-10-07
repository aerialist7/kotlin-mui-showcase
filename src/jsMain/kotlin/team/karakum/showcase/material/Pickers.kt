package team.karakum.showcase.material

import muix.pickers.AdapterDateFns
import muix.pickers.CalendarPicker
import muix.pickers.LocalizationProvider
import react.FC
import react.Props

val PickersShowcase = FC<Props> {
    LocalizationProvider {
        dateAdapter = AdapterDateFns
        CalendarPicker {
            onChange = { _, _ -> }
        }
    }
}
