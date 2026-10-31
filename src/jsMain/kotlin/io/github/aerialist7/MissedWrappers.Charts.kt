@file:JsModule("@mui/x-charts")

package io.github.aerialist7

import js.array.ReadonlyArray
import react.FC
import react.Props

// Kotlin Wrappers do not publish MUI X Charts, so only the props used by the showcase are declared here.
external interface ChartsAxisConfig {
    var data: ReadonlyArray<*>?
}

external interface ChartsSeries {
    var data: ReadonlyArray<Number>
    var label: String?
}

external interface BarChartProps : Props {
    var xAxis: ReadonlyArray<ChartsAxisConfig>?
    var series: ReadonlyArray<ChartsSeries>
    var height: Int?
}

external interface LineChartProps : Props {
    var xAxis: ReadonlyArray<ChartsAxisConfig>?
    var series: ReadonlyArray<ChartsSeries>
    var height: Int?
}

external interface PieValue {
    var id: Int
    var value: Number
    var label: String?
}

external interface PieSeries {
    var data: ReadonlyArray<PieValue>
}

external interface PieChartProps : Props {
    var series: ReadonlyArray<PieSeries>
    var width: Int?
    var height: Int?
}

external val BarChart: FC<BarChartProps>

external val LineChart: FC<LineChartProps>

external val PieChart: FC<PieChartProps>
