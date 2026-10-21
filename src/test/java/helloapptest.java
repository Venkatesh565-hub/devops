import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class helloapptest {

    @Test
    public void testGreeting() {
        assertEquals("Hello, DevOps!", helloapp.greet());
    }
}