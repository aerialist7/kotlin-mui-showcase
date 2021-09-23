package showcase

import mui.material.BottomNavigation
import mui.material.BottomNavigationAction
import react.Props
import react.ReactNode
import react.fc
import react.useState

val BottomNavigation = fc<Props> {
    var state by useState(0)
    BottomNavigation {
        attrs {
            showLabels = true
            value = state // TODO: value shouldn't be Any [MUI]
            onChange = { _, value -> state = value }
        }
        BottomNavigationAction {
            attrs.label = "Recents".unsafeCast<ReactNode>() // TODO: Unable to use string-labels [MUI]
            attrs.icon = "1".unsafeCast<ReactNode>() // TODO: Unable to use [MUI] Icons
        }
        BottomNavigationAction {
            attrs.label = "Favorites".unsafeCast<ReactNode>()
            attrs.icon = "2".unsafeCast<ReactNode>()
        }
        BottomNavigationAction {
            attrs.label = "Nearby".unsafeCast<ReactNode>()
            attrs.icon = "3".unsafeCast<ReactNode>()
        }
    }
}