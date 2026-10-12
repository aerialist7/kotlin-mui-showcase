package io.github.aerialist7.showcase.material.inputs

import mui.material.*
import mui.material.ButtonVariant.Companion.outlined
import mui.material.Size.Companion.small
import mui.material.StackDirection.Companion.column
import mui.material.StackDirection.Companion.row
import mui.system.responsive
import mui.system.sx
import react.*
import react.dom.aria.AriaRole
import react.dom.html.ReactHTML
import web.cssom.AlignItems
import web.cssom.Auto.Companion.auto
import web.cssom.FlexWrap
import web.cssom.JustifyContent
import web.cssom.px
import web.dom.ElementId

val TransferListShowcase = FC<Props> {
    var isChecked by useState(emptyList<Int>())
    var left by useState(listOf(0, 1, 2, 3))
    var right by useState(listOf(4, 5, 6, 7))

    val leftChecked = useMemo(isChecked, left) { intersection(isChecked, left) }
    val rightChecked = useMemo(isChecked, right) { intersection(isChecked, right) }

    val handleToggle = useCallback(isChecked) { value: Int ->
        isChecked = if (isChecked.contains(value)) isChecked - value else isChecked + value
    }

    Stack {
        sx {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            flexWrap = FlexWrap.wrap
        }

        direction = responsive(row)
        spacing = responsive(2)

        TransferListPanel {
            items = left
            checked = isChecked
            onToggle = handleToggle
        }

        Stack {
            sx {
                alignItems = AlignItems.center
            }

            direction = responsive(column)

            Button {
                sx {
                    marginTop = 4.px
                    marginBottom = 4.px
                }

                disabled = left.isEmpty()
                variant = outlined
                size = small

                onClick = {
                    right = right + left
                    left = emptyList()
                }

                +"\u226B"
            }
            Button {
                sx {
                    marginTop = 4.px
                    marginBottom = 4.px
                }

                disabled = leftChecked.isEmpty()
                variant = outlined
                size = small

                onClick = {
                    right = right + leftChecked
                    left = not(left, leftChecked)
                    isChecked = not(isChecked, leftChecked)
                }

                +">"
            }
            Button {
                sx {
                    marginTop = 4.px
                    marginBottom = 4.px
                }

                disabled = rightChecked.isEmpty()
                variant = outlined
                size = small

                onClick = {
                    left = left + rightChecked
                    right = not(right, rightChecked)
                    isChecked = not(isChecked, rightChecked)
                }

                +"<"
            }
            Button {
                sx {
                    marginTop = 4.px
                    marginBottom = 4.px
                }

                disabled = right.isEmpty()
                variant = outlined
                size = small

                onClick = {
                    left = left + right
                    right = emptyList()
                }

                +"\u226A"
            }
        }

        TransferListPanel {
            items = right
            checked = isChecked
            onToggle = handleToggle
        }
    }
}

private fun not(a: List<Int>, b: List<Int>): List<Int> =
    a.filter { !b.contains(it) }

private fun intersection(a: List<Int>, b: List<Int>): List<Int> =
    a.filter { b.contains(it) }

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
            overflow = auto
        }

        List {
            component = ReactHTML.div
            role = AriaRole.list
            dense = true

            for (value in props.items) {
                ListItemButton {
                    key = Key(value)
                    role = AriaRole.listitem
                    onClick = { props.onToggle(value) }

                    ListItemIcon {
                        Checkbox {
                            checked = props.checked.contains(value)
                            tabIndex = -1
                            disableRipple = true
                        }
                    }

                    ListItemText {
                        id = ElementId("transfer-list-item-$value-label")
                        primary = ReactNode("List item ${value + 1}")
                    }
                }
            }
        }
    }
}
