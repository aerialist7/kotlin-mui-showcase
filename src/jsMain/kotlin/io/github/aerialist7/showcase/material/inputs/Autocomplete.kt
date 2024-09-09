package io.github.aerialist7.showcase.material.inputs

import js.objects.jso
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
    Autocomplete<AutocompleteProps<Movie>> {
        sx { width = 300.px }
        options = top100Films
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
    Movie("The Shawshank Redemption", 1994),
    Movie("The Godfather", 1972),
    Movie("The Godfather: Part II", 1974),
    Movie("The Dark Knight", 2008),
    Movie("12 Angry Men", 1957),
    Movie("Schindler's List", 1993),
    Movie("Pulp Fiction", 1994),
    Movie("The Lord of the Rings: The Return of the King", 2003),
    Movie("The Good, the Bad and the Ugly", 1966),
    Movie("Fight Club", 1999),
    Movie("The Lord of the Rings: The Fellowship of the Ring", 2001),
    Movie("Star Wars: Episode V - The Empire Strikes Back", 1980),
    Movie("Forrest Gump", 1994),
    Movie("Inception", 2010),
    Movie("The Lord of the Rings: The Two Towers", 2002),
    Movie("One Flew Over the Cuckoo's Nest", 1975),
    Movie("Goodfellas", 1990),
    Movie("The Matrix", 1999),
    Movie("Seven Samurai", 1954),
    Movie("Star Wars: Episode IV - A New Hope", 1977),
    Movie("City of God", 2002),
    Movie("Se7en", 1995),
    Movie("The Silence of the Lambs", 1991),
    Movie("It's a Wonderful Life", 1946),
    Movie("Life Is Beautiful", 1997),
    Movie("The Usual Suspects", 1995),
    Movie("Léon: The Professional", 1994),
    Movie("Spirited Away", 2001),
    Movie("Saving Private Ryan", 1998),
    Movie("Once Upon a Time in the West", 1968),
    Movie("American History X", 1998),
    Movie("Interstellar", 2014),
    Movie("Casablanca", 1942),
    Movie("City Lights", 1931),
    Movie("Psycho", 1960),
    Movie("The Green Mile", 1999),
    Movie("The Intouchables", 2011),
    Movie("Modern Times", 1936),
    Movie("Raiders of the Lost Ark", 1981),
    Movie("Rear Window", 1954),
    Movie("The Pianist", 2002),
    Movie("The Departed", 2006),
    Movie("Terminator 2: Judgment Day", 1991),
    Movie("Back to the Future", 1985),
    Movie("Whiplash", 2014),
    Movie("Gladiator", 2000),
    Movie("Memento", 2000),
    Movie("The Prestige", 2006),
    Movie("The Lion King", 1994),
    Movie("Apocalypse Now", 1979),
    Movie("Alien", 1979),
    Movie("Sunset Boulevard", 1950),
    Movie("Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb", 1964),
    Movie("The Great Dictator", 1940),
    Movie("Cinema Paradiso", 1988),
    Movie("The Lives of Others", 2006),
    Movie("Grave of the Fireflies", 1988),
    Movie("Paths of Glory", 1957),
    Movie("Django Unchained", 2012),
    Movie("The Shining", 1980),
    Movie("WALL·E", 2008),
    Movie("American Beauty", 1999),
    Movie("The Dark Knight Rises", 2012),
    Movie("Princess Mononoke", 1997),
    Movie("Aliens", 1986),
    Movie("Oldboy", 2003),
    Movie("Once Upon a Time in America", 1984),
    Movie("Witness for the Prosecution", 1957),
    Movie("Das Boot", 1981),
    Movie("Citizen Kane", 1941),
    Movie("North by Northwest", 1959),
    Movie("Vertigo", 1958),
    Movie("Star Wars: Episode VI - Return of the Jedi", 1983),
    Movie("Reservoir Dogs", 1992),
    Movie("Braveheart", 1995),
    Movie("M", 1931),
    Movie("Requiem for a Dream", 2000),
    Movie("Amélie", 2001),
    Movie("A Clockwork Orange", 1971),
    Movie("Like Stars on Earth", 2007),
    Movie("Taxi Driver", 1976),
    Movie("Lawrence of Arabia", 1962),
    Movie("Double Indemnity", 1944),
    Movie("Eternal Sunshine of the Spotless Mind", 2004),
    Movie("Amadeus", 1984),
    Movie("To Kill a Mockingbird", 1962),
    Movie("Toy Story 3", 2010),
    Movie("Logan", 2017),
    Movie("Full Metal Jacket", 1987),
    Movie("Dangal", 2016),
    Movie("The Sting", 1973),
    Movie("2001: A Space Odyssey", 1968),
    Movie("Singin' in the Rain", 1952),
    Movie("Toy Story", 1995),
    Movie("Bicycle Thieves", 1948),
    Movie("The Kid", 1921),
    Movie("Inglourious Basterds", 2009),
    Movie("Snatch", 2000),
    Movie("3 Idiots", 2009),
    Movie("Monty Python and the Holy Grail", 1975),
)

private external interface Movie {
    var label: String
    var year: Int
}

private fun Movie(label: String, year: Int): Movie = jso {
    this.label = label
    this.year = year
}
