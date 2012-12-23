package lambda.groovy

/**
 * http://en.wikipedia.org/wiki/List_of_The_Wire_characters
 */
class TheWireCharacter {
    String name;
    Set<Integer> seasons;
}

def CHARACTERS = Collections.unmodifiableList(Arrays.asList(
        new TheWireCharacter(name: "Jimmy McNulty", seasons: [1, 2, 3, 4, 5] as Set),
        new TheWireCharacter(name: "Lester Freamon", seasons: [2, 3, 4, 5] as Set),
        new TheWireCharacter(name: "Stringer Bell", seasons: [1, 2, 3] as Set),
        new TheWireCharacter(name: "Prez", seasons: [3, 4] as Set),
        new TheWireCharacter(name: "Omar Little", seasons: [3, 4, 5] as Set),
        new TheWireCharacter(name: "Chris Partlow", seasons: [5] as Set),
        new TheWireCharacter(name: "Frank Sobotka", seasons: [2] as Set),
        new TheWireCharacter(name: "D'Angelo Barksdale", seasons: [1, 2] as Set),
        new TheWireCharacter(name: "Avon Barksdale", seasons: [1, 2, 3] as Set)
));

def docks = CHARACTERS.findAll { it.seasons.contains(2) }
                      .sort { it.seasons.size() }
                      .collect { it.name }

println("Characters in the Baltimore docks-centered season: " + docks)
