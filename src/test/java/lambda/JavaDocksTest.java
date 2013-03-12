package lambda;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * You shouldn't test System.out like this. This is very bad. The only reason
 * I'm doing it like this is because this isn't production code, but concept
 * demonstration. DON'T DO WHAT I DO, DO WHAT I SAY!
 */
public class JavaDocksTest {

    private static final String EXPECTED =
            "Characters in the Baltimore docks-centered season: [Frank Sobotka, D'Angelo Barksdale, Stringer Bell, Avon Barksdale, Lester Freamon, Jimmy McNulty]\n";

    private final static String[] EMPTY_ARRAY = new String[0];

    @Test
    public void testKotlin() throws Exception {
        final PrintStream oldOut = System.out;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
             final PrintStream newOut = new PrintStream(baos))
        {
            System.setOut(newOut);
            lambda.kotlin.KotlinPackage.main(EMPTY_ARRAY);
            Assert.assertEquals(baos.toString("UTF-8"), EXPECTED);
        } finally {
            System.setOut(oldOut);
        }
    }

}
