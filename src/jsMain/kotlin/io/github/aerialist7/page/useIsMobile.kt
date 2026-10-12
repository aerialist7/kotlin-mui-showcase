package io.github.aerialist7.page

import mui.material.useMediaQuery

fun useIsMobile(): Boolean =
    useMediaQuery("(max-width: 960px)")
