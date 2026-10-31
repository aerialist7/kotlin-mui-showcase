package io.github.aerialist7.router

import io.github.aerialist7.showcase.Showcase
import js.array.ReadonlyArray
import tanstack.react.router.useLoaderData

// Showcases are the root route loader data, so these hooks are for components rendered by the root route.
fun useShowcases(): ReadonlyArray<Showcase> =
    useLoaderData { it.unsafeCast<ReadonlyArray<Showcase>>() }

fun useShowcase(): Showcase? {
    val showcases = useShowcases()
    val showcaseId = useShowcaseIdParam()
    return showcases.find { it.key == showcaseId }
}
