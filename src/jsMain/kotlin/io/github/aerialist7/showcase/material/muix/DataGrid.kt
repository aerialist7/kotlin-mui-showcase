package io.github.aerialist7.showcase.material.muix

import io.github.aerialist7.DataGrid
import io.github.aerialist7.GridColDef
import js.objects.unsafeJso
import mui.material.Box
import mui.system.sx
import react.FC
import react.Props
import web.cssom.pct
import web.cssom.px

val DataGridShowcase = FC<Props> {
    Box {
        sx {
            height = 400.px
            width = 100.pct
        }

        DataGrid {
            rows = PEOPLE
            columns = COLUMNS
            initialState = unsafeJso {
                pagination = unsafeJso {
                    paginationModel = unsafeJso { pageSize = 5 }
                }
            }
            pageSizeOptions = arrayOf(5)
            checkboxSelection = true
            disableRowSelectionOnClick = true
        }
    }
}

private val COLUMNS = arrayOf(
    GridColDef("id", "ID", width = 90),
    GridColDef("firstName", "First name", width = 150, editable = true),
    GridColDef("lastName", "Last name", width = 150, editable = true),
    GridColDef("age", "Age", type = "number", width = 110, editable = true),
)

private val PEOPLE = arrayOf(
    Person(1, "Jon", "Snow", 14),
    Person(2, "Cersei", "Lannister", 31),
    Person(3, "Jaime", "Lannister", 31),
    Person(4, "Arya", "Stark", 11),
    Person(5, "Daenerys", "Targaryen", null),
    Person(6, null, "Melisandre", 150),
    Person(7, "Ferrara", "Clifford", 44),
    Person(8, "Rossini", "Frances", 36),
    Person(9, "Harvey", "Roxie", 65),
)

private external interface Person {
    var id: Int
    var firstName: String?
    var lastName: String
    var age: Int?
}

private fun Person(
    id: Int,
    firstName: String?,
    lastName: String,
    age: Int?,
): Person = unsafeJso {
    this.id = id
    this.firstName = firstName
    this.lastName = lastName
    this.age = age
}

private fun GridColDef(
    field: String,
    headerName: String,
    type: String? = null,
    width: Int,
    editable: Boolean? = null,
): GridColDef = unsafeJso {
    this.field = field
    this.headerName = headerName
    if (type != null) {
        this.type = type
    }
    this.width = width
    if (editable != null) {
        this.editable = editable
    }
}
