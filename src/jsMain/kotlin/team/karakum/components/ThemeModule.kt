package team.karakum.components

import mui.material.CssBaseline
import mui.material.styles.Theme
import mui.material.styles.ThemeProvider
import react.*
import team.karakum.common.Themes

typealias ThemeState = StateInstance<Theme>

val ThemeContext = createContext<ThemeState>()

val ThemeModule = FC<PropsWithChildren> { props ->
    val state = useState(Themes.Light)
    val (theme) = state

    ThemeContext(state) {
        ThemeProvider {
            this.theme = theme

            CssBaseline()
            +props.children
        }
    }
}
