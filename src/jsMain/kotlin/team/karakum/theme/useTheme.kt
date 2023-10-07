package team.karakum.theme

import mui.material.styles.Theme
import react.*

val ThemeContext: RequiredContext<StateInstance<Theme>> =
    createRequiredContext()

fun useTheme(): Theme =
    useRequiredContext(ThemeContext).component1()

fun useSetTheme(): StateSetter<Theme> =
    useRequiredContext(ThemeContext).component2()
