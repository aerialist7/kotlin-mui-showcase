package example

import react.*

data class SidebarOpened(
    val value: Boolean,
    val setValue: StateSetter<Boolean>,
)

val SidebarOpenedContext = createContext<SidebarOpened>()

val SidebarOpenedModule = FC<PropsWithChildren> { props ->
    val (open, setOpen) = useState(true)
    val sidebarOpened = useMemo(open, setOpen) {
        SidebarOpened(open, setOpen)
    }

    SidebarOpenedContext.Provider(sidebarOpened) {
        props.children()
    }
}
