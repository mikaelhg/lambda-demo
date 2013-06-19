package lambda.scala

case class TheWireCharacter(val name : String, val seasons : Int*)


object ScalaDemo extends App {

  val CHARACTERS = Array(
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

  val docks = CHARACTERS.filter { _.seasons.contains(2) }
    .sortBy { -1 * _.seasons.size }
    .map { _.name }

  println("Characters in the Baltimore docks-centered season: " + docks.mkString("[", ", ", "]"))

}
