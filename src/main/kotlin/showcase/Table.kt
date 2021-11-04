package showcase

import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.ElementType
import react.Props
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML
import react.fc

val TableShowcase = fc<Props> {
    TableContainer {
        // TODO: Unable to use `component` prop [MUI]
        //  attrs.component = createElement(Paper)

        Table {
            attrs.sx = jso {
                minWidth = 650.px
            }
            attrs.ariaLabel = "simple table"

            TableHead {
                TableRow {
                    TableCell {
                        +"Dessert (100 g serving)"
                    }
                    TableCell {
                        attrs.align = "right"
                        +"Calories"
                    }
                    TableCell {
                        attrs.align = "right"
                        +"Fat (g)"
                    }
                    TableCell {
                        attrs.align = "right"
                        +"Carbs (g)"
                    }
                    TableCell {
                        attrs.align = "right"
                        +"Protein (g)"
                    }
                }
            }
            TableBody {
                rows.map { row ->
                    TableRow {
                        key = row.name

                        TableCell {
                            // TODO: Remove redundnat cast after fix `component` prop type [MUI]
                            attrs.component = ReactHTML.th.unsafeCast<ElementType<TableCellBaseProps>>()
                            attrs.scope = "row"
                            +row.name
                        }
                        TableCell {
                            attrs.align = "right"
                            +row.calories.toString()
                        }
                        TableCell {
                            attrs.align = "right"
                            +row.fat.toString()
                        }
                        TableCell {
                            attrs.align = "right"
                            +row.carbs.toString()
                        }
                        TableCell {
                            attrs.align = "right"
                            +row.protein.toString()
                        }
                    }
                }
            }
        }
    }
}

private data class TableData(
    val name: String,
    val calories: Int,
    val fat: Double,
    val carbs: Int,
    val protein: Double,
)

private val rows = listOf(
    TableData("Frozen yoghurt", 159, 6.0, 24, 4.0),
    TableData("Ice cream sandwich", 237, 9.0, 37, 4.3),
    TableData("Eclair", 262, 16.0, 24, 6.0),
    TableData("Cupcake", 305, 3.7, 67, 4.3),
    TableData("Gingerbread", 356, 16.0, 49, 3.9),
)
