package example.showcase

import mui.material.BottomNavigation
import mui.material.BottomNavigationAction
import react.FC
import react.Props
import react.ReactNode
import react.useState

val BottomNavigationShowcase = FC<Props> {
    var state by useState(0)

    BottomNavigation {
        showLabels = true
        // TODO: `value` shouldn't be `Any` [MUI]
        value = state
        onChange = { _, value -> state = value }

        BottomNavigationAction {
            label = ReactNode("Recents")
            icon = ReactNode("1")
        }
        BottomNavigationAction {
            label = ReactNode("Favorites")
            icon = ReactNode("2")
        }
        BottomNavigationAction {
            label = ReactNode("Nearby")
            icon = ReactNode("3")
        }
    }
}
