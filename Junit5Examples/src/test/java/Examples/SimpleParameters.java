package Examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleParameters {

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void testnumbers(int arg){
        System.out.println(arg);
    }

    @ParameterizedTest(name = "{index} - Run with parameter {0}")
    @ValueSource(ints = {10,20,30})
    void testnumberswithName(int arg){
        System.out.println(arg);
    }

    @ParameterizedTest(name = "{index} - Run with parameter {0}")
    @ValueSource(strings = {"1000","200","30"})
    void testnumberswithName(String arg){
        System.out.println(arg.length());
    }
}
