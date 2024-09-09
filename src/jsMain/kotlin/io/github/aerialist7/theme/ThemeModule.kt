package io.github.aerialist7.theme

import mui.material.CssBaseline
import mui.material.styles.ThemeProvider
import react.FC
import react.PropsWithChildren
import react.useState

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
