package io.github.aerialist7.showcase.material.muix

import io.github.aerialist7.*
import js.objects.unsafeJso
import mui.material.Box
import mui.material.Chip
import mui.material.Divider
import mui.material.DividerVariant.Companion.fullWidth
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import web.cssom.px

val ChartsShowcase = FC<Props> {
    Box {
        sx { maxWidth = 600.px }

        Divider {
            variant = fullWidth

            Chip {
                label = ReactNode("Bars")
            }
        }

        BarChart {
            xAxis = arrayOf(ChartsAxisConfig(arrayOf("group A", "group B", "group C")))
            series = arrayOf(
                ChartsSeries(arrayOf(4, 3, 5)),
                ChartsSeries(arrayOf(1, 6, 3)),
                ChartsSeries(arrayOf(2, 5, 6)),
            )
            height = 300
        }

        Divider {
            variant = fullWidth

            Chip {
                label = ReactNode("Lines")
            }
        }

        LineChart {
            xAxis = arrayOf(ChartsAxisConfig(arrayOf(1, 2, 3, 5, 8, 10)))
            series = arrayOf(
                ChartsSeries(arrayOf(2, 5.5, 2, 8.5, 1.5, 5)),
            )
            height = 300
        }

        Divider {
            variant = fullWidth

            Chip {
                label = ReactNode("Pie")
            }
        }

        PieChart {
            series = arrayOf(
                unsafeJso {
                    data = arrayOf(
                        PieValue(0, 10, "series A"),
                        PieValue(1, 15, "series B"),
                        PieValue(2, 20, "series C"),
                    )
                },
            )
            width = 200
            height = 200
        }
    }
}

private fun ChartsAxisConfig(
    data: Array<*>,
): ChartsAxisConfig = unsafeJso {
    this.data = data
}

private fun ChartsSeries(
    data: Array<Number>,
): ChartsSeries = unsafeJso {
    this.data = data
}

private fun PieValue(
    id: Int,
    value: Number,
    label: String,
): PieValue = unsafeJso {
    this.id = id
    this.value = value
    this.label = label
}
