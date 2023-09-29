package Examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;

public class RepeatedTest {

    @BeforeAll
    static void beforeall(){
        System.out.println("Before all methd");
    }


    @BeforeEach
    void beforeEach(){
        System.out.println("Before each methd");
    }


    @org.junit.jupiter.api.RepeatedTest(3)
    void sampleTest(){
        System.out.println("Repeat");
    }


    @AfterAll
    static void Afterall(){
        System.out.println("After all methd");
    }


    @AfterEach
    void afterEach(){
        System.out.println("After each methd");
    }
}
