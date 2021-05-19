import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.PrintStream;


public class TestTest {
    @Test
    public void testHello() {
        HelloWorld hello = new HelloWorld();

        assertEquals("Hello, World!", hello.sayHello(new Locale("en", "US")));
    }
}
