package lambda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Block;
import java.util.function.Function;

public class LambdaDemo {

    /**
     * http://en.wikipedia.org/wiki/List_of_The_Wire_characters
     */
    public static class TheWireCharacter {
        public final String name;
        public final Set<Integer> seasons;
        public TheWireCharacter(final String name, final Integer ... seasons) {
            this.name = name;
            this.seasons = Collections.unmodifiableSet(new TreeSet<>(Arrays.asList(seasons)));
        }
        public String toString() {
            return name;
        }
    }



    public static void main(final String ... args) {
        final List<TheWireCharacter> characters = Arrays.asList(
                new TheWireCharacter("Jimmy McNulty", 1, 2, 3, 4, 5),
                new TheWireCharacter("Lester Freamon", 2, 3, 4, 5),
                new TheWireCharacter("Stringer Bell", 1, 2, 3),
                new TheWireCharacter("Prez", 3, 4),
                new TheWireCharacter("Omar Little", 3, 4, 5),
                new TheWireCharacter("Chris Partlow", 5),
                new TheWireCharacter("Frank Sobotka", 2),
                new TheWireCharacter("D'Angelo Barksdale", 1, 2),
                new TheWireCharacter("Avon Barksdale", 1, 2, 3)
        );

        final List<TheWireCharacter> docks = characters.stream()
                        .filter(c -> c.seasons.contains(2))
                        .sorted((a, b) -> a.seasons.size() - b.seasons.size())
                        .into(new ArrayList<TheWireCharacter>());

        System.out.println("Characters in the Baltimore docks-centered season: " + docks);
    }

}
