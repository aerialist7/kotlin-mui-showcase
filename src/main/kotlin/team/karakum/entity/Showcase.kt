package team.karakum.entity

import react.FC
import react.Props

data class Showcase(
    val key: String,
    val name: String,
    val Component: FC<Props>,
)

typealias Showcases = Iterable<Showcase>
