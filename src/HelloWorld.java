import java.util.Locale;
import java.util.ResourceBundle;
import java.io.PrintStream;

public class HelloWorld {
	public static final String LANGUAGE_DE = "de";
	public static final String COUNTRY_DE = "DE";

	public static final String LANGUAGE_EN = "en";
	public static final String COUNTRY_EN = "US";

    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
    	PrintStream output = new PrintStream(System.out, true, "UTF-8");
        HelloWorld hello = new HelhloWorld();
        Locale locale = new Locale(LANGUAGE_DE, COUNTRY_DE);

        output.println(hello.sayHello(locale));
    }
    String sayHello(Locale locale) {
    	ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.messages", locale);

        return resourceBundle.getString("hello.world");
    }
}
