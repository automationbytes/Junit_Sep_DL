package Junit4Examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


@RunWith(Parameterized.class)
public class Parameterizedsum {

    public int input1;
    public int input2;
    public int sum;

    public Parameterizedsum(int input1, int input2, int sum) {
        this.input1 = input1;
        this.input2 = input2;
        this.sum = sum;
    }

    //1,2,3

    @Parameterized.Parameters(name = "{index}: input1={0} input2={1} sum={2}?")
    public static Collection<Object[]> data(){
        return Arrays.asList(
                new Object[][]{
                        {1,2,3},
                        {2,2,4},
                        {3,3,9}
                }
        );
    }

    @Test
    public void testSum(){
        Assert.assertEquals(input1+input2, sum);
    }
}
