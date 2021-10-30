package showcase

import csstype.px
import kotlinext.js.jso
import mui.material.Autocomplete
import react.Props
import react.ReactNode
import react.fc

val AutocompleteShowcase = fc<Props> {
    Autocomplete {
        attrs.sx = jso {
            width = 300.px
        }
        attrs.disablePortal = true
        attrs.renderInput = { ReactNode("Movie") }

        // TODO: AutocompleteOptions is currently unsupported [MUI]
    }
}

private val top5Films = listOf(
    "The Shawshank Redemption" to 1994,
    "The Godfather" to 1972,
    "The Lord of the Rings: The Return of the King" to 2003,
    "The Good, the Bad and the Ugly" to 1966,
    "Fight Club" to 1999,
)
