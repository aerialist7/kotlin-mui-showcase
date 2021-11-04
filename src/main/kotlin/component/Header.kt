package component

import csstype.*
import react.Props
import react.css.css
import react.dom.a
import react.dom.html.ReactHTML.div
import react.fc
import ringui.*

external interface HeaderProps : Props

val Header = fc<HeaderProps> {
    Header {
        div {
            css {
                display = Display.flex
                alignItems = AlignItems.normal
            }

            Logo {
                attrs.glyph =
                    """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 24"><radialGradient id="kotlin-logo-large_svg__a" cx="22.432" cy="3.493" r="21.679" gradientTransform="translate(-.19 .042) scale(.9998)" gradientUnits="userSpaceOnUse"><stop offset="0.003" stop-color="#e44857"></stop><stop offset="0.469" stop-color="#c711e1"></stop><stop offset="1" stop-color="#7f52ff"></stop></radialGradient><path fill="url(#kotlin-logo-large_svg__a)" d="M22.87 21.68H3.94V2.76h18.93l-9.66 9.32z"></path><g fill="#fff"><path d="M45.69 2.73h-3.76l-8.18 8.73v-8.7h-3.02v18.92h3.02v-9.17l8.21 9.17h3.89l-8.75-9.79z"></path><path d="M55.93 8.44c-1.07-.62-2.28-.93-3.64-.93-1.38 0-2.61.31-3.7.93a6.63 6.63 0 00-2.55 2.57c-.61 1.1-.91 2.35-.91 3.74 0 1.4.3 2.64.91 3.74a6.45 6.45 0 002.53 2.57c1.09.62 2.32.93 3.7.93 1.36 0 2.58-.31 3.66-.93a6.53 6.53 0 002.51-2.57c.6-1.1.9-2.35.9-3.74 0-1.4-.3-2.64-.9-3.74-.6-1.1-1.43-1.95-2.51-2.57zm-.19 8.7c-.33.69-.8 1.23-1.4 1.61-.6.39-1.3.58-2.08.58-.79 0-1.49-.19-2.11-.58-.61-.39-1.09-.93-1.43-1.61-.34-.69-.51-1.48-.51-2.38 0-.9.17-1.7.51-2.39.34-.69.82-1.23 1.43-1.61.61-.39 1.32-.58 2.12-.58.77 0 1.46.19 2.07.58.6.39 1.07.93 1.4 1.61.33.69.49 1.48.49 2.39.01.9-.15 1.69-.49 2.38zm9.75-12.76h-2.92v2.35c0 .37-.09.65-.27.83-.18.18-.46.28-.84.28h-1.43v2.49h2.49v7.45c0 .77.16 1.46.47 2.05.31.59.76 1.05 1.34 1.37.58.32 1.27.49 2.06.49h2.23V19.1h-1.68c-.43 0-.78-.15-1.06-.45-.27-.3-.4-.7-.4-1.2v-7.11h3.22v-2.5h-3.22V4.38zM71.03 2H74v19.68h-2.97zm6.32.03h3v3.05h-3zm0 5.81h2.97v13.84h-2.97zm18.08 2.28a4.694 4.694 0 00-1.77-1.92c-.76-.46-1.65-.69-2.67-.69-1.08 0-2.03.26-2.84.79-.65.42-1.17.98-1.58 1.68l-.02-2.14H83.7v13.84h2.97v-7.74c0-.75.14-1.41.43-1.99.28-.58.68-1.03 1.2-1.35.52-.32 1.12-.48 1.82-.48.62 0 1.16.13 1.6.39.45.26.78.64 1.01 1.12.23.49.34 1.07.34 1.74v8.31h2.97v-8.73c.02-1.07-.2-2.01-.61-2.83z"></path></g></svg>"""
                attrs.size = 125.0
            }

            Logo {
                attrs.glyph =
                    """<svg viewBox="0 0 820 820" xmlns="http://www.w3.org/2000/svg"><path d="m-1-1h822v822h-822z" fill="none"/><path d="m110 447.8v-259.8l225 129.9v86.6l-150-86.6v173.2z" fill="#00b0ff"/><path d="m335 317.9 225-129.9v259.8l-150 86.6-75-43.3 150-86.6v-86.6l-150 86.6z" fill="#0081cb"/><path d="m335 491.1v86.6l150 86.6v-86.6z" fill="#00b0ff"/><path d="m485 664.3 225-129.9v-173.2l-75 43.3v86.6l-150 86.6zm150-346.4v-86.6l75-43.3v86.6z" fill="#0081cb"/></svg>"""
                attrs.size = 45.0
            }

            Heading {
                attrs.level = 2
                div {
                    css {
                        color = Color("#FFFFFF")
                        paddingLeft = 4.px
                        userSelect = UserSelect.none
                    }
                    +"Showcase"
                }
            }
        }

        Tray {
            a {
                attrs.href = "https://github.com/aerialist7/kotlin-mui-showcase"

                TrayIcon {
                    attrs.icon =
                        """<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 16 16" class="glyph_a1e" style="width: 24px; height: 24px;"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z"></path></svg>"""
                    attrs.iconSize = 24.0
                }
            }
        }
    }
}
