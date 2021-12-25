import component.*
import csstype.Display
import csstype.px
import kotlinext.js.jso
import kotlinx.browser.document
import mui.system.Box
import org.w3c.dom.HTMLDivElement
import react.*
import react.dom.render

private val App = FC<Props> {
    val components = useMemo {
        mapOf(
            "Accordion" to AccordionShowcase,
            "Alert" to AlertShowcase,
            "App Bar" to AppBarShowcase,
            "Autocomplete" to AutocompleteShowcase,
            "Avatar" to AvatarShowcase,
            "Backdrop" to BackdropShowcase,
            "Badge" to BadgeShowcase,
            "Bottom Navigation" to BottomNavigationShowcase,
            "Breadcrumbs" to BreadcrumbsShowcase,
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
            "Table" to TableShowcase,
            "Tabs" to TabsShowcase,
            "Text Field" to TextFieldShowcase,
            "Toggle Button" to ToggleButtonShowcase,
            "Tooltip" to TooltipShowcase,
        )
    }
    var selectedComponentName by useState("Accordion")

    Box {
        sx = jso {
            display = Display.flex
        }

        Header()

        Sidebar {
            items = components.keys
            selectedItem = selectedComponentName
            onSelectedItemChange = { selectedComponentName = it }
        }

        Showcase {
            // TODO: Use react-router instead
            components.getValue(selectedComponentName)()
        }
    }
}

fun main() {
    val container = document.createElement("div").unsafeCast<HTMLDivElement>().apply {
        style.minHeight = "100vh"
        style.display = "flex"
        style.flexDirection = "column"
    }
    document.body!!.appendChild(container)

    render(App.create(), container)
}

object Sizes {
    object Header {
        val Height = 64.px
    }

    object Sidebar {
        val Width = 168.px
    }
}
