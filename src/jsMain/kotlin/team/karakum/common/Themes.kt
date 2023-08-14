package team.karakum.common

import js.core.jso
import mui.material.PaletteMode.Companion.dark
import mui.material.PaletteMode.Companion.light
import mui.material.styles.TypographyOptions
import mui.material.styles.TypographyVariant.Companion.h6
import mui.material.styles.createTheme
import web.cssom.atrule.maxWidth
import web.cssom.integer
import web.cssom.px
import web.cssom.rem

private val TYPOGRAPHY_OPTIONS = TypographyOptions {
    fontWeight = integer(500)

    h6 {
        fontSize = 1.5.rem

        media(maxWidth(599.px)) {
            fontSize = 1.25.rem
        }
    }
}

object Themes {
    val Light = createTheme(
        jso {
            palette = jso { mode = light }
            typography = TYPOGRAPHY_OPTIONS
        }
    )

    val Dark = createTheme(
        jso {
            palette = jso { mode = dark }
            typography = TYPOGRAPHY_OPTIONS
        }
    )
}
