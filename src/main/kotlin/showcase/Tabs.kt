package showcase

import csstype.pct
import kotlinext.js.jso
import mui.material.Box
import mui.material.Tab
import mui.material.Tabs
import react.Props
import react.ReactNode
import react.fc
import react.useState

val TabsShowcase = fc<Props> {
    var value by useState("one")

    Box {
        attrs.sx = jso {
            width = 100.pct
        }
        Tabs {
            attrs.value = value
            attrs.onChange = { _, newValue -> value = newValue }
            // TODO: Unable to set `ariaLabel` prop [MUI]
            //  attrs.ariaLabel = "wrapped label tabs example"

            Tab {
                attrs.value = "one"
                attrs.label = ReactNode("New Arrivals in the Longest Text of Nonfiction that should appear in the next line")
                attrs.wrapped = true
            }
            Tab {
                attrs.value = "two"
                attrs.label = ReactNode("Item Two")
            }
            Tab {
                attrs.value = "three"
                attrs.label = ReactNode("Item Three")
            }
        }
    }
}
