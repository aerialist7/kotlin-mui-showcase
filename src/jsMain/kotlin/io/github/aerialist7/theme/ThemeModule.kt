package io.github.aerialist7.theme

import mui.material.CssBaseline
import mui.material.styles.Theme
import mui.material.styles.ThemeProvider
import mui.material.useMediaQuery
import react.FC
import react.PropsWithChildren
import react.useState
import web.storage.localStorage

private const val THEME_STORAGE_KEY = "theme"
private const val DARK = "dark"
private const val LIGHT = "light"

val ThemeModule = FC<PropsWithChildren> { props ->
    val prefersDark = useMediaQuery("(prefers-color-scheme: dark)")

    // The selected theme is remembered; until then the theme follows the system color scheme.
    var storedTheme by useState { localStorage.getItem(THEME_STORAGE_KEY) }

    val theme = when (storedTheme) {
        DARK -> Themes.Dark
        LIGHT -> Themes.Light
        else -> if (prefersDark) Themes.Dark else Themes.Light
    }

    val setTheme = { newTheme: Theme ->
        val value = if (newTheme == Themes.Dark) DARK else LIGHT
        localStorage.setItem(THEME_STORAGE_KEY, value)
        storedTheme = value
    }

    ThemeContext(ThemeState(theme, setTheme)) {
        ThemeProvider {
            this.theme = theme

            CssBaseline()
            +props.children
        }
    }
}
