package lambda.kotlin

data class TheWireCharacter(val name : String, val seasons : Array<Int>)

private val CHARACTERS = arrayOf(
        TheWireCharacter("Jimmy McNulty", arrayOf(1, 2, 3, 4, 5)),
        TheWireCharacter("Lester Freamon", arrayOf(2, 3, 4, 5)),
        TheWireCharacter("Stringer Bell", arrayOf(1, 2, 3)),
        TheWireCharacter("Prez", arrayOf(3, 4)),
        TheWireCharacter("Omar Little", arrayOf(3, 4, 5)),
        TheWireCharacter("Chris Partlow", arrayOf(5)),
        TheWireCharacter("Frank Sobotka", arrayOf(2)),
        TheWireCharacter("D'Angelo Barksdale", arrayOf(1, 2)),
        TheWireCharacter("Avon Barksdale", arrayOf(1, 2, 3))
)

fun main(args : Array<String>) {
    val docks = CHARACTERS.filter { 2 in it.seasons }
                          .sortedBy { it.seasons.size }
                          .map { it.name }

    println("Characters in the Baltimore docks-centered season: $docks")
}
