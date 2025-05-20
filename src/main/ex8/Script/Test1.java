package  Script;

import org.testng.Assert;
import org.testng.annotations.Test;
import

public class loginTest extends basetests {

    public loginTest() {
    }

    @Test
    public void loginPageSuccess() {
        loginPage loginPage = new loginPage(this.driver);
        loginPage.login("standard_user", "secret_sauce");
        String curentURL = this.driver.getCurrentUrl();
        Assert.assertTrue(curentURL.contains("https://www.saucedemo.com/inventory.html"), "not navigate");
    }
}
1