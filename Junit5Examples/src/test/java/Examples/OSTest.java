package Examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OSTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void onWindows(){
        System.out.println("Runs only on windows");
    }


    @Test
    @Disabled
    void on_Windows(){
        System.out.println("Runs only on windows");
    }

}
