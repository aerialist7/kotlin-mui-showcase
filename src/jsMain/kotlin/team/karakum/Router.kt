package team.karakum

import js.core.jso
import react.router.dom.createHashRouter
import remix.run.router.LoaderFunction
import remix.run.router.Router
import team.karakum.error.ErrorPage
import team.karakum.page.Page
import team.karakum.showcase.Showcase
import team.karakum.showcase.ShowcaseMaterial
import team.karakum.showcase.material.*
import kotlin.js.Promise.Companion.resolve

private val MATERIAL_SHOWCASES: Array<out Showcase> = arrayOf(
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
    Showcase("floating-action-button", "Floating Action Button", FloatingActionButtonShowcase),
    Showcase("image-list", "Image List", ImageListShowcase),
    Showcase("links", "Links", LinksShowcase),
    Showcase("lists", "Lists", ListsShowcase),
    Showcase("menus", "Menus", MenusShowcase),
    Showcase("pagination", "Pagination", PaginationShowcase),
    Showcase("paper", "Paper", PaperShowcase),
    Showcase("pickers", "Pickers", PickersShowcase),
    Showcase("popover", "Popover", PopoverShowcase),
    Showcase("popper", "Popper", PopperShowcase),
    Showcase("progress", "Progress", ProgressShowcase),
    Showcase("radio-buttons", "Radio Buttons", RadioButtonsShowcase),
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

private val PageLoader: LoaderFunction<*> = {
    resolve(MATERIAL_SHOWCASES)
}

private val ShowcaseMaterialLoader: LoaderFunction<*> = { args ->
    resolve(MATERIAL_SHOWCASES.single { it.key == args.params["showcaseId"] })
}

val Router: Router = createHashRouter(
    routes = arrayOf(
        jso {
            path = "/"
            loader = PageLoader
            Component = Page
            ErrorBoundary = ErrorPage
            children = arrayOf(
                jso {
                    path = ":showcaseId"
                    loader = ShowcaseMaterialLoader
                    Component = ShowcaseMaterial
                    ErrorBoundary = ErrorPage
                },
                jso {
                    path = "*"
                    Component = ErrorPage
                }
            )
        },
    ),
)
