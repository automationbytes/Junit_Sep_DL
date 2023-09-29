package Junit4Examples;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCategories {

    @Category(FunctionalTests.class)
    @Test
    public void testC(){
        System.out.println("Test C Category");
    }

    @Ignore
    @Category(SanityTest.class)
    @Test
    public void testA(){
        System.out.println("Test A Category");
    }

    @Category(NonFunctionalTests.class)
    @Test
    public void testB(){
        System.out.println("Test B Category");
    }


}
