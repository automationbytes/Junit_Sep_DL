package Junit4Examples;

import org.junit.Test;

public class TestTimeout {


    @Test(timeout = 2000)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Hello");
    }

    @Test
    public void test1(){
        System.out.println("Hello World");
    }
}
