package team.karakum.components

import react.FC
import react.Props
import react.router.useLoaderData
import remix.run.router.LoaderFunction
import team.karakum.entities.SHOWCASES
import team.karakum.entities.Showcase
import kotlin.js.Promise.Companion.resolve

val Showcase = FC<Props> {
    useLoaderData().unsafeCast<Showcase>().Component()
}

val showcaseLoader: LoaderFunction<*> = { args ->
    resolve(SHOWCASES.single { it.key == args.params["showcaseId"] })
}
