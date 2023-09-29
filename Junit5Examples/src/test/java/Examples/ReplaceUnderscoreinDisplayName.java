package Examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ReplaceUnderscoreinDisplayName {

    @Test
    void test_case_z() {
        System.out.println("text z");
    }

    @Test
    void test_case_d() {
        System.out.println("text d");
    }

}
