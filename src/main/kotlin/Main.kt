import component.*
import csstype.*
import kotlinext.js.jso
import kotlinx.browser.document
import kotlinx.browser.window
import mui.icons.material.GitHub
import mui.material.*
import mui.system.Box
import org.w3c.dom.HTMLDivElement
import react.*
import react.dom.aria.AriaHasPopup.`false`
import react.dom.aria.ariaHasPopup
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.main
import react.dom.html.ReactHTML.nav
import react.dom.render

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

    val application = Fragment.create {
        Showcase()
    }

    render(application, container)
}

private val headerHeight = 64.px
private val drawerWidth = 185.px

private val Showcase = FC<Props> {
    var activeShowcase by useState("Accordion")

    Box {
        sx = jso {
            display = Display.flex
        }

        AppBar {
            position = "fixed"
            sx = jso {
                width = 100.pct - drawerWidth
                height = headerHeight
                marginLeft = drawerWidth
            }

            Toolbar {
                Typography {
                    sx = jso {
                        flexGrow = FlexGrow(1.0)
                    }
                    variant = "h6"
                    noWrap = true
                    asDynamic().component = div

                    +"Kotlin MUI Showcase"
                }

                IconButton {
                    size = "large"
                    color = "inherit"
                    title = "Author Account"
                    onClick = { window.location.href = "https://github.com/aerialist7/" }

                    ariaLabel = "author account"
                    ariaHasPopup = `false`

                    GitHub()
                }
            }
        }

        Box {
            component = nav
            sx = jso {
                width = drawerWidth
                flexShrink = FlexShrink(0.0)
            }

            Drawer {
                sx = jso {
                    width = drawerWidth // todo check this props seems they don t work
                    boxSizing = BoxSizing.borderBox
                    flexShrink = FlexShrink(0.0)
                    variant = "permanent"
                    anchor = "left"
                    open = true
                }

                // TODO: DrawerHeader
                Divider()

                List {
                    showcases.map { (showcaseName) ->
                        ListItemButton {
                            // TODO: Needs an ability to set generic type to `ListItemButton` component [MUI]
                            this as ListItemButtonBaseProps

                            selected = activeShowcase == showcaseName
                            onClick = { activeShowcase = showcaseName }

                            ListItemText {
                                primary = ReactNode(showcaseName)
                            }
                        }
                    }
                }
            }
        }

        Box {
            component = main
            sx = jso {
                flexGrow = FlexGrow(1.0)
                marginTop = headerHeight
                padding = 30.px
            }

            // TODO: Use react-router instead
            showcases.getValue(activeShowcase)()
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
