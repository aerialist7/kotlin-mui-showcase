package team.karakum.components.showcases

import csstype.pct
import mui.material.Box
import mui.material.Tab
import mui.material.Tabs
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.useState

val TabsShowcase = FC<Props> {
    var activeTab by useState("one")

    Box {
        sx {
            width = 100.pct
        }

        Tabs {
            value = activeTab
            onChange = { _, newValue -> activeTab = newValue }
            // TODO: Unable to set `ariaLabel` prop [MUI]
            asDynamic()["aria-label"] = "wrapped label tabs example"

            Tab {
                value = "one"
                label = ReactNode("New Arrivals in the Longest Text of Nonfiction that should appear in the next line")
                wrapped = true
            }
            Tab {
                value = "two"
                label = ReactNode("Item Two")
            }
            Tab {
                value = "three"
                label = ReactNode("Item Three")
            }
        }
    }
}
