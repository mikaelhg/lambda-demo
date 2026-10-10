package lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DemosTest {

    private static final String EXPECTED =
            "Characters in the Baltimore docks-centered season: "
                    + "[Frank Sobotka, D'Angelo Barksdale, Stringer Bell, "
                    + "Avon Barksdale, Lester Freamon, Jimmy McNulty]";

    @ParameterizedTest
    @ValueSource(strings = {
            "lambda.DumbassDemo",
            "lambda.GuavaDemo",
            "lambda.EnterpriseGuavaDemo",
            "lambda.LambdaDemo",
            "lambda.kotlin.KotlinDemoKt",
            "lambda.scala.ScalaDemo",
            "lambda.groovy.GroovyDemo",
    })
    void printsDocksCharacters(final String className) throws Exception {
        assertEquals(EXPECTED, runMain(className));
    }

    private static String runMain(final String className) throws Exception {
        final Method main = Class.forName(className).getMethod("main", String[].class);
        final PrintStream original = System.out;
        final ByteArrayOutputStream captured = new ByteArrayOutputStream();
        System.setOut(new PrintStream(captured, true, StandardCharsets.UTF_8));
        try {
            main.invoke(null, (Object) new String[0]);
        } finally {
            System.setOut(original);
        }
        return captured.toString(StandardCharsets.UTF_8).strip();
    }
}
