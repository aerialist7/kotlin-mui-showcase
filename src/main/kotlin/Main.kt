import csstype.*
import kotlinext.js.jso
import kotlinx.browser.document
import mui.material.*
import mui.system.Box
import org.w3c.dom.HTMLDivElement
import react.*
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import react.dom.render
import showcase.*

fun main() {
    val container = with(document) {
        createElement("div")
            .unsafeCast<HTMLDivElement>()
            .apply {
                style.minHeight = "100vh"
                style.display = "flex"
                style.flexDirection = "column"
            }
            .also { body!!.append(it) }
    }

    render(container) {
        Showcase()
    }
}

private val drawerWidth = 185.px

private val Showcase = fc<Props> {
    var activeShowcase by useState("Accordion")

    Box {
        attrs {
            sx = jso {
                display = Display.flex
            }
        }
        AppBar {
            attrs {
                position = "fixed"
                sx = jso {
                    width = 100.pct - drawerWidth
                    marginLeft = drawerWidth
                }
            }
            Toolbar {
                Typography {
                    attrs {
                        variant = "h6"
                        noWrap = true
                        asDynamic().component = div
                    }
                    +"Kotlin MUI Showcase"
                }
            }
        }
        Box {
            attrs {
                component = ReactHTML.nav
                sx = jso {
                    width = drawerWidth
                    flexShrink = FlexShrink(0.0)
                }
            }
            Drawer {
                attrs {
                    sx = jso {
                        width = drawerWidth // todo check this props seems they don t work
                        boxSizing = BoxSizing.borderBox
                        flexShrink = FlexShrink(0.0)
                        variant = "permanent"
                        anchor = "left"
                        open = true
                    }
                }
                // TODO: DrawerHeader
                Divider {}

                List {
                    showcases.map { (showcaseName) ->
                        ListItemButton {
                            attrs {
                                this as ListItemButtonBaseProps
                                selected = activeShowcase == showcaseName
                                onClick = { activeShowcase = showcaseName }
                            }
                            ListItemText {
                                attrs {
                                    primary = ReactNode(showcaseName)
                                }
                            }
                        }
                    }
                }
            }
        }
        Box {
            attrs {
                component = ReactHTML.main
//                sx = { { flexGrow: 1, p: 3, width: { sm: `calc(100% - ${drawerWidth}px)` } } }
            }
            Toolbar { }

            div {
                // TODO: Use react-router instead
                showcases.getValue(activeShowcase)()
            }
        }
    }
}

private val showcases: Map<String, FC<Props>>
    get() = mapOf(
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
