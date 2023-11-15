package lambda.groovy

import groovy.transform.*

@Immutable @TupleConstructor class TheWireCharacter {
    final String name
    final List<Integer> seasons
}

def CHARACTERS = [
        new TheWireCharacter("Jimmy McNulty", [1, 2, 3, 4, 5]),
        new TheWireCharacter("Lester Freamon", [2, 3, 4, 5]),
        new TheWireCharacter("Stringer Bell", [1, 2, 3]),
        new TheWireCharacter("Prez", [3, 4]),
        new TheWireCharacter("Omar Little", [3, 4, 5]),
        new TheWireCharacter("Chris Partlow", [5]),
        new TheWireCharacter("Frank Sobotka", [2]),
        new TheWireCharacter("D'Angelo Barksdale", [1, 2]),
        new TheWireCharacter("Avon Barksdale", [1, 2, 3]),
].asImmutable()

docks = CHARACTERS.findAll { it.seasons.contains(2) }
                  .sort { it.seasons.size() }
                  .collect { it.name }

println("Characters in the Baltimore docks-centered season: " + docks)
