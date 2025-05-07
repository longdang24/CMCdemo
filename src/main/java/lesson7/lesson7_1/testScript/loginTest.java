package lesson7.lesson7_1.testScript;

import lesson7.lesson7_1.base.baseTest;
import lesson7.lesson7_1.pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class loginTest extends baseTest {

    @Test
    public void loginPageSuccess () {
        loginPage loginPage = new loginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        String curentURL = driver.getCurrentUrl();
        Assert.assertTrue(curentURL.contains("https://www.saucedemo.com/inventory.html"), "not navigate");
    }
}
