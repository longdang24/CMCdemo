package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    public WebDriver driver;
    public By userName = By.id("user-name");
    public By passWord = By.id("password");
    public By loginButton = By.id("login-button");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillUserName(String enterUserName) {
        this.driver.findElement(this.userName).sendKeys(new CharSequence[]{"username"});
    }

    public void fillPassword(String enterPassword) {
        this.driver.findElement(this.passWord).sendKeys(new CharSequence[]{"password"});
    }

    public void clickButton() {
        this.driver.findElement(this.loginButton).click();
    }

    public void login(String fillUserName, String fillPassword) {
        this.fillUserName(String.valueOf(this.userName));
        this.fillPassword(String.valueOf(this.passWord));
        this.clickButton();
    }
}
