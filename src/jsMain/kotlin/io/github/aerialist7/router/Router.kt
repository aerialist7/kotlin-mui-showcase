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
import tanstack.router.core.notFound

private val MATERIAL_SHOWCASES: ReadonlyArray<Showcase> = arrayOf(
    // inputs
    Showcase("material-ui/react-autocomplete", "Autocomplete", "inputs/Autocomplete.kt", AutocompleteShowcase),
    Showcase("material-ui/react-button", "Button", "inputs/Button.kt", ButtonShowcase),
    Showcase("material-ui/react-button-group", "Button Group", "inputs/ButtonGroup.kt", ButtonGroupShowcase),
    Showcase("material-ui/react-checkbox", "Checkbox", "inputs/Checkbox.kt", CheckboxShowcase),
    Showcase(
        "material-ui/react-floating-action-button", "Floating Action Button",
        "inputs/FloatingActionButton.kt", FloatingActionButtonShowcase,
    ),
    Showcase("material-ui/react-radio-button", "Radio Group", "inputs/RadioGroup.kt", RadioGroupShowcase),
    Showcase("material-ui/react-rating", "Rating", "inputs/Rating.kt", RatingShowcase),
    Showcase("material-ui/react-select", "Select", "inputs/Select.kt", SelectShowcase),
    Showcase("material-ui/react-slider", "Slider", "inputs/Slider.kt", SliderShowcase),
    Showcase("material-ui/react-switch", "Switch", "inputs/Switch.kt", SwitchShowcase),
    Showcase("material-ui/react-text-field", "Text Field", "inputs/TextField.kt", TextFieldShowcase),
    Showcase("material-ui/react-transfer-list", "Transfer List", "inputs/TransferList.kt", TransferListShowcase),
    Showcase("material-ui/react-toggle-button", "Toggle Button", "inputs/ToggleButton.kt", ToggleButtonShowcase),

    // data display
    Showcase("material-ui/react-avatar", "Avatar", "data/Avatar.kt", AvatarShowcase),
    Showcase("material-ui/react-badge", "Badge", "data/Badge.kt", BadgeShowcase),
    Showcase("material-ui/react-chip", "Chip", "data/Chip.kt", ChipShowcase),
    Showcase("material-ui/react-divider", "Divider", "data/Divider.kt", DividerShowcase),
    Showcase("material-ui/icons", "Icons", "data/Icons.kt", IconsShowcase),
    Showcase("material-ui/react-list", "List", "data/List.kt", ListShowcase),
    Showcase("material-ui/react-table", "Table", "data/Table.kt", TableShowcase),
    Showcase("material-ui/react-tooltip", "Tooltip", "data/Tooltip.kt", TooltipShowcase),
    Showcase("material-ui/react-typography", "Typography", "data/Typography.kt", TypographyShowcase),

    // feedback
    Showcase("material-ui/react-alert", "Alert", "feedback/Alert.kt", AlertShowcase),
    Showcase("material-ui/react-backdrop", "Backdrop", "feedback/Backdrop.kt", BackdropShowcase),
    Showcase("material-ui/react-dialog", "Dialog", "feedback/Dialog.kt", DialogShowcase),
    Showcase("material-ui/react-progress", "Progress", "feedback/Progress.kt", ProgressShowcase),
    Showcase("material-ui/react-skeleton", "Skeleton", "feedback/Skeleton.kt", SkeletonShowcase),
    Showcase("material-ui/react-snackbar", "Snackbar", "feedback/Snackbar.kt", SnackbarShowcase),

    // surfaces
    Showcase("material-ui/react-accordion", "Accordion", "surfaces/Accordion.kt", AccordionShowcase),
    Showcase("material-ui/react-app-bar", "App Bar", "surfaces/AppBar.kt", AppBarShowcase),
    Showcase("material-ui/react-card", "Card", "surfaces/Card.kt", CardShowcase),
    Showcase("material-ui/react-paper", "Paper", "surfaces/Paper.kt", PaperShowcase),

    // navigation
    Showcase(
        "material-ui/react-bottom-navigation", "Bottom Navigation",
        "navigation/BottomNavigation.kt", BottomNavigationShowcase,
    ),
    Showcase("material-ui/react-breadcrumbs", "Breadcrumbs", "navigation/Breadcrumbs.kt", BreadcrumbsShowcase),
    Showcase("material-ui/react-drawer", "Drawer", "navigation/Drawer.kt", DrawerShowcase),
    Showcase("material-ui/react-link", "Link", "navigation/Link.kt", LinkShowcase),
    Showcase("material-ui/react-menu", "Menu", "navigation/Menu.kt", MenuShowcase),
    Showcase("material-ui/react-pagination", "Pagination", "navigation/Pagination.kt", PaginationShowcase),
    Showcase("material-ui/react-speed-dial", "Speed Dial", "navigation/SpeedDial.kt", SpeedDialShowcase),
    Showcase("material-ui/react-stepper", "Stepper", "navigation/Stepper.kt", StepperShowcase),
    Showcase("material-ui/react-tabs", "Tabs", "navigation/Tabs.kt", TabsShowcase),

    // layout
    Showcase("material-ui/react-box", "Box", "layout/Box.kt", BoxShowcase),
    Showcase("material-ui/react-container", "Container", "layout/Container.kt", ContainerShowcase),
    Showcase("material-ui/react-grid", "Grid", "layout/Grid.kt", GridShowcase),
    Showcase("material-ui/react-stack", "Stack", "layout/Stack.kt", StackShowcase),
    Showcase("material-ui/react-image-list", "Image List", "layout/ImageList.kt", ImageListShowcase),

    // utils
    Showcase("material-ui/react-css-baseline", "CSS Baseline", "utils/CssBaseline.kt", CssBaselineShowcase),
    Showcase("material-ui/react-modal", "Modal", "utils/Modal.kt", ModalShowcase),
    Showcase("material-ui/react-popover", "Popover", "utils/Popover.kt", PopoverShowcase),
    Showcase("material-ui/react-popper", "Popper", "utils/Popper.kt", PopperShowcase),
    Showcase("material-ui/transitions", "Transitions", "utils/Transitions.kt", TransitionsShowcase),
    Showcase("material-ui/react-use-media-query", "useMediaQuery", "utils/UseMediaQuery.kt", UseMediaQueryShowcase),

    // labs
    Showcase("material-ui/react-masonry", "Masonry", "lab/Masonry.kt", MasonryShowcase),
    Showcase("material-ui/react-timeline", "Timeline", "lab/Timeline.kt", TimelineShowcase),

    // muix
    Showcase("x/react-data-grid", "Data Grid", "muix/DataGrid.kt", DataGridShowcase),
    Showcase("x/react-date-pickers", "Date and Time Pickers", "muix/DateAndTimePickers.kt", DateAndTimePickersShowcase),
    Showcase("x/react-charts", "Charts", "muix/Charts.kt", ChartsShowcase),
    Showcase("x/react-tree-view", "Tree View", "muix/TreeView.kt", TreeViewShowcase),
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

private val indexRoute = createRoute(
    options = RouteOptions(
        getParentRoute = { rootRoute },
        path = RoutePath("/"),
    ),
)

private val showcaseRoute = createRoute(
    options = RouteOptions(
        getParentRoute = { rootRoute },
        path = SHOWCASE_ROUTE_PATH,
        loader = RouteLoaderFn { context ->
            val showcaseId = context.params[SHOWCASE_ID_PARAM]
            MATERIAL_SHOWCASES.singleOrNull { it.key == showcaseId } ?: notFound()
        },
        component = ShowcaseMaterial,
    ),
)

private val routeTree = rootRoute.also {
    it.addChildren(arrayOf(indexRoute, showcaseRoute))
}

val Router: Router = createRouter(
    options = RouterOptions(
        history = createHashHistory(),
        routeTree = routeTree,
        defaultErrorComponent = ErrorPage,
        defaultNotFoundComponent = NotFoundPage,
    ),
)
