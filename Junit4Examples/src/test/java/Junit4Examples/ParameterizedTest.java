package Junit4Examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private int input;
    private int expectedvalue; //square of the input

    public ParameterizedTest(int input, int expectedvalue){
        this.input = input;
        this.expectedvalue = expectedvalue;
    }

    @Parameters(name= "{index}:input={0} expectedvalue={1}?")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 4},
                {3, 9},
                {5,10}
        });
    }


    @Test
    public void testSqu(){
        int result = input*input;
        Assert.assertEquals(result,expectedvalue);
    }
}
