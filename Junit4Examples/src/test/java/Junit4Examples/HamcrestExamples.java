package Junit4Examples;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExamples {

    @Test
    public void testObj(){
        String a = "hello";
        String b = new String( "el");
        assertThat(a,containsString(b));
    }


    @Test
    public void testCollectionSize(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        assertThat(list,Matchers.<String>hasSize(3));
        assertThat(list,Matchers.<String>hasItem("10"));

    }


    @Test
    public void testNumbers(){
        int num = 10;
        assertThat(num,greaterThan(100));
        assertThat(num,lessThan(100));

    }



//    @Test
//    public void testArrayEquality(){
//        int[] arr1 = {1,4,5};
//        int[] arr2 = {1,5,4};
//        //assertArrayEquals(arr1,arr2);
//        assertThat(arr1,arrayContainingInAnyOrder(arr2));
//      //  assertThat(new String[]{"foo", "bar"}, arrayContainingInAnyOrder(Arrays.asList(equalTo("bar"), equalTo("foo"))))
//
//    }

}
