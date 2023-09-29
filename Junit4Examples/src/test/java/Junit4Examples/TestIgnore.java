package Junit4Examples;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestIgnore {

    @Test
    public void abc(){
        System.out.println("Test C order");
    }

    @Ignore
    @Test
    public void testA(){
        System.out.println("Test A order");
    }


    @Test
    public void testB(){
        System.out.println("Test B order");
    }



}
