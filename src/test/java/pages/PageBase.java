package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(WebElement element) {
        return element.isDisplayed();
    }
}
