package io.github.aerialist7.error

import mui.material.Typography
import react.FC
import tanstack.react.router.NotFoundRouteProps

val NotFoundPage = FC<NotFoundRouteProps> {
    Typography {
        +"Showcase not found"
    }
}
