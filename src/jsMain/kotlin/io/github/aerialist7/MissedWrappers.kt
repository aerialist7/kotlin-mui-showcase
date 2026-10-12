package io.github.aerialist7

import mui.material.*
import mui.material.styles.Palette
import mui.material.styles.Theme
import mui.system.BoxProps
import mui.system.ResponsiveStyleValue
import mui.system.responsive
import csstype.Properties
import web.cssom.LengthProperty
import web.cssom.Display
import js.reflect.unsafeCast
import react.Props

// TODO: Remove when it will be implemented in MUI wrappers
inline var GridProps.xs: Int
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().xs = value
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

inline var TextFieldProps.InputProps: InputBaseProps
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().InputProps = value
    }

inline var ListItemProps.button: Boolean
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().button = value
    }

// The published wrappers omit selected from ListItemButtonProps even though MUI exposes it.
inline var ListItemButtonProps.selected: Boolean
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().selected = value
    }

external interface TextFieldSlotProps : Props {
    var inputLabel: InputLabelProps?
}

// TextField's published wrapper does not expose its slotProps property.
inline var BaseTextFieldProps.slotProps: TextFieldSlotProps?
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().slotProps = value
    }

/**
 * The published Grid wrapper models MUI's `'auto' | 'grow' | number | false` union
 * as `String`, so this cast preserves the numeric JS value while satisfying that type.
 */
internal fun gridSize(value: Int): ResponsiveStyleValue<String> =
    responsive(value.unsafeCast<String>())

private external interface StyledPropsWithTheme : Props {
    val theme: Theme
}

private external interface ThemeTypography {
    val body2: Properties
}

// Emotion adds theme to styled callback props, but the callback type does not declare it.
internal fun Props.muiTheme(): Theme = unsafeCast<StyledPropsWithTheme>().theme

// These shapes are present in MUI at runtime; the published wrappers expose these fields as Any.
internal fun Theme.muiPalette(): Palette = palette.unsafeCast<Palette>()

internal fun Theme.body2Typography(): Properties =
    typography.unsafeCast<ThemeTypography>().body2

// MUI's spacing value is callable at runtime, but its wrapper is emitted as an empty interface.
internal fun Theme.cssSpacing(value: Double): LengthProperty =
    spacing.unsafeCast<(Double) -> String>()(value).unsafeCast<LengthProperty>()

inline var TypographyProps.display: Display
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().display = value
    }
