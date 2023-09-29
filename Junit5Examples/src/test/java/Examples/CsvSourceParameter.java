package Examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CsvSourceParameter {


    @ParameterizedTest
    @CsvSource({"2,4","3,9","4,16"})
    void testWithMultipleParameters(int val, int sq){
        System.out.println(val*val);
        assertEquals(val*val,sq);
    }
}
