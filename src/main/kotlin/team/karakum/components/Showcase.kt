package team.karakum.components

import js.core.get
import react.FC
import react.Props
import react.router.useParams
import react.useMemo
import team.karakum.entities.SHOWCASES

val Showcase = FC<Props> {
    val showcaseId = useParams()["showcaseId"]
    val (_, _, Component) = useMemo(showcaseId) {
        SHOWCASES.single { it.key == showcaseId }
    }

    Component()
}
