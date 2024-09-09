package io.github.aerialist7.error

import js.errors.JsError
import mui.material.Typography
import react.FC
import react.Props
import react.router.useRouteError

val ErrorPage = FC<Props> {
    val error = useRouteError().unsafeCast<JsError>()

    Typography {
        +error.message
    }
}
