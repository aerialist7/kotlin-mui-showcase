package example.component

import mui.material.Pagination
import mui.material.PaginationColor
import react.FC
import react.Props

val PaginationShowcase = FC<Props> {
    Pagination {
        // TODO: Unable to use 'count' correctly [MUI]
        asDynamic().count = 10
    }
    Pagination {
        asDynamic().count = 10
        color = PaginationColor.primary
    }
    Pagination {
        asDynamic().count = 10
        color = PaginationColor.secondary
    }
    Pagination {
        asDynamic().count = 10
        // TODO: Unable to use 'disabled' correctly [MUI]
        asDynamic().disabled = true
    }
}
