package component

import csstype.px
import kotlinext.js.jso
import mui.material.Autocomplete
import react.FC
import react.Props
import react.ReactNode

val AutocompleteShowcase = FC<Props> {
    Autocomplete {
        disablePortal = true
        renderInput = { ReactNode("Movie") }
        sx = jso {
            width = 300.px
        }

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
