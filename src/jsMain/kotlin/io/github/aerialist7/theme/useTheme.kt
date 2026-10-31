package io.github.aerialist7.theme

import mui.material.styles.Theme
import react.*

class ThemeState(
    val theme: Theme,
    val setTheme: (Theme) -> Unit,
)

val ThemeContext: RequiredContext<ThemeState> =
    createRequiredContext()

fun useTheme(): Theme =
    useRequired(ThemeContext).theme

fun useSetTheme(): (Theme) -> Unit =
    useRequired(ThemeContext).setTheme
