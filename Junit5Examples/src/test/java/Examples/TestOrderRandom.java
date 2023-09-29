package Examples;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.Random.class)
public class TestOrderRandom {

    @Test
    void testz() {
        System.out.println("text z");
    }

    @Test
    void testd() {
        System.out.println("text d");
    }


    @Test
    void testa() {
        System.out.println("text a");
    }


    @Test
    void testb() {
        System.out.println("text b");
    }


}
