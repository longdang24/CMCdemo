package lesson7.lesson7_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {
    private WebDriver driver;

    //locator
    private By inventoryList = By.className("page_wrapper");
    private By addToCart = By.id("add-to-cart-sauce-labs-backpack");


    //contructor
    public productPage (WebDriver driver){
        this.driver = driver;
    }

    public boolean inventoryListDisplay (){
        return driver.findElement(inventoryList).isDisplayed();
    }
}
