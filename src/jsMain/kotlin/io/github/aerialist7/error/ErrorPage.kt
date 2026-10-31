package io.github.aerialist7.error

import mui.material.Typography
import react.FC
import tanstack.react.router.ErrorComponentProps

val ErrorPage = FC<ErrorComponentProps> { props ->
    Typography {
        +props.error.message
    }
}
