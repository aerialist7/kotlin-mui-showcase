package component

import react.Props
import react.dom.ReactHTML.div
import react.fc
import react.useState
import ringui.SmartTabs
import ringui.Tab
import ringui.TabsProps
import showcase.AccordionShowcase

external interface ComponentPanelProps : Props

val ComponentPanel = fc<ComponentPanelProps> {
    var showcaseId by useState("Accordion")

    SmartTabs {
        // TODO: Fix SmartTabs props
        attrs.unsafeCast<TabsProps>().apply {
            autoCollapse = true
            selected = showcaseId
            onSelect = { showcaseId = it }
        }
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
                attrs {
                    title = it
                    id = it
                }
            }
        }
    }
    // TODO: Use react-router instead
    when (showcaseId) {
        "Accordion" -> AccordionShowcase()
        else -> div { +"TBD" }
    }
}
