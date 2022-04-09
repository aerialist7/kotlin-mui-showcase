package team.karakum

import csstype.Auto.auto
import csstype.Display
import csstype.GridTemplateAreas
import csstype.array
import kotlinx.browser.document
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.router.dom.HashRouter
import react.useContext
import team.karakum.common.GridAreas
import team.karakum.common.Sizes
import team.karakum.common.Sizes.Header
import team.karakum.common.Sizes.Sidebar
import team.karakum.component.*

fun main() {
    createRoot(document.createElement("div").also { document.body!!.appendChild(it) })
        .render(App.create())
}

private val App = FC<Props> {
    HashRouter {
        AdaptiveModule {
            ShowcasesModule {
                SidebarModule {
                    ThemeModule {
                        AdaptiveAppView()
                    }
                }
            }
        }
    }
}

private val AdaptiveAppView = FC<Props> {
    val width by useContext(AdaptiveContext)
    val isMobileViewRequired = width <= Sizes.Mobile.MaxWidth

    Box {
        sx = jso {
            display = Display.grid
            gridTemplateRows = GridTemplateRows(
                Header.Height,
                Length.auto,
            )
            gridTemplateColumns = GridTemplateColumns(
                Sidebar.Width, Length.auto,
            )
            gridTemplateAreas = if (isMobileViewRequired) mobileTemplateAreas else defaultTemplateAreas
        }

        Header()
        AdaptiveSidebar()
        Content()
    }
}

private val mobileTemplateAreas: GridTemplateAreas by lazy(LazyThreadSafetyMode.NONE) {
    GridTemplateAreas(
        GridArea("${GridAreas.Header} ${GridAreas.Header}"),
        GridArea("${GridAreas.Content} ${GridAreas.Content}")
    )
}

private val defaultTemplateAreas: GridTemplateAreas by lazy(LazyThreadSafetyMode.NONE) {
    GridTemplateAreas(
        GridArea("${GridAreas.Header} ${GridAreas.Header}"),
        GridArea("${GridAreas.Sidebar} ${GridAreas.Content}")
    )
}
