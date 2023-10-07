package team.karakum.showcase.material

import js.core.jso
import mui.material.Autocomplete
import mui.material.AutocompleteProps
import mui.material.TextField
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.create
import web.cssom.px

val AutocompleteShowcase = FC<Props> {
    @Suppress("UPPER_BOUND_VIOLATED")
    Autocomplete<AutocompleteProps<team.karakum.showcase.material.Movie>> {
        sx { width = 300.px }
        options = team.karakum.showcase.material.top100Films
        disablePortal = true
        renderInput = { params ->
            TextField.create {
                +params
                label = ReactNode("Movie")
            }
        }
    }
}

private val top100Films = arrayOf(
    team.karakum.showcase.material.Movie("The Shawshank Redemption", 1994),
    team.karakum.showcase.material.Movie("The Godfather", 1972),
    team.karakum.showcase.material.Movie("The Godfather: Part II", 1974),
    team.karakum.showcase.material.Movie("The Dark Knight", 2008),
    team.karakum.showcase.material.Movie("12 Angry Men", 1957),
    team.karakum.showcase.material.Movie("Schindler's List", 1993),
    team.karakum.showcase.material.Movie("Pulp Fiction", 1994),
    team.karakum.showcase.material.Movie("The Lord of the Rings: The Return of the King", 2003),
    team.karakum.showcase.material.Movie("The Good, the Bad and the Ugly", 1966),
    team.karakum.showcase.material.Movie("Fight Club", 1999),
    team.karakum.showcase.material.Movie("The Lord of the Rings: The Fellowship of the Ring", 2001),
    team.karakum.showcase.material.Movie("Star Wars: Episode V - The Empire Strikes Back", 1980),
    team.karakum.showcase.material.Movie("Forrest Gump", 1994),
    team.karakum.showcase.material.Movie("Inception", 2010),
    team.karakum.showcase.material.Movie("The Lord of the Rings: The Two Towers", 2002),
    team.karakum.showcase.material.Movie("One Flew Over the Cuckoo's Nest", 1975),
    team.karakum.showcase.material.Movie("Goodfellas", 1990),
    team.karakum.showcase.material.Movie("The Matrix", 1999),
    team.karakum.showcase.material.Movie("Seven Samurai", 1954),
    team.karakum.showcase.material.Movie("Star Wars: Episode IV - A New Hope", 1977),
    team.karakum.showcase.material.Movie("City of God", 2002),
    team.karakum.showcase.material.Movie("Se7en", 1995),
    team.karakum.showcase.material.Movie("The Silence of the Lambs", 1991),
    team.karakum.showcase.material.Movie("It's a Wonderful Life", 1946),
    team.karakum.showcase.material.Movie("Life Is Beautiful", 1997),
    team.karakum.showcase.material.Movie("The Usual Suspects", 1995),
    team.karakum.showcase.material.Movie("Léon: The Professional", 1994),
    team.karakum.showcase.material.Movie("Spirited Away", 2001),
    team.karakum.showcase.material.Movie("Saving Private Ryan", 1998),
    team.karakum.showcase.material.Movie("Once Upon a Time in the West", 1968),
    team.karakum.showcase.material.Movie("American History X", 1998),
    team.karakum.showcase.material.Movie("Interstellar", 2014),
    team.karakum.showcase.material.Movie("Casablanca", 1942),
    team.karakum.showcase.material.Movie("City Lights", 1931),
    team.karakum.showcase.material.Movie("Psycho", 1960),
    team.karakum.showcase.material.Movie("The Green Mile", 1999),
    team.karakum.showcase.material.Movie("The Intouchables", 2011),
    team.karakum.showcase.material.Movie("Modern Times", 1936),
    team.karakum.showcase.material.Movie("Raiders of the Lost Ark", 1981),
    team.karakum.showcase.material.Movie("Rear Window", 1954),
    team.karakum.showcase.material.Movie("The Pianist", 2002),
    team.karakum.showcase.material.Movie("The Departed", 2006),
    team.karakum.showcase.material.Movie("Terminator 2: Judgment Day", 1991),
    team.karakum.showcase.material.Movie("Back to the Future", 1985),
    team.karakum.showcase.material.Movie("Whiplash", 2014),
    team.karakum.showcase.material.Movie("Gladiator", 2000),
    team.karakum.showcase.material.Movie("Memento", 2000),
    team.karakum.showcase.material.Movie("The Prestige", 2006),
    team.karakum.showcase.material.Movie("The Lion King", 1994),
    team.karakum.showcase.material.Movie("Apocalypse Now", 1979),
    team.karakum.showcase.material.Movie("Alien", 1979),
    team.karakum.showcase.material.Movie("Sunset Boulevard", 1950),
    team.karakum.showcase.material.Movie("Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb", 1964),
    team.karakum.showcase.material.Movie("The Great Dictator", 1940),
    team.karakum.showcase.material.Movie("Cinema Paradiso", 1988),
    team.karakum.showcase.material.Movie("The Lives of Others", 2006),
    team.karakum.showcase.material.Movie("Grave of the Fireflies", 1988),
    team.karakum.showcase.material.Movie("Paths of Glory", 1957),
    team.karakum.showcase.material.Movie("Django Unchained", 2012),
    team.karakum.showcase.material.Movie("The Shining", 1980),
    team.karakum.showcase.material.Movie("WALL·E", 2008),
    team.karakum.showcase.material.Movie("American Beauty", 1999),
    team.karakum.showcase.material.Movie("The Dark Knight Rises", 2012),
    team.karakum.showcase.material.Movie("Princess Mononoke", 1997),
    team.karakum.showcase.material.Movie("Aliens", 1986),
    team.karakum.showcase.material.Movie("Oldboy", 2003),
    team.karakum.showcase.material.Movie("Once Upon a Time in America", 1984),
    team.karakum.showcase.material.Movie("Witness for the Prosecution", 1957),
    team.karakum.showcase.material.Movie("Das Boot", 1981),
    team.karakum.showcase.material.Movie("Citizen Kane", 1941),
    team.karakum.showcase.material.Movie("North by Northwest", 1959),
    team.karakum.showcase.material.Movie("Vertigo", 1958),
    team.karakum.showcase.material.Movie("Star Wars: Episode VI - Return of the Jedi", 1983),
    team.karakum.showcase.material.Movie("Reservoir Dogs", 1992),
    team.karakum.showcase.material.Movie("Braveheart", 1995),
    team.karakum.showcase.material.Movie("M", 1931),
    team.karakum.showcase.material.Movie("Requiem for a Dream", 2000),
    team.karakum.showcase.material.Movie("Amélie", 2001),
    team.karakum.showcase.material.Movie("A Clockwork Orange", 1971),
    team.karakum.showcase.material.Movie("Like Stars on Earth", 2007),
    team.karakum.showcase.material.Movie("Taxi Driver", 1976),
    team.karakum.showcase.material.Movie("Lawrence of Arabia", 1962),
    team.karakum.showcase.material.Movie("Double Indemnity", 1944),
    team.karakum.showcase.material.Movie("Eternal Sunshine of the Spotless Mind", 2004),
    team.karakum.showcase.material.Movie("Amadeus", 1984),
    team.karakum.showcase.material.Movie("To Kill a Mockingbird", 1962),
    team.karakum.showcase.material.Movie("Toy Story 3", 2010),
    team.karakum.showcase.material.Movie("Logan", 2017),
    team.karakum.showcase.material.Movie("Full Metal Jacket", 1987),
    team.karakum.showcase.material.Movie("Dangal", 2016),
    team.karakum.showcase.material.Movie("The Sting", 1973),
    team.karakum.showcase.material.Movie("2001: A Space Odyssey", 1968),
    team.karakum.showcase.material.Movie("Singin' in the Rain", 1952),
    team.karakum.showcase.material.Movie("Toy Story", 1995),
    team.karakum.showcase.material.Movie("Bicycle Thieves", 1948),
    team.karakum.showcase.material.Movie("The Kid", 1921),
    team.karakum.showcase.material.Movie("Inglourious Basterds", 2009),
    team.karakum.showcase.material.Movie("Snatch", 2000),
    team.karakum.showcase.material.Movie("3 Idiots", 2009),
    team.karakum.showcase.material.Movie("Monty Python and the Holy Grail", 1975),
)

private external interface Movie {
    var label: String
    var year: Int
}

private fun Movie(label: String, year: Int): team.karakum.showcase.material.Movie = jso {
    this.label = label
    this.year = year
}
