package io.github.aerialist7.showcase.material.lab

import io.github.aerialist7.Timeline
import mui.lab.TimelineConnector
import mui.lab.TimelineContent
import mui.lab.TimelineDot
import mui.lab.TimelineItem
import mui.lab.TimelineSeparator
import react.FC
import react.Props

val TimelineShowcase = FC<Props> {
    Timeline {
        TimelineItem {
            TimelineSeparator {
                TimelineDot {}
                TimelineConnector {}
            }
            TimelineContent {
                +"Eat"
            }
        }
        TimelineItem {
            TimelineSeparator {
                TimelineDot {}
                TimelineConnector {}
            }
            TimelineContent {
                +"Code"
            }
        }
        TimelineItem {
            TimelineSeparator {
                TimelineDot {}
            }
            TimelineContent {
                +"Sleep"
            }
        }
    }
}
