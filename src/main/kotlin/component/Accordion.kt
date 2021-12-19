package component

import mui.material.Accordion
import mui.material.AccordionDetails
import mui.material.AccordionSummary
import mui.material.Typography
import react.FC
import react.Props
import react.ReactNode

val AccordionShowcase = FC<Props> {
    Accordion {
        AccordionSummary {
            // TODO: Unable to add icon [MUI]
            expandIcon = ReactNode("🔻")

            Typography { +"Accordion" }
        }
        AccordionDetails {
            Typography { +"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget." }
        }
    }
    Accordion {
        disabled = true

        AccordionSummary {
            Typography { +"Disabled Accordion" }
        }
    }
}
