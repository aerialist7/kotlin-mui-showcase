package showcase

import mui.material.Pagination
import react.Props
import react.fc

val PaginationShowcase = fc<Props> {
    Pagination {
        // TODO: Unable to use 'count' correctly [MUI]
        attrs.asDynamic().count = 10
    }
    Pagination {
        attrs.asDynamic().count = 10
        attrs.color = "primary"
    }
    Pagination {
        attrs.asDynamic().count = 10
        attrs.color = "secondary"
    }
    Pagination {
        attrs.asDynamic().count = 10
        // TODO: Unable to use 'disabled' correctly [MUI]
        attrs.asDynamic().disabled = true
    }
}
