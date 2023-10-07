package team.karakum.showcase

import react.router.useLocation

fun useCurrentShowcaseKey(): String =
    useLocation().pathname.substringAfterLast("/")
