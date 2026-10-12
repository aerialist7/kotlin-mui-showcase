package io.github.aerialist7.showcase.material.utils

import mui.material.*
import mui.material.StackDirection.Companion.column
import mui.material.StackDirection.Companion.row
import mui.system.responsive
import mui.system.sx
import popper.core.Placement
import popper.core.Placement.Companion.bottom
import popper.core.Placement.Companion.bottomEnd
import popper.core.Placement.Companion.bottomStart
import popper.core.Placement.Companion.left
import popper.core.Placement.Companion.leftEnd
import popper.core.Placement.Companion.leftStart
import popper.core.Placement.Companion.right
import popper.core.Placement.Companion.rightEnd
import popper.core.Placement.Companion.rightStart
import popper.core.Placement.Companion.top
import popper.core.Placement.Companion.topEnd
import popper.core.Placement.Companion.topStart
import react.FC
import react.Props
import react.dom.events.MouseEvent
import react.dom.html.ReactHTML.br
import react.useState
import web.cssom.AlignItems.Companion.flexEnd
import web.cssom.JustifyContent.Companion.center
import web.cssom.px
import web.dom.Element

val PopperShowcase = FC<Props> {
    var isOpen by useState(false)
    var anchor by useState<Element>()
    var place by useState<Placement>()

    fun MouseEvent<*, *>.handleClick(newPlacement: Placement) {
        isOpen = place != newPlacement || !isOpen
        place = newPlacement
        anchor = currentTarget
    }

    Box {
        sx { width = 500.px }

        Popper {
            open = isOpen
            anchorEl = anchor
            placement = place

            Typography {
                sx { padding = 2.px }

                +"The content of the Popper."
            }
        }

        Stack {
            direction = responsive(row)
            sx { justifyContent = center }

            Button {
                onClick = { it.handleClick(topStart) }

                +"$topStart"
            }
            Button {
                onClick = { it.handleClick(top) }

                +"$top"
            }
            Button {
                onClick = { it.handleClick(topEnd) }

                +"$topEnd"
            }
        }
        Stack {
            direction = responsive(row)
            sx { justifyContent = center }

            Stack {
                direction = responsive(column)

                Button {
                    onClick = { it.handleClick(leftStart) }

                    +"$leftStart"
                }
                Button {
                    onClick = { it.handleClick(left) }

                    +"$left"
                }
                Button {
                    onClick = { it.handleClick(leftEnd) }

                    +"$leftEnd"
                }
            }
            Stack {
                direction = responsive(column)
                sx { alignItems = flexEnd }

                Button {
                    onClick = { it.handleClick(rightStart) }

                    +"$rightStart"
                }
                Button {
                    onClick = { it.handleClick(right) }

                    +"$right"
                }
                Button {
                    onClick = { it.handleClick(rightEnd) }

                    +"$rightEnd"
                }
            }
        }
        Stack {
            direction = responsive(row)
            sx { justifyContent = center }

            Button {
                onClick = { it.handleClick(bottomStart) }

                +"$bottomStart"
            }
            Button {
                onClick = { it.handleClick(bottom) }

                +"$bottom"
            }
            Button {
                onClick = { it.handleClick(bottomEnd) }

                +"$bottomEnd"
            }
        }
    }
}
