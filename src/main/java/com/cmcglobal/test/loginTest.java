package com.cmcglobal.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest {
    WebDriver driver;

    @BeforeMethod
    public void navigatePage() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void testLoginSuccess() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login failed");
    }

    @Test
    public void testProductList() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //WebElement product = driver.findElement(By.className("inventory_item_name"));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}





