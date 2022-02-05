package example

import kotlinext.js.jso
import mui.material.styles.Theme
import mui.material.styles.ThemeOptions
import mui.material.styles.ThemeProvider
import mui.material.styles.createTheme
import react.*

object Themes {

    val Dark: Theme = createThemeWithOptions {
        palette = jso {
            mode = "dark"
        }
    }

    val Light: Theme = createThemeWithOptions {
        palette = jso {
            mode = "light"
        }
    }

    private fun createThemeWithOptions(block: ThemeOptions.() -> Unit): Theme {
        val themeOptions: ThemeOptions = jso { block() }
        return createTheme(themeOptions)
    }
}

typealias ThemeState = StateInstance<Theme>

val ThemeContext = createContext<ThemeState>()

val ThemeModule = FC<PropsWithChildren> { props ->
    val themeState = useState(Themes.Light)

    ThemeContext.Provider(themeState) {
        ThemeProvider {
            theme = themeState.component1()
            props.children()
        }
    }
}
