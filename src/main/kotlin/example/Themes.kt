package example

import mui.material.styles.ThemeOptions
import mui.material.styles.createTheme

val themeDark = createTheme(js("({palette: { mode: 'dark' }})").unsafeCast<ThemeOptions>())
val themeLight = createTheme(js("({palette: { mode: 'light' }})").unsafeCast<ThemeOptions>())
