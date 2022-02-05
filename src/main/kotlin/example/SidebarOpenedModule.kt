package example

import react.*

typealias SidebarOpenedState = StateInstance<Boolean>

val SidebarOpenedContext = createContext<SidebarOpenedState>()

val SidebarOpenedModule = FC<PropsWithChildren> { props ->
    val isOpen = useState(true)

    SidebarOpenedContext.Provider(isOpen) {
        props.children()
    }
}
