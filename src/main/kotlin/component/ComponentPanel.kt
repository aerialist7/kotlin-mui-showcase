package component

import react.Props
import react.fc
import ringui.SmartTabs
import ringui.Tab

external interface ComponentPanelProps : Props

val ComponentPanel = fc<ComponentPanelProps> {
    SmartTabs {
        attrs.asDynamic().autoCollapse = true   // TODO: Fix SmartTabs props

        listOf(
            "Accordion",
            "Alert",
            "App Bar",
            "Autocomplete",
            "Avatar",
            "Backdrop",
            "Badge",
            "Bottom Navigation",
            "Box",
            "Breadcrumbs",
            "Button",
            "Button Group",
            "Card",
            "Checkbox",
            "Chip",
            "Container",
            "Dialog",
        ).map {
            Tab {
                attrs.title = it
            }
        }
    }
}
