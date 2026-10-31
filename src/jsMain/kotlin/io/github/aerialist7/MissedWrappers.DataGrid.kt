@file:JsModule("@mui/x-data-grid")

package io.github.aerialist7

import js.array.ReadonlyArray
import react.FC
import react.Props

// Kotlin Wrappers do not publish MUI X Data Grid, so only the props used by the showcase are declared here.
external interface DataGridProps : Props {
    var rows: ReadonlyArray<*>
    var columns: ReadonlyArray<GridColDef>
    var initialState: GridInitialState?
    var pageSizeOptions: ReadonlyArray<Int>?
    var checkboxSelection: Boolean?
    var disableRowSelectionOnClick: Boolean?
}

external interface GridColDef {
    var field: String
    var headerName: String?
    var type: String? /* 'string' | 'number' | 'date' | ... */
    var width: Int?
    var editable: Boolean?
}

external interface GridInitialState {
    var pagination: GridPaginationInitialState?
}

external interface GridPaginationInitialState {
    var paginationModel: GridPaginationModel?
}

external interface GridPaginationModel {
    var page: Int?
    var pageSize: Int?
}

external val DataGrid: FC<DataGridProps>
