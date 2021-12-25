package showcase

import mui.material.Pagination
import react.FC
import react.Props

val PaginationShowcase = FC<Props> {
    Pagination {
        // TODO: Unable to use 'count' correctly [MUI]
        asDynamic().count = 10
    }
    Pagination {
        asDynamic().count = 10
        color = "primary"
    }
    Pagination {
        asDynamic().count = 10
        color = "secondary"
    }
    Pagination {
        asDynamic().count = 10
        // TODO: Unable to use 'disabled' correctly [MUI]
        asDynamic().disabled = true
    }
}
