package lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class JavaDocksTest {

    private static final String EXPECTED =
            "Characters in the Baltimore docks-centered season: [Frank Sobotka, D'Angelo Barksdale, Stringer Bell, Avon Barksdale, Lester Freamon, Jimmy McNulty]";

    private PrintStream realOut;

    @Before
    public void saveOut() {
        realOut = System.out;
        System.setOut(mock(PrintStream.class));
    }

    @After
    public void retrieveOut() {
        System.setOut(realOut);
    }

    @Test
    public void testKotlin() {
        lambda.namespace.main(null);
        verify(System.out).println(EXPECTED);
    }

}
