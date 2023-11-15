package lambda.kotlin

data class TheWireCharacter(val name : String, val seasons : Set<Int>)

private val CHARACTERS = listOf(
        TheWireCharacter("Jimmy McNulty", setOf(1, 2, 3, 4, 5)),
        TheWireCharacter("Lester Freamon", setOf(2, 3, 4, 5)),
        TheWireCharacter("Stringer Bell", setOf(1, 2, 3)),
        TheWireCharacter("Prez", setOf(3, 4)),
        TheWireCharacter("Omar Little", setOf(3, 4, 5)),
        TheWireCharacter("Chris Partlow", setOf(5)),
        TheWireCharacter("Frank Sobotka", setOf(2)),
        TheWireCharacter("D'Angelo Barksdale", setOf(1, 2)),
        TheWireCharacter("Avon Barksdale", setOf(1, 2, 3))
)

fun main() {
    val docks = CHARACTERS.filter { 2 in it.seasons }
                          .sortedBy { it.seasons.size }
                          .map { it.name }

    println("Characters in the Baltimore docks-centered season: $docks")
}
