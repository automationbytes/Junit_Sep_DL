package Junit4Examples;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({SanityTest.class})
@Suite.SuiteClasses({TestCategories.class,TestOrder.class})


public class TestCategoryRunner {
}
