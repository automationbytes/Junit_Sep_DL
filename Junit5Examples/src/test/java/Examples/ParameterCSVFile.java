package Examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterCSVFile {

    @ParameterizedTest
    @CsvFileSource(resources = "/sample.csv",numLinesToSkip = 1)
    void testCSVInput(int num1, int num2){
        assertEquals(num1*num1,num2,"Both are equal");
    }
}
