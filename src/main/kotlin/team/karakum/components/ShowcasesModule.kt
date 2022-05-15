package team.karakum.components

import react.FC
import react.PropsWithChildren
import react.createContext
import team.karakum.entities.Showcases
import team.karakum.hooks.useShowcases

val ShowcasesContext = createContext<Showcases>()

val ShowcasesModule = FC<PropsWithChildren> { props ->
    val users = useShowcases()

    ShowcasesContext(users) {
        +props.children
    }
}
