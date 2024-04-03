package team.karakum.page

import mui.system.useMediaQuery

fun useIsMobile(): Boolean =
    useMediaQuery("(max-width: 960px)")
