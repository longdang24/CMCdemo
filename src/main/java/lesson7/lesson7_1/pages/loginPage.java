package lesson7.lesson7_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;


    //locator
    private By userName = By.id("user-name");
    private By passWord = By.id("password");
    private By loginButton = By.id("login-button");


    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillUserName (String enterUserName){
        driver.findElement(userName).sendKeys("username");
    }
    public void fillPassword (String enterPassword){
        driver.findElement(passWord).sendKeys("password");
    }
    public void clickButton (){
        driver.findElement(loginButton).click();
    }


    public void login(String fillUserName, String fillPassword){
        fillUserName(String.valueOf(userName));
        fillPassword(String.valueOf(passWord));
        clickButton();
    }


}
