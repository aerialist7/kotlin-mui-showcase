package io.github.aerialist7

import csstype.Properties
import mui.material.*
import mui.material.styles.Palette
import mui.material.styles.Theme
import mui.material.styles.ZIndex
import mui.system.BoxProps
import mui.system.ResponsiveStyleValue
import mui.system.responsive
import react.Props
import web.cssom.Display
import web.cssom.LengthProperty

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

// The published wrappers omit selected from ListItemButtonProps even though MUI exposes it.
inline var ListItemButtonProps.selected: Boolean
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().selected = value
    }

// MUI supports divider as a boolean that adds a bottom border, but the published wrapper omits it.
inline var ListItemButtonProps.divider: Boolean
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().divider = value
    }

external interface TextFieldSlotProps : Props {
    // MUI forwards these props to its input component, rather than the HTML input element.
    var input: InputBaseProps?
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
    var theme: Theme
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

// MUI's theme zIndex holds the component layers at runtime, but the system wrapper emits it as an empty interface.
internal fun Theme.muiZIndex(): ZIndex = zIndex.unsafeCast<ZIndex>()

// MUI's spacing value is callable at runtime, but its wrapper is emitted as an empty interface.
internal fun Theme.cssSpacing(value: Double): LengthProperty =
    spacing.unsafeCast<(Double) -> String>()(value).unsafeCast<LengthProperty>()

inline var TypographyProps.display: Display
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().display = value
    }

/** MUI SpeedDial expects the camelCase component prop, separate from the inherited aria-label. */
inline var SpeedDialProps.speedDialAriaLabel: String
    get() = TODO("Prop is write-only!")
    set(value) {
        asDynamic().ariaLabel = value
    }
