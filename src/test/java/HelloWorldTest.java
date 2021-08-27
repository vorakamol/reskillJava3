import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloKaran () {
        HelloWorld helloWorld = new HelloWorld();

        String actualResult = helloWorld.greeting("Aom");

        assertEquals("Hello Aom", actualResult);
    }
}
