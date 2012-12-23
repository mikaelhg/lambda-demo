package lambda

import org.junit.After
import org.junit.Before
import org.junit.Test
import static org.mockito.Mockito.*;
import lambda.groovy.GroovyDemo

/**
 * You shouldn't test System.out like this. This is very bad. The only reason
 * I'm doing it like this is because this isn't production code, but concept
 * demonstration. DON'T DO LIKE I DO, DO WHAT I SAY!
 */
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
