package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebElement;

import java.util.List;

import static locators.MainPageLocators.CATEGORY_DISCOUNT;
import static locators.MainPageLocators.DISCOUNT;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestOzBy2 extends Before {

    @Test
    public void test1() {

        driver.findElement(DISCOUNT).click();

        List<WebElement> elements = driver.findElements(CATEGORY_DISCOUNT);
        String elementTitle = elements.get(4).getText();
        Assertions.assertTrue("Техника до −25%".contains(elementTitle));

    }

//    @Test
//    public void test2() {
//
//    }
//
//
//    @Test
//    public void test3() {
//
//    }


}
