import org.junit.Test;

public class FirstTestCase {

    @Test
    void setUp()
    {
        System.out.println("Opening browser");
    }

    @Test
    void login()
    {
        System.out.println("This is login test");
    }

    @Test
    void teardown()
    {
        System.out.println("closing browser");
    }


}
