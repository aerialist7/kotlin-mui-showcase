package team.karakum.component

import kotlinx.browser.window
import react.*

/**
 * @author vie10
 **/

typealias AdaptiveState = StateInstance<Int>

val AdaptiveContext = createContext<AdaptiveState>()

val AdaptiveModule = FC<PropsWithChildren> { props ->
    val state = useState(window.innerWidth)
    val (_, setWidth) = state
    window.onresize = {
        setWidth(window.innerWidth)
    }

    AdaptiveContext.Provider(state) {
        props.children()
    }
}

