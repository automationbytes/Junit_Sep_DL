package Junit4Examples;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Assertion_Eg {



    @Test
    public void asserttrue(){
        assertTrue("To perform assert true", 1 == 1);
        assertTrue(1 == 1);
    }

    @Test
    public void assertequals(){
        assertEquals(1,1);
    }


    @Test
    public void assertfalse(){
        assertFalse(1 == 2);
    }


    @Test
    public void assertnotequals(){
        assertNotEquals(1,1);
    }

    @Test
    public void textIsNull(){
        String text = null;
        assertNull(text);
    }

    @Test
    public void textIsNotNull(){
        String text = "Hello";
        assertNotNull(text);
    }

    @Test
    public void testObj(){
        String a = "Hello"; //string pool memory
        String b = new String( "hello"); //heap memory
        String c = new String( "Hello"); //heap memory
        assertEquals(a,b); //equals
       // assertSame(c,b); // ==
    }


    @Test
    public void testArrayEquality(){
        int[] arr1 = {1,4,5};
        int[] arr2 = {1,5,4};
        assertArrayEquals(arr1,arr2);
    }

}
