package io.github.aerialist7.error

import mui.material.Typography
import react.FC
import tanstack.react.router.ErrorComponentProps
import tanstack.react.router.NotFoundRouteProps

val ErrorPage = FC<ErrorComponentProps> { props ->
    Typography {
        +props.error.message
    }
}

val NotFoundPage = FC<NotFoundRouteProps> {
    Typography {
        +"Page not found"
    }
}
