package team.karakum.page

import mui.system.Box
import mui.system.sx
import react.FC
import web.cssom.Auto
import web.cssom.Display
import web.cssom.GridTemplateAreas
import web.cssom.array

val Page = FC {
    val isMobile = useIsMobile()

    Box {
        sx {
            display = Display.grid
            gridTemplateRows = array(
                Sizes.Header.Height,
                Auto.auto,
            )
            gridTemplateColumns = array(
                Sizes.Sidebar.Width, Auto.auto,
            )
            gridTemplateAreas = GridTemplateAreas(
                arrayOf(Area.Header, Area.Header),
                if (isMobile)
                    arrayOf(Area.Content, Area.Content)
                else
                    arrayOf(Area.Sidebar, Area.Content),
            )
        }

        Header()
        Sidebar()
        Content()
    }
}
