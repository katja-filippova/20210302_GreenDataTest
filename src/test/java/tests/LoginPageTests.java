package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPageHelper;

public class LoginPageTests extends TestBase {

    LoginPageHelper loginPageHelper;

    @BeforeMethod
    public void initTest() {
        loginPageHelper = PageFactory.initElements(driver, LoginPageHelper.class);
    }

    @Test
    public void testLogin() {
        loginPageHelper.fillInLoginForm("tester");
        loginPageHelper.fillInPasswordForm("K35G3U");
        loginPageHelper.clickOnSubmitButton();
        Assert.assertTrue(loginPageHelper.isElementPresent(driver.findElement(By.id("userName"))));
    }

    @Test
    public void testLoginWithRememberMeButton() {
        loginPageHelper.fillInLoginForm("tester");
        loginPageHelper.fillInPasswordForm("K35G3U");
        loginPageHelper.tapOnRememberMeButton();
        loginPageHelper.clickOnSubmitButton();
        Assert.assertTrue(loginPageHelper.isElementPresent(driver.findElement(By.id("userName"))));
    }

    @Test
    public void negativeTestLoginWithEmptyLoginForm() throws InterruptedException {
        loginPageHelper.fillInLoginForm("");
        loginPageHelper.fillInPasswordForm("K35G3U");
        loginPageHelper.clickOnSubmitButton();
        Thread.sleep(500);
        Assert.assertTrue(loginPageHelper.isElementPresent(driver.findElement(By.id("login_button"))));
    }

    @Test
    public void negativeTestLoginWithEmptyPasswordForm() throws InterruptedException {
        loginPageHelper.fillInLoginForm("tester");
        loginPageHelper.fillInPasswordForm("");
        loginPageHelper.clickOnSubmitButton();
        Thread.sleep(500);
        Assert.assertTrue(loginPageHelper.isElementPresent(driver.findElement(By.id("login_button"))));
    }
}
