package team.karakum.common

import mui.material.GridProps

// TODO: Remove when it will be implemented in wrappers
inline var GridProps.xs: Int
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().xs = value
    }
