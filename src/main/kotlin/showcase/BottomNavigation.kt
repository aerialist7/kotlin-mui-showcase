package showcase

import mui.material.BottomNavigation
import mui.material.BottomNavigationAction
import react.Props
import react.ReactNode
import react.fc
import react.useState

val BottomNavigationShowcase = fc<Props> {
    var state by useState(0)

    BottomNavigation {
        attrs {
            showLabels = true
            value = state // TODO: value shouldn't be Any [MUI]
            onChange = { _, value -> state = value }
        }
        BottomNavigationAction {
            attrs.label = ReactNode("Recents")
            attrs.icon = ReactNode("1")
        }
        BottomNavigationAction {
            attrs.label = ReactNode("Favorites")
            attrs.icon = ReactNode("2")
        }
        BottomNavigationAction {
            attrs.label = ReactNode("Nearby")
            attrs.icon = ReactNode("3")
        }
    }
}
