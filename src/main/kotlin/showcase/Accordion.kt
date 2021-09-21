package showcase

import mui.material.Accordion
import mui.material.AccordionDetails
import mui.material.AccordionSummary
import mui.material.Typography
import react.Props
import react.fc

val Accordion = fc<Props> {
    Accordion {
        AccordionSummary {
            // TODO: Unable to add icon
            //  [MUI] attrs.expandIcon
            Typography { +"Accordion" }
        }
        AccordionDetails {
            Typography { +"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget." }
        }
    }
    Accordion {
        attrs.disabled = true
        AccordionSummary {
            Typography { +"Disabled Accordion" }
        }
    }
}
