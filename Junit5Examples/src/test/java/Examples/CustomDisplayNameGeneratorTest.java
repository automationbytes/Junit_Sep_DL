package Examples;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import  java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

@DisplayNameGeneration(CustomDisplayNameGeneratorTest.CustomDisplayNameGenerator.class)
public class CustomDisplayNameGeneratorTest {

    @Test
    void test_case_z() {
        System.out.println("text z");
    }

    @Test
    void test_case_d() {
        System.out.println("text d");
    }




    static class CustomDisplayNameGenerator extends DisplayNameGenerator.Standard{

//        @Override
//        public String generateDisplayNameForMethod(Method testMethod,  Class<?> testClass){
//            String name = testMethod.getName();
//            return Arrays.stream(name.split("_")).collect(Collectors.joining("***"));
//        }

        @Override
        public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
//            return (testMethod.getName()) +
//                    DisplayNameGenerator.parameterTypesAsString(testMethod);
            String name = testMethod.getName();
           // return Arrays.stream(name.split("_")).collect(Collectors.joining("***"));
            return testMethod.getName().toLowerCase();
//            return Arrays.stream(name.split("_")).collect(Collectors.joining("***"));
        }
    }
    
}
