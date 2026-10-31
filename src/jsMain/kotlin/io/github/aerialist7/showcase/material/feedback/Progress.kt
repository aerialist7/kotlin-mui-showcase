package io.github.aerialist7.showcase.material.feedback

import mui.material.*
import mui.material.DividerVariant.Companion.fullWidth
import mui.material.StackDirection.Companion.row
import mui.system.responsive
import react.FC
import react.Props
import react.ReactNode

val ProgressShowcase = FC<Props> {
    Stack {
        spacing = responsive(2)

        Divider {
            variant = fullWidth

            Chip {
                label = ReactNode("Circular")
            }
        }

        Stack {
            direction = responsive(row)
            spacing = responsive(2)

            CircularProgress {
                ariaLabel = "Loading"
            }
            CircularProgress {
                ariaLabel = "Loading"
                color = CircularProgressColor.secondary
            }
            CircularProgress {
                ariaLabel = "Loading"
                color = CircularProgressColor.success
            }
            CircularProgress {
                ariaLabel = "Loading"
                color = CircularProgressColor.inherit
            }
        }

        Stack {
            direction = responsive(row)
            spacing = responsive(2)

            for (progress in arrayOf(25, 50, 75, 100)) {
                CircularProgress {
                    ariaLabel = "Progress"
                    variant = CircularProgressVariant.determinate
                    value = progress
                }
            }
        }

        Divider {
            variant = fullWidth

            Chip {
                label = ReactNode("Linear")
            }
        }

        LinearProgress {
            ariaLabel = "Loading"
            color = LinearProgressColor.secondary
        }
        LinearProgress {
            ariaLabel = "Loading"
            color = LinearProgressColor.success
        }
        LinearProgress {
            ariaLabel = "Loading"
            color = LinearProgressColor.inherit
        }
        LinearProgress {
            ariaLabel = "Progress"
            variant = LinearProgressVariant.determinate
            value = 50
        }
    }
}
