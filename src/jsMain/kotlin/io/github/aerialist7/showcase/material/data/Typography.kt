package io.github.aerialist7.showcase.material.data

import io.github.aerialist7.display
import mui.material.Box
import mui.material.Typography
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.FC
import react.Props
import web.cssom.Display
import web.cssom.pct
import web.cssom.px

val TypographyShowcase = FC<Props> {
    Box {
        sx {
            width = 100.pct
            maxWidth = 500.px
        }

        Typography {
            variant = TypographyVariant.h1
            gutterBottom = true

            +"h1. Heading"
        }

        Typography {
            variant = TypographyVariant.h2
            gutterBottom = true

            +"h2. Heading"
        }

        Typography {
            variant = TypographyVariant.h3
            gutterBottom = true

            +"h3. Heading"
        }

        Typography {
            variant = TypographyVariant.h4
            gutterBottom = true

            +"h4. Heading"
        }

        Typography {
            variant = TypographyVariant.h5
            gutterBottom = true

            +"h5. Heading"
        }

        Typography {
            variant = TypographyVariant.h6
            gutterBottom = true

            +"h6. Heading"
        }

        Typography {
            variant = TypographyVariant.subtitle1
            gutterBottom = true

            +"subtitle1. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos blanditiis tenetur"
        }

        Typography {
            variant = TypographyVariant.subtitle2
            gutterBottom = true

            +"subtitle2. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos blanditiis tenetur"
        }

        Typography {
            variant = TypographyVariant.body1
            gutterBottom = true

            +"subtitle2. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos blanditiis tenetur"
        }

        Typography {
            variant = TypographyVariant.body1
            gutterBottom = true

            +"body1. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos blanditiis tenetur unde suscipit, quam beatae rerum inventore consectetur, neque doloribus, cupiditate numquam dignissimos laborum fugiat deleniti? Eum quasi quidem quibusdam."
        }

        Typography {
            variant = TypographyVariant.body2
            gutterBottom = true

            +"body2. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos blanditiis tenetur unde suscipit, quam beatae rerum inventore consectetur, neque doloribus, cupiditate numquam dignissimos laborum fugiat deleniti? Eum quasi quidem quibusdam."
        }

        Typography {
            variant = TypographyVariant.button
            display = Display.block
            gutterBottom = true

            +"button text"
        }

        Typography {
            variant = TypographyVariant.caption
            display = Display.block
            gutterBottom = true

            +"caption text"
        }

        Typography {
            variant = TypographyVariant.overline
            display = Display.block
            gutterBottom = true

            +"overline text"
        }
    }

}
