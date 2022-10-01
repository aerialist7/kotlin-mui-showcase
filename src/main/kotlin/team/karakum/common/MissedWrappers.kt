package team.karakum.common

import mui.material.BoxProps
import mui.material.GridProps
import mui.material.TabsProps
import mui.material.TypographyProps

// TODO: Remove when it will be implemented in MUI wrappers
inline var GridProps.xs: Int
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().xs = value
    }

inline var TypographyProps.color: String
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().color = value
    }

inline var BoxProps.noValidate: Boolean
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().noValidate = value
    }

inline var BoxProps.autoComplete: String
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().autoComplete = value
    }

inline var TabsProps.ariaLabel: String
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic()["aria-label"] = value
    }
