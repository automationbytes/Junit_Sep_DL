package Junit4Examples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class TestRuleTimeout {

    @Rule
    public Timeout globalTimout = new Timeout(5000);

    @Test
    public void testWhile(){
        while (true){
            System.out.println("Hello");
        }
    }
}
