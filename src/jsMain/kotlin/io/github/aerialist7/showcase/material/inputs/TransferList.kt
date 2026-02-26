package io.github.aerialist7.showcase.material.inputs

import mui.material.*
import mui.material.ButtonVariant.Companion.outlined
import mui.material.GridDirection.Companion.column
import mui.material.Size.Companion.small
import mui.system.responsive
import mui.system.sx
import react.FC
import react.Props
import react.create
import react.useState
import web.cssom.*
import web.dom.ElementId

private fun not(a: List<Int>, b: List<Int>) = a.filter { !b.contains(it) }
private fun intersection(a: List<Int>, b: List<Int>) = a.filter { b.contains(it) }

external interface TransferListProps : Props {
    var items: List<Int>
    var checked: List<Int>
    var onToggle: (Int) -> Unit
}

private val TransferListPanel = FC<TransferListProps> { props ->
    Paper {
        sx {
            width = 200.px
            height = 230.px
            overflow = Auto.auto
        }

        List {
            dense = true
            asDynamic().component = "div"
            asDynamic().role = "list"

            props.items.forEach { value ->
                val labelId = "transfer-list-item-$value-label"

                ListItemButton {
                    key = value.toString()
                    asDynamic().role = "listitem"
                    onClick = { props.onToggle(value) }

                    ListItemIcon {
                        Checkbox {
                            checked = props.checked.contains(value)
                            tabIndex = -1
                            disableRipple = true
                        }
                    }

                    ListItemText {
                        id = ElementId(labelId)
                        primary = react.ReactNode("List item ${value + 1}")
                    }
                }
            }
        }
    }
}

val TransferListShowcase = FC<Props> {
    var checked by useState(emptyList<Int>())
    var left by useState(listOf(0, 1, 2, 3))
    var right by useState(listOf(4, 5, 6, 7))

    val leftChecked = intersection(checked, left)
    val rightChecked = intersection(checked, right)

    val handleToggle = { value: Int ->
        checked = if (checked.contains(value)) checked - value else checked + value
    }

    Grid {
        container = true
        spacing = responsive(2)
        sx {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
        }

        Grid {
            item = true
            +TransferListPanel.create {
                items = left
                this.checked = checked
                onToggle = handleToggle
            }
        }

        Grid {
            item = true

            Grid {
                container = true
                direction = responsive(column)
                sx { alignItems = AlignItems.center }

                Button {
                    sx { marginTop = 4.px; marginBottom = 4.px }
                    variant = outlined
                    size = small
                    onClick = { left.let { l -> right = right + l; left = emptyList() } }
                    disabled = left.isEmpty()
                    +"\u226B"
                }
                Button {
                    sx { marginTop = 4.px; marginBottom = 4.px }
                    variant = outlined
                    size = small
                    onClick = {
                        right = right + leftChecked
                        left = not(left, leftChecked)
                        checked = not(checked, leftChecked)
                    }
                    disabled = leftChecked.isEmpty()
                    +">"
                }
                Button {
                    sx { marginTop = 4.px; marginBottom = 4.px }
                    variant = outlined
                    size = small
                    onClick = {
                        left = left + rightChecked
                        right = not(right, rightChecked)
                        checked = not(checked, rightChecked)
                    }
                    disabled = rightChecked.isEmpty()
                    +"<"
                }
                Button {
                    sx { marginTop = 4.px; marginBottom = 4.px }
                    variant = outlined
                    size = small
                    onClick = { right.let { r -> left = left + r; right = emptyList() } }
                    disabled = right.isEmpty()
                    +"\u226A"
                }
            }
        }

        Grid {
            item = true
            +TransferListPanel.create {
                items = right
                this.checked = checked
                onToggle = handleToggle
            }
        }
    }
}
