package io.github.aerialist7.theme

import js.objects.jso
import mui.material.PaletteMode
import mui.material.styles.TypographyOptions
import mui.material.styles.TypographyVariant
import mui.material.styles.createTheme
import web.cssom.atrule.maxWidth
import web.cssom.integer
import web.cssom.px
import web.cssom.rem

private val TYPOGRAPHY_OPTIONS = TypographyOptions {
    fontWeight = integer(500)

    TypographyVariant.h6 {
        fontSize = 1.5.rem

        media(maxWidth(599.px)) {
            fontSize = 1.25.rem
        }
    }
}

object Themes {
    val Light = createTheme(
        jso {
            palette = jso { mode = PaletteMode.light }
            typography = TYPOGRAPHY_OPTIONS
        }
    )

    val Dark = createTheme(
        jso {
            palette = jso { mode = PaletteMode.dark }
            typography = TYPOGRAPHY_OPTIONS
        }
    )
}
