package lambda

data class TheWireCharacter(val name : String, vararg val seasons : Int)

private val CHARACTERS : List<TheWireCharacter> = arrayListOf(
        TheWireCharacter("Jimmy McNulty", 1, 2, 3, 4, 5),
        TheWireCharacter("Lester Freamon", 2, 3, 4, 5),
        TheWireCharacter("Stringer Bell", 1, 2, 3),
        TheWireCharacter("Prez", 3, 4),
        TheWireCharacter("Omar Little", 3, 4, 5),
        TheWireCharacter("Chris Partlow", 5),
        TheWireCharacter("Frank Sobotka", 2),
        TheWireCharacter("D'Angelo Barksdale", 1, 2),
        TheWireCharacter("Avon Barksdale", 1, 2, 3)
)

fun main(args : Array<String>) {
    val docks = CHARACTERS.filter { it.seasons.any { it == 2 } }
                          .sortBy { it.seasons.size }
                          .map { it.name }

    println("Characters in the Baltimore docks-centered season: " + docks)
}
