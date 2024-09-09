package io.github.aerialist7.router

import react.router.useLocation

fun useShowcaseIdParam(): String =
    useLocation().pathname.substringAfterLast("/")
