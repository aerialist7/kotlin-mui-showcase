package team.karakum.component

import react.FC
import react.PropsWithChildren
import react.createContext
import team.karakum.entity.Showcases
import team.karakum.hook.useShowcases

val ShowcasesContext = createContext<Showcases>()

val ShowcasesModule = FC<PropsWithChildren> { props ->
    val users = useShowcases()

    ShowcasesContext.Provider(users) {
        +props.children
    }
}
