package io.github.aerialist7.showcase.material.layout

import mui.material.ImageList
import mui.material.ImageListItem
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML.img
import web.cssom.px

val ImageListShowcase = FC<Props> {
    ImageList {
        sx {
            width = 500.px
            height = 450.px
        }
        cols = 3
        rowHeight = 164

        for (image in imageSet) {
            ImageListItem {
                key = image.first
                img {
                    src = "${image.second}?w=164&h=164&fit=crop&auto=format"
                    alt = image.first
                }
            }
        }
    }
}

private val imageSet = listOf(
    "Breakfast" to "https://images.unsplash.com/photo-1551963831-b3b1ca40c98e",
    "Burger" to "https://images.unsplash.com/photo-1551782450-a2132b4ba21d",
    "Camera" to "https://images.unsplash.com/photo-1522770179533-24471fcdba45",
    "Coffee" to "https://images.unsplash.com/photo-1444418776041-9c7e33cc5a9c",
    "Hats" to "https://images.unsplash.com/photo-1533827432537-70133748f5c8",
    "Honey" to "https://images.unsplash.com/photo-1558642452-9d2a7deb7f62",
    "Basketball" to "https://images.unsplash.com/photo-1516802273409-68526ee1bdd6",
    "Fern" to "https://images.unsplash.com/photo-1518756131217-31eb79b20e8f",
    "Mushrooms" to "https://images.unsplash.com/photo-1597645587822-e99fa5d45d25",
    "Tomato basil" to "https://images.unsplash.com/photo-1567306301408-9b74779a11af",
    "Sea star" to "https://images.unsplash.com/photo-1471357674240-e1a485acb3e1",
    "Bike" to "https://images.unsplash.com/photo-1589118949245-7d38baf380d6",
)
