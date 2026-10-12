package io.github.aerialist7.router

import tanstack.react.router.useParams

fun useShowcaseIdParam(): String =
    useParams { params ->
        params[SHOWCASE_ID_PARAM] as? String ?: ""
    }
