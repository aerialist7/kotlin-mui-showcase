package component

import react.FunctionComponent
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.main
import react.fc
import react.useState
import ringui.SmartTabs
import ringui.Tab
import ringui.TabsProps
import showcase.*

external interface ComponentPanelProps : Props

val Showcase = fc<ComponentPanelProps> {
    var activeShowcase by useState("Accordion")

    main {
        SmartTabs {
            // TODO: Fix SmartTabs props
            attrs.unsafeCast<TabsProps>().apply {
                selected = activeShowcase
                onSelect = { activeShowcase = it }
            }
            showcases.map { (showcaseName) ->
                Tab {
                    attrs {
                        id = showcaseName
                        title = showcaseName
                    }
                }
            }
        }

        div {
            // TODO: Use react-router instead
            showcases.getValue(activeShowcase)()
        }
    }
}

private val showcases: Map<String, FunctionComponent<Props>>
    get() = mapOf(
        "Accordion" to AccordionShowcase,
        "Alert" to AlertShowcase,
        "App Bar" to AppBarShowcase,
        "Autocomplete" to AutocompleteShowcase,
        "Avatar" to AvatarShowcase,
        "Backdrop" to BackdropShowcase,
        "Badge" to BadgeShowcase,
        "Bottom Navigation" to BottomNavigationShowcase,
        "Button" to ButtonShowcase,
        "Card" to CardShowcase,
        "Checkbox" to CheckboxShowcase,
        "Chip" to ChipShowcase,
        "Dialog" to DialogShowcase,
        "Drawer" to DrawerShowcase,
        "Fab" to FabShowcase,
        "Image List" to ImageListShowcase,
        "Input" to InputShowcase,
        "Linear Progress" to LinearProgressShowcase,
        "Link" to LinkShowcase,
        "List" to ListShowcase,
        "Menu" to MenuShowcase,
        "Mobile Stepper" to MobileStepperShowcase,
        "Pagination" to PaginationShowcase,
        "Paper" to PaperShowcase,
        "Popover" to PopoverShowcase,
        "Popper" to PopperShowcase,
        "Radio" to RadioShowcase,
        "Rating" to RatingShowcase,
        "Select" to SelectShowcase,
        "Skeleton" to SkeletonShowcase,
        "Slider" to SliderShowcase,
        "Snackbar" to SnackbarShowcase,
        "Stepper" to StepperShowcase,
        "Switch" to SwitchShowcase,
    )
