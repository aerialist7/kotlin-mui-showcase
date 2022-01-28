package example

import mui.system.ThemeProvider
import react.*

data class SidebarOpened(
    val value: Boolean,
    val setValue: StateSetter<Boolean>,
    val darkMode: Boolean,
    val setDarkMode: StateSetter<Boolean>
)

val SidebarOpenedContext = createContext<SidebarOpened>()

val SidebarOpenedModule = FC<PropsWithChildren> { props ->
    val (darkMode, setDarkMode) = useState(false)
    val (open, setOpen) = useState(true)
    val sidebarOpened = useMemo(open, setOpen, darkMode, setDarkMode) {
        SidebarOpened(open, setOpen, darkMode, setDarkMode)
    }

    SidebarOpenedContext.Provider(sidebarOpened) {
        val newTheme = if (darkMode) themeDark else themeLight
        ThemeProvider {
            theme = newTheme
            props.children()
        }
    }
}
