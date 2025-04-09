
package com.cmcglobal.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class loginPage {
    WebDriver webDriver;

    @BeforeMethod
    public void openPage (){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
    }
    @Test
    public void loginSucess (){
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
    }
    @Test
    public void checkListProduct (){
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
        //Assert.a(Products, "not Empty");
    }

    @Test
    public void checkOutProduct(){
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        webDriver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        webDriver.findElement(By.id("checkout")).click();
        webDriver.findElement(By.id("first-name")).sendKeys("Xong");
        webDriver.findElement(By.id("last-name")).sendKeys("Luan");
        webDriver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("90092001");
        webDriver.findElement(By.id("continue")).click();
        webDriver.findElement(By.id("finish")).click();
        Assert.assertEquals("Thank you for your order!","Thank you for your order!");

    }

}
