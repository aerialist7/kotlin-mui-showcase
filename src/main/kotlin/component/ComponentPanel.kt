package component

import react.Props
import react.dom.ReactHTML.div
import react.fc
import react.useState
import ringui.SmartTabs
import ringui.Tab
import ringui.TabsProps
import showcase.*

external interface ComponentPanelProps : Props

val ComponentPanel = fc<ComponentPanelProps> {
    var showcaseId by useState("Accordion")

    SmartTabs {
        // TODO: Fix SmartTabs props
        attrs.unsafeCast<TabsProps>().apply {
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
            "Breadcrumbs",
            "Button",
            "Card",
            "Checkbox",
            "Chip",
            "Dialog",
            "Drawer",
            "Fab",
            "Image List",
            "Input",
            "Linear Progress",
            "Link",
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
        "Alert" -> AlertShowcase()
        "App Bar" -> AppBarShowcase()
        "Autocomplete" -> AutocompleteShowcase()
        "Avatar" -> AvatarShowcase()
        "Backdrop" -> BackdropShowcase()
        "Badge" -> BadgeShowcase()
        "Bottom Navigation" -> BottomNavigationShowcase()
        "Button" -> ButtonShowcase()
        "Card" -> CardShowcase()
        "Checkbox" -> CheckboxShowcase()
        "Chip" -> ChipShowcase()
        "Dialog" -> DialogShowcase()
        "Drawer" -> DrawerShowcase()
        "Fab" -> FabShowcase()
        "Image List" -> ImageListShowcase()
        "Input" -> InputShowcase()
        "Linear Progress" -> LinearProgressShowcase()
        "Link" -> LinkShowcase()
        else -> div { +"TBD" }
    }
}
