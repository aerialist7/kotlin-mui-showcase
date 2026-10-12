package io.github.aerialist7.router

import io.github.aerialist7.error.ErrorPage
import io.github.aerialist7.error.NotFoundPage
import io.github.aerialist7.page.Page
import io.github.aerialist7.showcase.Showcase
import io.github.aerialist7.showcase.ShowcaseMaterial
import io.github.aerialist7.showcase.material.data.*
import io.github.aerialist7.showcase.material.feedback.*
import io.github.aerialist7.showcase.material.inputs.*
import io.github.aerialist7.showcase.material.lab.MasonryShowcase
import io.github.aerialist7.showcase.material.lab.TimelineShowcase
import io.github.aerialist7.showcase.material.layout.*
import io.github.aerialist7.showcase.material.muix.ChartsShowcase
import io.github.aerialist7.showcase.material.muix.DataGridShowcase
import io.github.aerialist7.showcase.material.muix.DateAndTimePickersShowcase
import io.github.aerialist7.showcase.material.muix.TreeViewShowcase
import io.github.aerialist7.showcase.material.navigation.*
import io.github.aerialist7.showcase.material.surfaces.AccordionShowcase
import io.github.aerialist7.showcase.material.surfaces.AppBarShowcase
import io.github.aerialist7.showcase.material.surfaces.CardShowcase
import io.github.aerialist7.showcase.material.surfaces.PaperShowcase
import io.github.aerialist7.showcase.material.utils.*
import js.array.ReadonlyArray
import tanstack.history.createHashHistory
import tanstack.react.router.*
import tanstack.router.core.ParamName
import tanstack.router.core.RouteLoaderFn
import tanstack.router.core.RoutePath

private val MATERIAL_SHOWCASES: ReadonlyArray<Showcase> = arrayOf(
    // inputs
    Showcase("material-ui/react-autocomplete", "Autocomplete", AutocompleteShowcase),
    Showcase("material-ui/react-button", "Button", ButtonShowcase),
    Showcase("material-ui/react-button-group", "Button Group", ButtonGroupShowcase),
    Showcase("material-ui/react-checkbox", "Checkbox", CheckboxShowcase),
    Showcase("material-ui/react-floating-action-button", "Floating Action Button", FloatingActionButtonShowcase),
    Showcase("material-ui/react-radio-button", "Radio Group", RadioGroupShowcase),
    Showcase("material-ui/react-rating", "Rating", RatingShowcase),
    Showcase("material-ui/react-select", "Select", SelectShowcase),
    Showcase("material-ui/react-slider", "Slider", SliderShowcase),
    Showcase("material-ui/react-switch", "Switch", SwitchShowcase),
    Showcase("material-ui/react-text-field", "Text Field", TextFieldShowcase),
    Showcase("material-ui/react-transfer-list", "Transfer List", TransferListShowcase),
    Showcase("material-ui/react-toggle-button", "Toggle Button", ToggleButtonShowcase),

    // data display
    Showcase("material-ui/react-avatar", "Avatar", AvatarShowcase),
    Showcase("material-ui/react-badge", "Badge", BadgeShowcase),
    Showcase("material-ui/react-chip", "Chip", ChipShowcase),
    Showcase("material-ui/react-divider", "Divider", DividerShowcase),
    Showcase("material-ui/icons", "Icons", IconsShowcase),
    Showcase("material-ui/react-list", "List", ListShowcase),
    Showcase("material-ui/react-table", "Table", TableShowcase),
    Showcase("material-ui/react-tooltip", "Tooltip", TooltipShowcase),
    Showcase("material-ui/react-typography", "Typography", TypographyShowcase),

    // feedback
    Showcase("material-ui/react-alert", "Alert", AlertShowcase),
    Showcase("material-ui/react-backdrop", "Backdrop", BackdropShowcase),
    Showcase("material-ui/react-dialog", "Dialog", DialogShowcase),
    Showcase("material-ui/react-progress", "Progress", ProgressShowcase),
    Showcase("material-ui/react-skeleton", "Skeleton", SkeletonShowcase),
    Showcase("material-ui/react-snackbar", "Snackbar", SnackbarShowcase),

    // surfaces
    Showcase("material-ui/react-accordion", "Accordion", AccordionShowcase),
    Showcase("material-ui/react-app-bar", "App Bar", AppBarShowcase),
    Showcase("material-ui/react-card", "Card", CardShowcase),
    Showcase("material-ui/react-paper", "Paper", PaperShowcase),

    // navigation
    Showcase("material-ui/react-bottom-navigation", "Bottom Navigation", BottomNavigationShowcase),
    Showcase("material-ui/react-breadcrumbs", "Breadcrumbs", BreadcrumbsShowcase),
    Showcase("material-ui/react-drawer", "Drawer", DrawerShowcase),
    Showcase("material-ui/react-link", "Link", LinkShowcase),
    Showcase("material-ui/react-menu", "Menu", MenuShowcase),
    Showcase("material-ui/react-pagination", "Pagination", PaginationShowcase),
    Showcase("material-ui/react-speed-dial", "Speed Dial", SpeedDialShowcase),
    Showcase("material-ui/react-stepper", "Stepper", StepperShowcase),
    Showcase("material-ui/react-tabs", "Tab", TabsShowcase),

    // layout
    Showcase("material-ui/react-box", "Box", BoxShowcase),
    Showcase("material-ui/react-container", "Container", ContainerShowcase),
    Showcase("material-ui/react-grid", "Grid", GridShowcase),
    Showcase("material-ui/react-stack", "Stack", StackShowcase),
    Showcase("material-ui/react-image-list", "Image List", ImageListShowcase),

    // utils
    Showcase("material-ui/react-css-baseline", "CSS Baseline", CssBaselineShowcase),
    Showcase("material-ui/react-modal", "Modal", ModalShowcase),
    Showcase("material-ui/react-popover", "Popover", PopoverShowcase),
    Showcase("material-ui/react-popper", "Popper", PopperShowcase),
    Showcase("material-ui/transitions", "Transitions", TransitionsShowcase),
    Showcase("material-ui/react-use-media-query", "useMediaQuery", UseMediaQueryShowcase),

    // labs
    Showcase("material-ui/react-masonry", "Masonry", MasonryShowcase),
    Showcase("material-ui/react-timeline", "Timeline", TimelineShowcase),

    // muix
    Showcase("x/react-data-grid", "Data Grid", DataGridShowcase),
    Showcase("x/react-date-pickers", "Date and Time Pickers", DateAndTimePickersShowcase),
    Showcase("x/react-charts", "Charts", ChartsShowcase),
    Showcase("x/react-tree-view", "Tree View", TreeViewShowcase),
)

val SHOWCASE_ID_PARAM = ParamName("showcaseId")
val SHOWCASE_ROUTE_PATH = RoutePath("/", SHOWCASE_ID_PARAM)

private val rootRoute = createRootRoute(
    options = RootRouteOptions(
        loader = RouteLoaderFn {
            MATERIAL_SHOWCASES
        },
        component = Page,
    ),
)

private val showcaseRoute = createRoute(
    options = RouteOptions(
        getParentRoute = { rootRoute },
        path = SHOWCASE_ROUTE_PATH,
        loader = RouteLoaderFn { context ->
            MATERIAL_SHOWCASES.single { it.key == context.params[SHOWCASE_ID_PARAM] }
        },
        component = ShowcaseMaterial,
    ),
)

private val routeTree = rootRoute.also {
    it.addChildren(arrayOf(showcaseRoute))
}

val Router: Router = createRouter(
    options = RouterOptions(
        history = createHashHistory(),
        routeTree = routeTree,
        defaultErrorComponent = ErrorPage,
        defaultNotFoundComponent = NotFoundPage,
    ),
)
