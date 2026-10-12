package io.github.aerialist7.showcase

import react.FC
import react.Props
import tanstack.react.router.useLoaderData

val ShowcaseMaterial = FC<Props> {
    val ShowcaseComponent = useLoaderData()
        .unsafeCast<Showcase>()
        .Component

    ShowcaseComponent()
}
