package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaDemo {

    public static class TheWireCharacter {
        public final String name;
        public final Set<Integer> seasons;
        public TheWireCharacter(final String name, final Integer ... seasons) {
            this.name = name;
            this.seasons = Collections.unmodifiableSet(new TreeSet<>(Arrays.asList(seasons)));
        }
    }

    private static final List<TheWireCharacter> CHARACTERS = Collections.unmodifiableList(Arrays.asList(
            new TheWireCharacter("Jimmy McNulty", 1, 2, 3, 4, 5),
            new TheWireCharacter("Lester Freamon", 2, 3, 4, 5),
            new TheWireCharacter("Stringer Bell", 1, 2, 3),
            new TheWireCharacter("Prez", 3, 4),
            new TheWireCharacter("Omar Little", 3, 4, 5),
            new TheWireCharacter("Chris Partlow", 5),
            new TheWireCharacter("Frank Sobotka", 2),
            new TheWireCharacter("D'Angelo Barksdale", 1, 2),
            new TheWireCharacter("Avon Barksdale", 1, 2, 3)
    ));

    public static void main(final String ... args) {
        final List<String> docks = CHARACTERS.stream()
                        .filter(c -> c.seasons.contains(2))
                        .sorted((a, b) -> a.seasons.size() - b.seasons.size())
                        .map(c -> c.name)
                        .collect(Collectors.toList());

        System.out.println("Characters in the Baltimore docks-centered season: " + docks);
    }

}
