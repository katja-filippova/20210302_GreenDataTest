package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPageHelper;

public class LoginPageInterfaceTests extends TestBase {

    LoginPageHelper loginPageHelper;

    @BeforeMethod
    public void initTest() {
        loginPageHelper = PageFactory.initElements(driver, LoginPageHelper.class);
    }

    @Test
    public void isLogoFieldExist() {
        loginPageHelper.isElementPresent(driver.findElement(By.className("login-logo")));
    }

    @Test
    public void isCorporationNameExist() {
        loginPageHelper.isElementPresent(driver.findElement(By.className("login_corp")));
    }

    @Test
    public void isRememberButtonExist() {
        loginPageHelper.isElementPresent(driver.findElement(By.xpath("//label[contains(text(),'Запомнить меня')]")));
    }

    @Test
    public void isSubmitButtonExist() {
        loginPageHelper.isElementPresent(driver.findElement(By.id("login_button")));
    }

    @Test
    public void isSubmitButtonWithOtherNameExist() {
        loginPageHelper.isElementPresent(driver.findElement(By.id("login_button_domain")));
    }

    @Test
    public void isSubmitButtonWithCurrentNameExist() {
        loginPageHelper.isElementPresent(driver.findElement(By.id("login_button_current")));
    }
}
