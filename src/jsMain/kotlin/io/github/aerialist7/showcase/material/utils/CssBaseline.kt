package io.github.aerialist7.showcase.material.utils

import mui.material.CssBaseline
import mui.material.ScopedCssBaseline
import react.FC
import react.Fragment
import react.Props

val CssBaselineShowcase = FC<Props> {
    Fragment {
        CssBaseline()

        +"CssBaseline"
    }

    Fragment {
        ScopedCssBaseline()

        +"ScopedCssBaseline"
    }

    Fragment {
        ScopedCssBaseline {
            enableColorScheme = true
        }

        +"ScopedCssBaseline with enabled color scheme"
    }
}
