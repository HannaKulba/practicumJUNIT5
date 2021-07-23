package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Before {
    protected WebDriver driver = Driver.getChromeDriver();

    @BeforeAll
    public void setUp() {
        driver.get("https://oz.by/");

        String currentURL = driver.getCurrentUrl();
        Assertions.assertEquals("https://oz.by/", currentURL, "Открыта страница не OZ.BY или указан некорректный URL");

    }

    @AfterAll
    public void tearDown() {

        driver.quit();

    }
}
