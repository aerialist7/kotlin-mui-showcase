package io.github.aerialist7.showcase.material.navigation

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
        value = state
        onChange = { _, value -> state = value.toString().toInt() }

        BottomNavigationAction {
            label = ReactNode("Resents")
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
