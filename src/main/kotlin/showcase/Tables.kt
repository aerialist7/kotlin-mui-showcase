package showcase

import csstype.px
import kotlinext.js.jso
import mui.material.*
import react.*
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML

val TablesShowcase = FC<Props> {
    TableContainer {
        // TODO: Unable to use `component` prop [MUI]
        asDynamic().component = Paper.create().type

        Table {
            sx = jso {
                minWidth = 650.px
            }
            ariaLabel = "simple table"

            TableHead {
                TableRow {
                    TableCell {
                        +"Dessert (100 g serving)"
                    }
                    TableCell {
                        align = TableCellAlign.right
                        +"Calories"
                    }
                    TableCell {
                        align = TableCellAlign.right
                        +"Fat (g)"
                    }
                    TableCell {
                        align = TableCellAlign.right
                        +"Carbs (g)"
                    }
                    TableCell {
                        align = TableCellAlign.right
                        +"Protein (g)"
                    }
                }
            }
            TableBody {
                rows.map { row ->
                    TableRow {
                        key = row.name

                        TableCell {
                            // TODO: Remove redundant cast after fix `component` prop type [MUI]
                            component = ReactHTML.th.unsafeCast<ElementType<TableCellBaseProps>>()
                            // TODO: Should not be dynamic
                            scope = "row"
                            +row.name
                        }
                        TableCell {
                            align = TableCellAlign.right
                            +row.calories.toString()
                        }
                        TableCell {
                            align = TableCellAlign.right
                            +row.fat.toString()
                        }
                        TableCell {
                            align = TableCellAlign.right
                            +row.carbs.toString()
                        }
                        TableCell {
                            align = TableCellAlign.right
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
