package io.github.aerialist7.page

import mui.material.BottomNavigation
import mui.material.BottomNavigationAction
import mui.system.sx
import react.FC
import react.ReactNode
import react.create
import react.dom.html.ReactHTML
import kotlin.text.Typography.nbsp
import mui.icons.material.BuildCircleOutlined as BuildCircleOutlinedIcon
import mui.icons.material.FavoriteOutlined as FavoriteOutlinedIcon
import mui.icons.material.FoundationOutlined as FoundationOutlinedIcon
import mui.icons.material.StarsOutlined as StarsOutlinedIcon

val Footer = FC {
    BottomNavigation {
        sx {
            gridArea = Area.Footer
        }

        component = ReactHTML.footer

        showLabels = true
        value = 1

        BottomNavigationAction {
            label = ReactNode("Joy${nbsp}UI")
            icon = StarsOutlinedIcon.create()
            disabled = true
        }
        BottomNavigationAction {
            label = ReactNode("Material${nbsp}UI")
            icon = FavoriteOutlinedIcon.create()
        }
        BottomNavigationAction {
            label = ReactNode("Base${nbsp}UI")
            icon = FoundationOutlinedIcon.create()
            disabled = true
        }
        BottomNavigationAction {
            label = ReactNode("System")
            icon = BuildCircleOutlinedIcon.create()
            disabled = true
        }
    }
}
