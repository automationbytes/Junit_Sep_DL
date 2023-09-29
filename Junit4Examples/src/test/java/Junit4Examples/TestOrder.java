package Junit4Examples;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOrder {

    @BeforeClass
    public static void beforeclass(){
        System.out.println("Before Class");
    }


    @Before
    public void before(){
        System.out.println("Before Test");
    }


    @Test
    public void abc(){
        System.out.println("Test C order");
    }


    @Category(SanityTest.class)
    @Test
    public void testA(){
        System.out.println("Test A order");
    }


    @Test
    public void testB(){
        System.out.println("Test B order");
    }



    @After
    public void after(){
        System.out.println("After Test");
    }



    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

}
