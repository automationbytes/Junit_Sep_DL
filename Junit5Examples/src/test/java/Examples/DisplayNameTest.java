package Examples;

import org.junit.jupiter.api.*;

import java.util.Map;


@TestMethodOrder(MethodOrderer.DisplayName.class)
@DisplayName("Test Display Name Functionality")
public class DisplayNameTest {

    @Test
    @DisplayName("Test to perform testz method")
    void testz() {
        System.out.println("text z");

        Map<String, String> env = System.getenv();

        // Java 8
        env.forEach((k, v) -> System.out.println(k + ":" + v));




}

    @Test
    @DisplayName("Test to perform testd method")
    void testd() {
        System.out.println("text d");
    }

}
