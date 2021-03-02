package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageHelper extends PageBase {
    public LoginPageHelper(WebDriver driver) {
        super(driver);
    }

    public void fillInLoginForm(String loginInput) {
        driver.findElement(By.cssSelector("#username")).sendKeys(loginInput);
    }

    public void fillInPasswordForm(String passwordInput) {
        driver.findElement(By.cssSelector("#password")).sendKeys(passwordInput);
    }

    public void clickOnSubmitButton() {
        driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
    }

    public void tapOnRememberMeButton() {
        driver.findElement(By.xpath("//label[contains(text(),'Запомнить меня')]"));
    }
}
