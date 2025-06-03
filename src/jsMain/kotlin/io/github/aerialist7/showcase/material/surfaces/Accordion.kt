package io.github.aerialist7.showcase.material.surfaces

import mui.icons.material.ExpandMore
import mui.material.Accordion
import mui.material.AccordionDetails
import mui.material.AccordionSummary
import mui.material.Typography
import react.FC
import react.Props
import react.create
import web.dom.ElementId

val AccordionShowcase = FC<Props> {
    Accordion {
        AccordionSummary {
            id = ElementId("panel1a-header")
            ariaControls = ElementId("panel1a-content")
            expandIcon = ExpandMore.create()

            Typography {
                +"Accordion 1"
            }
        }
        AccordionDetails {
            Typography {
                +"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
            }
        }
    }

    Accordion {
        expanded = true
        AccordionSummary {
            id = ElementId("panel2a-header")
            ariaControls = ElementId("panel2a-content")
            expandIcon = ExpandMore.create()

            Typography {
                +"Accordion 2"
            }
        }
        AccordionDetails {
            Typography {
                +"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
            }
        }
    }

    Accordion {
        disabled = true

        AccordionSummary {
            id = ElementId("panel3a-header")
            ariaControls = ElementId("panel3a-content")
            expandIcon = ExpandMore.create()

            Typography {
                +"Disabled Accordion"
            }
        }
    }
}
