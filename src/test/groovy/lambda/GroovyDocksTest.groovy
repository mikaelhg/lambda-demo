package lambda

import org.junit.After
import org.junit.Before
import org.junit.Test
import static org.mockito.Mockito.*;

public class GroovyDocksTest {

    private expected = "Characters in the Baltimore docks-centered season: [Frank Sobotka, D'Angelo Barksdale, Stringer Bell, Avon Barksdale, Lester Freamon, Jimmy McNulty]"

    private PrintStream realOut;

    @Before
    public void saveOut() {
        realOut = System.out
        System.setOut(mock(PrintStream.class))
    }

    @After
    public void retrieveOut() {
        System.setOut(realOut)
    }

    @Test
    public void testJava8() {
        LambdaDemo.main();
        verify(System.out).println(expected);
    }

    @Test
    public void testGroovy() {
        GroovyDemo.main();
        verify(System.out).println(expected);
    }

}
