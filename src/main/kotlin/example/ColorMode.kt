package example

import kotlinext.js.jso
import mui.material.styles.*
import react.*

enum class PaletteMode(val paletteOptions: PaletteOptions) {
    Light(
        jso {
            mode = "light"
        }
    ),
    Dark(
        jso {
            mode = "dark"
        }
    )
}

typealias ColorModeState = StateInstance<PaletteMode>

val ColorModeContext = createContext<ColorModeState>()

val ColorModeModule = FC<PropsWithChildren> { props ->
    val paletteMode = useState(PaletteMode.Light)
    ColorModeContext.Provider(paletteMode) {
        props.children()
    }
}

val ColorModeThemeProvider = FC<PropsWithChildren> { props ->
    ThemeProvider {
        val (paletteMode) = useContext(ColorModeContext)
        theme = paletteMode.createThemeWithPaletteMode()

        props.children()
    }
}

private fun PaletteMode.createThemeWithPaletteMode(): Theme {
    val themeOptions: ThemeOptions = jso {
        palette = paletteOptions
    }
    return createTheme(themeOptions)
}
