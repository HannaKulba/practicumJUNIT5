package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Log;

import static locators.MainPageLocators.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestOzBy {

    private WebDriver driver = Driver.getChromeDriver();

    @BeforeAll
    public void setUp() {

        Log.info("Открываем страницу OZ.BY");
        driver.get("https://oz.by/");

        Log.info("Проверяем, что открылась корректная страница OZ.BY");
        String pageTitle = driver.getTitle();
        Assertions.assertEquals("OZ.by — интернет-магазин. Книги, игры, косметика, " +
                        "товары для дома, творчества, подарки, продукты. Доставка по Беларуси.", pageTitle,
                "Открыта не OZ.BY или название страницы неверно");

    }

    @BeforeEach
    public void beforeEachTestMethod(){
        Log.info("Некоторый код выполяется перед каждым методом");
    }

    @Test
    @DisplayName("Тест, который проверяет, что первая книга по результатам поиска 'хюгге' называется 'Хюгге-дневник. Кошачья мудрость" +
            "\nМари Бретен, Анн-Соланж Тарди, 2018'")
    public void testFindingBook() {

        Log.info("Пишем в строку поиска 'хюгге'");
        driver.findElement(SEARCH_FIELD).sendKeys("хюгге");

        Log.info("Нажимаем на кнопку поиска");
        driver.findElement(SEARCH_BUTTON).click();

        Log.info("Находим первый элемент таблицы - первую книгу в поиске");
        WebElement book = driver.findElements(BOOKS).get(0);

        Log.info("Получаем название книги");
        String bookTitle = book.getText();

        Log.info("Проверяем, первая книга по результатам поиска 'хюгге' называется 'Хюгге-дневник. Кошачья мудрость'");
        Assertions.assertEquals("Хюгге-дневник. Кошачья мудрость\nМари Бретен, Анн-Соланж Тарди, 2018", bookTitle,
                "Книга называется иначе: " + bookTitle + "\nОжидаемый результат: 'Хюгге-дневник. Кошачья мудрость'");

    }

    @Test
    public void newTest(){

    }

    @Test
    public void new3Test(){

    }

    @AfterEach
    public void afterEachTestMethod(){
        Log.info("Некоторый код выполяется после каждого метода");
    }

    @AfterAll
    public void tearDown() {

        Log.info("Закрываем браузер");
        driver.quit();

    }
}
