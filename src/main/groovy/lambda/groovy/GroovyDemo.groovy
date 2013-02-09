package lambda.groovy

import groovy.transform.*

@Immutable @TupleConstructor class TheWireCharacter {
    final String name;
    final Set<Integer> seasons;
}

CHARACTERS = [
        new TheWireCharacter("Jimmy McNulty", [1, 2, 3, 4, 5] as Set),
        new TheWireCharacter("Lester Freamon", [2, 3, 4, 5] as Set),
        new TheWireCharacter("Stringer Bell", [1, 2, 3] as Set),
        new TheWireCharacter("Prez", [3, 4] as Set),
        new TheWireCharacter("Omar Little", [3, 4, 5] as Set),
        new TheWireCharacter("Chris Partlow", [5] as Set),
        new TheWireCharacter("Frank Sobotka", [2] as Set),
        new TheWireCharacter("D'Angelo Barksdale", [1, 2] as Set),
        new TheWireCharacter("Avon Barksdale", [1, 2, 3] as Set)
].asImmutable()

docks = CHARACTERS.findAll { it.seasons.contains(2) }
                  .sort { it.seasons.size() }
                  .collect { it.name }

println("Characters in the Baltimore docks-centered season: " + docks)
