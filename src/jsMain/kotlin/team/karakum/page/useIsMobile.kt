package team.karakum.page

import mui.material.useMediaQuery

fun useIsMobile(): Boolean =
    useMediaQuery("(max-width: 960px)")
