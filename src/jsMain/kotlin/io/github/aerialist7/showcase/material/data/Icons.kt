package io.github.aerialist7.showcase.material.data

import mui.icons.material.*
import mui.material.*
import mui.material.Size.Companion.small
import mui.material.styles.TypographyVariant.Companion.body2
import mui.material.styles.TypographyVariant.Companion.caption
import mui.system.sx
import react.*
import react.dom.events.ChangeEvent
import web.cssom.*
import web.cssom.AutoRepeat.Companion.autoFill
import web.dom.ElementId
import web.html.HTMLElement
import web.html.HTMLInputElement
import mui.icons.material.Badge as BadgeIcon
import mui.icons.material.BadgeOutlined as BadgeIconOutlined
import mui.icons.material.BadgeRounded as BadgeIconRounded
import mui.icons.material.BadgeSharp as BadgeIconSharp
import mui.icons.material.BadgeTwoTone as BadgeIconTwoTone
import mui.icons.material.Link as LinkIcon
import mui.icons.material.LinkOutlined as LinkIconOutlined
import mui.icons.material.LinkRounded as LinkIconRounded
import mui.icons.material.LinkSharp as LinkIconSharp
import mui.icons.material.LinkTwoTone as LinkIconTwoTone
import mui.icons.material.Menu as MenuIcon
import mui.icons.material.MenuOutlined as MenuIconOutlined
import mui.icons.material.MenuRounded as MenuIconRounded
import mui.icons.material.MenuSharp as MenuIconSharp
import mui.icons.material.MenuTwoTone as MenuIconTwoTone

private data class IconEntry(
    val name: String,
    val filled: SvgIconComponent,
    val outlined: SvgIconComponent,
    val rounded: SvgIconComponent,
    val twoTone: SvgIconComponent,
    val sharp: SvgIconComponent
)

private val ICONS: List<IconEntry> = listOf(
    IconEntry("Home", Home, HomeOutlined, HomeRounded, HomeTwoTone, HomeSharp),
    IconEntry("Search", Search, SearchOutlined, SearchRounded, SearchTwoTone, SearchSharp),
    IconEntry("Settings", Settings, SettingsOutlined, SettingsRounded, SettingsTwoTone, SettingsSharp),
    IconEntry("Favorite", Favorite, FavoriteOutlined, FavoriteRounded, FavoriteTwoTone, FavoriteSharp),
    IconEntry("Delete", Delete, DeleteOutlined, DeleteRounded, DeleteTwoTone, DeleteSharp),
    IconEntry("Edit", Edit, EditOutlined, EditRounded, EditTwoTone, EditSharp),
    IconEntry("Add", Add, AddOutlined, AddRounded, AddTwoTone, AddSharp),
    IconEntry("Close", Close, CloseOutlined, CloseRounded, CloseTwoTone, CloseSharp),
    IconEntry("Check", Check, CheckOutlined, CheckRounded, CheckTwoTone, CheckSharp),
    IconEntry("Menu", MenuIcon, MenuIconOutlined, MenuIconRounded, MenuIconTwoTone, MenuIconSharp),
    IconEntry("Star", Star, StarOutlined, StarRounded, StarTwoTone, StarSharp),
    IconEntry("Person", Person, PersonOutlined, PersonRounded, PersonTwoTone, PersonSharp),
    IconEntry("Email", Email, EmailOutlined, EmailRounded, EmailTwoTone, EmailSharp),
    IconEntry("Phone", Phone, PhoneOutlined, PhoneRounded, PhoneTwoTone, PhoneSharp),
    IconEntry("Lock", Lock, LockOutlined, LockRounded, LockTwoTone, LockSharp),
    IconEntry("Notifications", Notifications, NotificationsOutlined, NotificationsRounded, NotificationsTwoTone, NotificationsSharp),
    IconEntry("Share", Share, ShareOutlined, ShareRounded, ShareTwoTone, ShareSharp),
    IconEntry("Download", Download, DownloadOutlined, DownloadRounded, DownloadTwoTone, DownloadSharp),
    IconEntry("Upload", Upload, UploadOutlined, UploadRounded, UploadTwoTone, UploadSharp),
    IconEntry("CloudUpload", CloudUpload, CloudUploadOutlined, CloudUploadRounded, CloudUploadTwoTone, CloudUploadSharp),
    IconEntry("CloudDownload", CloudDownload, CloudDownloadOutlined, CloudDownloadRounded, CloudDownloadTwoTone, CloudDownloadSharp),
    IconEntry("Folder", Folder, FolderOutlined, FolderRounded, FolderTwoTone, FolderSharp),
    IconEntry("FolderOpen", FolderOpen, FolderOpenOutlined, FolderOpenRounded, FolderOpenTwoTone, FolderOpenSharp),
    IconEntry("Image", Image, ImageOutlined, ImageRounded, ImageTwoTone, ImageSharp),
    IconEntry("Camera", Camera, CameraOutlined, CameraRounded, CameraTwoTone, CameraSharp),
    IconEntry("Videocam", Videocam, VideocamOutlined, VideocamRounded, VideocamTwoTone, VideocamSharp),
    IconEntry("Mic", Mic, MicOutlined, MicRounded, MicTwoTone, MicSharp),
    IconEntry("VolumeUp", VolumeUp, VolumeUpOutlined, VolumeUpRounded, VolumeUpTwoTone, VolumeUpSharp),
    IconEntry("VolumeOff", VolumeOff, VolumeOffOutlined, VolumeOffRounded, VolumeOffTwoTone, VolumeOffSharp),
    IconEntry("PlayArrow", PlayArrow, PlayArrowOutlined, PlayArrowRounded, PlayArrowTwoTone, PlayArrowSharp),
    IconEntry("Pause", Pause, PauseOutlined, PauseRounded, PauseTwoTone, PauseSharp),
    IconEntry("Stop", Stop, StopOutlined, StopRounded, StopTwoTone, StopSharp),
    IconEntry("SkipNext", SkipNext, SkipNextOutlined, SkipNextRounded, SkipNextTwoTone, SkipNextSharp),
    IconEntry("SkipPrevious", SkipPrevious, SkipPreviousOutlined, SkipPreviousRounded, SkipPreviousTwoTone, SkipPreviousSharp),
    IconEntry("ShoppingCart", ShoppingCart, ShoppingCartOutlined, ShoppingCartRounded, ShoppingCartTwoTone, ShoppingCartSharp),
    IconEntry("Payment", Payment, PaymentOutlined, PaymentRounded, PaymentTwoTone, PaymentSharp),
    IconEntry("LocationOn", LocationOn, LocationOnOutlined, LocationOnRounded, LocationOnTwoTone, LocationOnSharp),
    IconEntry("Map", Map, MapOutlined, MapRounded, MapTwoTone, MapSharp),
    IconEntry("Navigation", Navigation, NavigationOutlined, NavigationRounded, NavigationTwoTone, NavigationSharp),
    IconEntry("Directions", Directions, DirectionsOutlined, DirectionsRounded, DirectionsTwoTone, DirectionsSharp),
    IconEntry("AccessTime", AccessTime, AccessTimeOutlined, AccessTimeRounded, AccessTimeTwoTone, AccessTimeSharp),
    IconEntry("CalendarToday", CalendarToday, CalendarTodayOutlined, CalendarTodayRounded, CalendarTodayTwoTone, CalendarTodaySharp),
    IconEntry("Info", Info, InfoOutlined, InfoRounded, InfoTwoTone, InfoSharp),
    IconEntry("Warning", Warning, WarningOutlined, WarningRounded, WarningTwoTone, WarningSharp),
    IconEntry("Error", Error, ErrorOutlined, ErrorRounded, ErrorTwoTone, ErrorSharp),
    IconEntry("CheckCircle", CheckCircle, CheckCircleOutlined, CheckCircleRounded, CheckCircleTwoTone, CheckCircleSharp),
    IconEntry("Help", Help, HelpOutlined, HelpRounded, HelpTwoTone, HelpSharp),
    IconEntry("Visibility", Visibility, VisibilityOutlined, VisibilityRounded, VisibilityTwoTone, VisibilitySharp),
    IconEntry("VisibilityOff", VisibilityOff, VisibilityOffOutlined, VisibilityOffRounded, VisibilityOffTwoTone, VisibilityOffSharp),
    IconEntry("Refresh", Refresh, RefreshOutlined, RefreshRounded, RefreshTwoTone, RefreshSharp),
    IconEntry("ArrowBack", ArrowBack, ArrowBackOutlined, ArrowBackRounded, ArrowBackTwoTone, ArrowBackSharp),
    IconEntry("ArrowForward", ArrowForward, ArrowForwardOutlined, ArrowForwardRounded, ArrowForwardTwoTone, ArrowForwardSharp),
    IconEntry("Print", Print, PrintOutlined, PrintRounded, PrintTwoTone, PrintSharp),
    IconEntry("Save", Save, SaveOutlined, SaveRounded, SaveTwoTone, SaveSharp),
    IconEntry("ContentCopy", ContentCopy, ContentCopyOutlined, ContentCopyRounded, ContentCopyTwoTone, ContentCopySharp),
    IconEntry("ContentPaste", ContentPaste, ContentPasteOutlined, ContentPasteRounded, ContentPasteTwoTone, ContentPasteSharp),
    IconEntry("ContentCut", ContentCut, ContentCutOutlined, ContentCutRounded, ContentCutTwoTone, ContentCutSharp),
    IconEntry("Undo", Undo, UndoOutlined, UndoRounded, UndoTwoTone, UndoSharp),
    IconEntry("Redo", Redo, RedoOutlined, RedoRounded, RedoTwoTone, RedoSharp),
    IconEntry("Link", LinkIcon, LinkIconOutlined, LinkIconRounded, LinkIconTwoTone, LinkIconSharp),
    IconEntry("Bluetooth", Bluetooth, BluetoothOutlined, BluetoothRounded, BluetoothTwoTone, BluetoothSharp),
    IconEntry("Wifi", Wifi, WifiOutlined, WifiRounded, WifiTwoTone, WifiSharp),
    IconEntry("Battery20", Battery20, Battery20Outlined, Battery20Rounded, Battery20TwoTone, Battery20Sharp),
    IconEntry("BatteryFull", BatteryFull, BatteryFullOutlined, BatteryFullRounded, BatteryFullTwoTone, BatteryFullSharp),
    IconEntry("Brightness5", Brightness5, Brightness5Outlined, Brightness5Rounded, Brightness5TwoTone, Brightness5Sharp),
    IconEntry("DarkMode", DarkMode, DarkModeOutlined, DarkModeRounded, DarkModeTwoTone, DarkModeSharp),
    IconEntry("LightMode", LightMode, LightModeOutlined, LightModeRounded, LightModeTwoTone, LightModeSharp),
    IconEntry("Abc", Abc, AbcOutlined, AbcRounded, AbcTwoTone, AbcSharp),
    IconEntry("BarChart", BarChart, BarChartOutlined, BarChartRounded, BarChartTwoTone, BarChartSharp),
    IconEntry("Analytics", Analytics, AnalyticsOutlined, AnalyticsRounded, AnalyticsTwoTone, AnalyticsSharp),
    IconEntry("Code", Code, CodeOutlined, CodeRounded, CodeTwoTone, CodeSharp),
    IconEntry("Build", Build, BuildOutlined, BuildRounded, BuildTwoTone, BuildSharp),
    IconEntry("BugReport", BugReport, BugReportOutlined, BugReportRounded, BugReportTwoTone, BugReportSharp),
    IconEntry("Terminal", Terminal, TerminalOutlined, TerminalRounded, TerminalTwoTone, TerminalSharp),
    IconEntry("AccountCircle", AccountCircle, AccountCircleOutlined, AccountCircleRounded, AccountCircleTwoTone, AccountCircleSharp),
    IconEntry("Badge", BadgeIcon, BadgeIconOutlined, BadgeIconRounded, BadgeIconTwoTone, BadgeIconSharp),
    IconEntry("Group", Group, GroupOutlined, GroupRounded, GroupTwoTone, GroupSharp),
    IconEntry("Groups", Groups, GroupsOutlined, GroupsRounded, GroupsTwoTone, GroupsSharp),
    IconEntry("Diversity3", Diversity3, Diversity3Outlined, Diversity3Rounded, Diversity3TwoTone, Diversity3Sharp),
    IconEntry("Public", Public, PublicOutlined, PublicRounded, PublicTwoTone, PublicSharp),
    IconEntry("Language", Language, LanguageOutlined, LanguageRounded, LanguageTwoTone, LanguageSharp),
    IconEntry("Translate", Translate, TranslateOutlined, TranslateRounded, TranslateTwoTone, TranslateSharp),
    IconEntry("School", School, SchoolOutlined, SchoolRounded, SchoolTwoTone, SchoolSharp),
    IconEntry("Work", Work, WorkOutlined, WorkRounded, WorkTwoTone, WorkSharp),
    IconEntry("Apartment", Apartment, ApartmentOutlined, ApartmentRounded, ApartmentTwoTone, ApartmentSharp),
    IconEntry("LocalHospital", LocalHospital, LocalHospitalOutlined, LocalHospitalRounded, LocalHospitalTwoTone, LocalHospitalSharp),
    IconEntry("LocalPolice", LocalPolice, LocalPoliceOutlined, LocalPoliceRounded, LocalPoliceTwoTone, LocalPoliceSharp),
    IconEntry("DirectionsCar", DirectionsCar, DirectionsCarOutlined, DirectionsCarRounded, DirectionsCarTwoTone, DirectionsCarSharp),
    IconEntry("Flight", Flight, FlightOutlined, FlightRounded, FlightTwoTone, FlightSharp),
    IconEntry("Train", Train, TrainOutlined, TrainRounded, TrainTwoTone, TrainSharp),
    IconEntry("Pets", Pets, PetsOutlined, PetsRounded, PetsTwoTone, PetsSharp),
    IconEntry("Park", Park, ParkOutlined, ParkRounded, ParkTwoTone, ParkSharp),
    IconEntry("Nature", Nature, NatureOutlined, NatureRounded, NatureTwoTone, NatureSharp),
    IconEntry("WbSunny", WbSunny, WbSunnyOutlined, WbSunnyRounded, WbSunnyTwoTone, WbSunnySharp),
    IconEntry("AcUnit", AcUnit, AcUnitOutlined, AcUnitRounded, AcUnitTwoTone, AcUnitSharp),
    IconEntry("Thermostat", Thermostat, ThermostatOutlined, ThermostatRounded, ThermostatTwoTone, ThermostatSharp),
    IconEntry("Restaurant", Restaurant, RestaurantOutlined, RestaurantRounded, RestaurantTwoTone, RestaurantSharp),
    IconEntry("LocalCafe", LocalCafe, LocalCafeOutlined, LocalCafeRounded, LocalCafeTwoTone, LocalCafeSharp),
    IconEntry("SportsSoccer", SportsSoccer, SportsSoccerOutlined, SportsSoccerRounded, SportsSoccerTwoTone, SportsSoccerSharp),
    IconEntry("SportsBasketball", SportsBasketball, SportsBasketballOutlined, SportsBasketballRounded, SportsBasketballTwoTone, SportsBasketballSharp),
    IconEntry("FitnessCenter", FitnessCenter, FitnessCenterOutlined, FitnessCenterRounded, FitnessCenterTwoTone, FitnessCenterSharp),
    IconEntry("Spa", Spa, SpaOutlined, SpaRounded, SpaTwoTone, SpaSharp),
)

private enum class IconStyle(
    val label: String,
) {
    Filled("Filled"),
    Outlined("Outlined"),
    Rounded("Rounded"),
    TwoTone("Two Tone"),
    Sharp("Sharp"),
}

val IconsShowcase = FC<Props> {
    var searchQuery by useState("")
    var selectedStyle by useState(IconStyle.Filled)

    val filtered = useMemo(searchQuery) {
        ICONS.filter { it.name.contains(searchQuery, ignoreCase = true) }
    }

    Box {
        sx {
            display = Display.flex
            flexDirection = FlexDirection.column
            gap = 16.px
        }

        Box {
            sx {
                display = Display.flex
                flexDirection = FlexDirection.row
                gap = 16.px
                alignItems = AlignItems.center
                flexWrap = FlexWrap.wrap
            }

            TextField {
                sx {
                    minWidth = 220.px
                }

                id = ElementId("icon-search")
                label = ReactNode("Search icons")
                size = small
                value = searchQuery

                asDynamic().onChange = { event: ChangeEvent<HTMLInputElement> ->
                    searchQuery = event.target.value
                }
            }

            ToggleButtonGroup {
                exclusive = true
                size = small
                value = selectedStyle.name

                onChange = { _: react.dom.events.MouseEvent<HTMLElement, *>, value: Any ->
                    selectedStyle = IconStyle.valueOf(value.toString())
                }

                for (style in IconStyle.entries) {
                    ToggleButton {
                        key = style.name
                        value = style.name

                        +style.label
                    }
                }
            }
        }

        Typography {
            variant = body2
            asDynamic().color = "text.secondary"

            +"${filtered.size} icons"
        }

        Box {
            sx {
                display = Display.grid
                gridTemplateColumns = repeat(autoFill, minmax(80.px, 1.fr))
                gap = 8.px
            }

            for (entry in filtered) {
                val Icon = when (selectedStyle) {
                    IconStyle.Filled -> entry.filled
                    IconStyle.Outlined -> entry.outlined
                    IconStyle.Rounded -> entry.rounded
                    IconStyle.TwoTone -> entry.twoTone
                    IconStyle.Sharp -> entry.sharp
                }

                Box {
                    sx {
                        display = Display.flex
                        flexDirection = FlexDirection.column
                        alignItems = AlignItems.center
                        justifyContent = JustifyContent.center
                        padding = 8.px
                        borderRadius = 4.px
                        gap = 4.px
                        hover {
                            backgroundColor = Color("action.hover")
                        }
                    }

                    key = entry.name

                    Tooltip {
                        title = ReactNode(entry.name)

                        Icon()
                    }

                    Typography {
                        sx {
                            textAlign = TextAlign.center
                            overflow = Overflow.hidden
                            textOverflow = TextOverflow.ellipsis
                            whiteSpace = WhiteSpace.nowrap
                            width = 72.px
                        }

                        variant = caption

                        +entry.name
                    }
                }
            }
        }
    }
}
