package locators;

import org.openqa.selenium.By;

public class MainPageLocators {

    public static final By SEARCH_FIELD = By.id("top-s");
    public static final By SEARCH_BUTTON = By.className("search-tools");
    public static final By BOOKS = By.cssSelector(".item-type-card__content .item-type-card__link");

    public static final By DISCOUNT = By.xpath("//*[contains(text(), 'Акции и скидки')]");
    public static final By CATEGORY_DISCOUNT = By.cssSelector(".landing-nav-list__item");

}
