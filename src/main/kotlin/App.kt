import csstype.Display
import csstype.FlexGrow
import csstype.px
import kotlinext.js.jso
import kotlinx.browser.document
import mui.system.Box
import org.w3c.dom.HTMLDivElement
import react.*
import react.dom.html.ReactHTML
import react.dom.render
import react.router.Outlet
import react.router.Route
import react.router.Routes
import react.router.dom.HashRouter
import showcase.*

fun main() {
    render(
        element = HashRouter.create {
            App()
        },
        container = document.createElement("div").unsafeCast<HTMLDivElement>().apply {
            style.minHeight = "100vh"
            style.display = "flex"
            style.flexDirection = "column"
            document.body!!.appendChild(this)
        },
    )
}

private val App = FC<Props> {
    val showcases = useMemo { SHOWCASES }

    Box {
        sx = jso {
            display = Display.flex
        }

        Header()

        Sidebar {
            value = showcases
        }

        Routes {
            Route {
                path = "/"
                element = Box.create {
                    component = ReactHTML.main
                    sx = jso {
                        flexGrow = FlexGrow(1.0)
                        marginTop = Sizes.Header.Height
                        padding = 30.px
                    }
                    Outlet()
                }

                Route {
                    index = true
                    element = Placeholder.create()
                }

                showcases.map { (key, _, Component) ->
                    Route {
                        path = key
                        element = Component.create()
                    }
                }

                Route {
                    path = "*"
                    element = ReactNode("404 Page Not Found")
                }
            }
        }
    }
}

object Sizes {
    object Header {
        val Height = 64.px
    }

    object Sidebar {
        val Width = 168.px
    }
}

data class Showcase(
    val key: String,
    val name: String,
    val Component: FC<Props>,
)

private val SHOWCASES
    get() = listOf(
        Showcase("accordion", "Accordion", AccordionShowcase),
        Showcase("alert", "Alert", AlertShowcase),
        Showcase("app-bar", "App Bar", AppBarShowcase),
        Showcase("autocomplete", "Autocomplete", AutocompleteShowcase),
        Showcase("avatars", "Avatars", AvatarsShowcase),
        Showcase("backdrop", "Backdrop", BackdropShowcase),
        Showcase("badges", "Badges", BadgesShowcase),
        Showcase("bottom-navigation", "Bottom Navigation", BottomNavigationShowcase),
        Showcase("breadcrumbs", "Breadcrumbs", BreadcrumbsShowcase),
        Showcase("buttons", "Buttons", ButtonsShowcase),
        Showcase("cards", "Cards", CardsShowcase),
        Showcase("checkboxes", "Checkboxes", CheckboxesShowcase),
        Showcase("chips", "Chips", ChipsShowcase),
        Showcase("dialogs", "Dialogs", DialogsShowcase),
        Showcase("drawers", "Drawers", DrawersShowcase),
        Showcase("floating-action-button", "FloatingActionButton", FloatingActionButtonShowcase),
        Showcase("image-list", "Image List", ImageListShowcase),
        Showcase("links", "Links", LinksShowcase),
        Showcase("lists", "Lists", ListsShowcase),
        Showcase("menus", "Menus", MenusShowcase),
        Showcase("pagination", "Pagination", PaginationShowcase),
        Showcase("paper", "Paper", PaperShowcase),
        Showcase("popover", "Popover", PopoverShowcase),
        Showcase("popper", "Popper", PopperShowcase),
        Showcase("progress", "Progress", ProgressShowcase),
        Showcase("radio-buttons", "RadioButtons", RadioButtonsShowcase),
        Showcase("rating", "Rating", RatingShowcase),
        Showcase("selects", "Selects", SelectsShowcase),
        Showcase("skeleton", "Skeleton", SkeletonShowcase),
        Showcase("slider", "Slider", SliderShowcase),
        Showcase("snackbars", "Snackbars", SnackbarsShowcase),
        Showcase("steppers", "Steppers", SteppersShowcase),
        Showcase("switches", "Switches", SwitchesShowcase),
        Showcase("tables", "Tables", TablesShowcase),
        Showcase("tabs", "Tabs", TabsShowcase),
        Showcase("text-fields", "Text Fields", TextFieldsShowcase),
        Showcase("toggle-button", "Toggle Button", ToggleButtonShowcase),
        Showcase("tooltips", "Tooltips", TooltipsShowcase),
    )
