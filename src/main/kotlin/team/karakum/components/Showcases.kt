package team.karakum.components

import csstype.Auto
import csstype.Display
import csstype.GridTemplateAreas
import csstype.array
import mui.material.useMediaQuery
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import team.karakum.common.Area
import team.karakum.common.Sizes
import team.karakum.entities.SHOWCASES
import team.karakum.entities.Showcases
import kotlin.js.Promise
import kotlin.js.Promise.Companion.resolve

val Showcases = FC<Props> {
    val mobileMode = useMediaQuery("(max-width:960px)")

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
                if (mobileMode)
                    arrayOf(Area.Content, Area.Content)
                else
                    arrayOf(Area.Sidebar, Area.Content),
            )
        }

        Header()
        if (mobileMode) Menu() else Sidebar()
        Content()
    }
}

fun showcasesLoader(): Promise<Showcases> =
    resolve(SHOWCASES)
