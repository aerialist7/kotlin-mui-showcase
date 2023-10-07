package team.karakum.showcase

import react.FC
import react.Props

data class Showcase(
    val key: String,
    val name: String,
    val Component: FC<Props>,
)
