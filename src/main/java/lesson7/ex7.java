package lesson7;

import com.beust.ah.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ex7 {
    WebDriver driver;


    @Test
    public void testCheckboxDisappearance() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox"));
        WebElement removeButton = driver.findElement(By.cssSelector("#btn"));

        removeButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        Assert.assertFalse(driver.findElements(By.cssSelector("#checkbox")).size() > 0, "Checkbox vẫn tồn tại!");
        driver.quit();
    }
    @Test
    public void testEnableInputField() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement inputField = driver.findElement(By.cssSelector("#input-example > input"));
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example > button"));


        enableButton.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(inputField));

        Assert.assertTrue(inputField.isEnabled(), "Input field không được kích hoạt!");
        driver.quit();
    }

    @Test
    public void testDynamicLoading() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.cssSelector("#start button"));
        startButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish")));

        Assert.assertTrue(message.getText().contains("Hello World!"), "Nội dung không xuất hiện đúng!");
        driver.quit();
    }
    @Test
    public void testLoadingTime() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start button"));
        long startTime = System.currentTimeMillis();

        startButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish")));

        long endTime = System.currentTimeMillis();
        Assert.assertTrue((endTime - startTime) <= 10000, "Thời gian tải vượt quá giới hạn!");
        driver.quit();
    }
    @Test
    public void testDropdownOptions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Option 1");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 1");

        select.selectByVisibleText("Option 2");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 2");
        driver.quit();
    }
    @Test
    public void testDefaultDropdownOption() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Please select an option", "Tùy chọn mặc định không chính xác!");
        driver.quit();
    }
    @Test
    public void testMenuVisibility() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");

        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        Assert.assertTrue(menuItems.size() == 5, "Một số mục menu đã biến mất!");
        driver.quit();
    }
    @Test
    public void testAlertDisplay() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert", "Nội dung cảnh báo không đúng!");
        alert.accept();
        driver.quit();

    }
    @Test
    public void testConfirmAlertHandling() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirmButton = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        confirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertTrue(result.getText().contains("Cancel"), "Hệ thống không xử lý đúng khi Cancel!");
        driver.quit();

    }

    @Test
    public void testAddElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addButton.click();

        List<WebElement> addedElements = driver.findElements(By.cssSelector(".added-manually"));
        Assert.assertTrue(addedElements.size() > 0, "Không có phần tử nào được thêm!");
        driver.quit();
    }
    @Test
    public void testRemoveElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addButton.click();

        WebElement deleteButton = driver.findElement(By.cssSelector(".added-manually"));
        deleteButton.click();

        List<WebElement> addedElements = driver.findElements(By.cssSelector(".added-manually"));
        Assert.assertTrue(addedElements.size() == 0, "Phần tử chưa bị xóa!");
        driver.quit();
    }
}
