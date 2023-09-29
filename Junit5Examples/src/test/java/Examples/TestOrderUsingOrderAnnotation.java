package Examples;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrderUsingOrderAnnotation {

    @Test
    @Order(10)
    void testz() {
        System.out.println("text z");
    }

    @Test
    @Order(2)
    void testd() {
        System.out.println("text d");
    }


    @Test
    @Order(-2)
    void testa() {
        System.out.println("text a");
    }


    @Test
    @Order(-2)
    void testb() {
        System.out.println("text b");
    }


}
