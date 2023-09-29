package Examples;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvConditional {

    @Test
    @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS",matches = "6")
    void numofprocessors(){
        System.out.println("Runs only on 6");
    }


}
