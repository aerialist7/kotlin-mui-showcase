package io.github.aerialist7.page

import mui.system.useMediaQuery

fun useIsMobile(): Boolean =
    useMediaQuery("(max-width: 960px)")
