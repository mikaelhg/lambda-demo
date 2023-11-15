package lambda;

import java.util.*;

/**
 * Doing it with Ye Olde manual iterating.
 */
public class DumbassDemo {

    /**
     * http://en.wikipedia.org/wiki/List_of_The_Wire_characters
     */
    public static class TheWireCharacter {
        public final String name;
        public final Set<Integer> seasons;
        public TheWireCharacter(final String name, final Integer ... seasons) {
            this.name = name;
            this.seasons = Set.of(seasons);
        }
        public String toString() {
            return name;
        }
    }

    private static final Comparator<TheWireCharacter> BY_SEASONS = new Comparator<TheWireCharacter>() {
        @Override public int compare(final TheWireCharacter a, final TheWireCharacter b) {
            return a.seasons.size() - b.seasons.size();
        }
    };

    public static void main(final String ... args) {
        final List<TheWireCharacter> characters = List.of(
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

        final List<TheWireCharacter> docks = new ArrayList<>();
        for (final TheWireCharacter c : characters) {
            if (c.seasons.contains(2)) {
                docks.add(c);
            }
            // The problem with this approach isn't the actual code we have here, it's benign.
            // Instead, what I've seen happen again and again, is that these manual iterations
            // turn into a very complicated "main loop" into which feature after feature is
            // shoehorned, until it's very hard to tell what is being done, and which part of
            // it connects to which feature.
        }

        docks.sort(BY_SEASONS);

        System.out.println("Characters in the Baltimore docks-centered season: " + docks);
    }

}
