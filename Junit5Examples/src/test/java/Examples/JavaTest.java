package Examples;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JavaTest {

    @Test
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_17})
    void onJava8r17(){
        System.out.println("Runs only on java 8 or 17");
    }


    @Test
    @EnabledOnJre({JRE.JAVA_8})
    void onJava8(){
        System.out.println("Runs only on java 8");
    }
}
