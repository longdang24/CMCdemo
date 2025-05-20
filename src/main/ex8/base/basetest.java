package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        this.driver = new ChromeDriver();
        this.driver.get("https://www.saucedemo.com/");
        this.driver.manage().window().maximize();
    }

    @AfterMethod
    public void endSet() {
        if (this.driver != null) {
            this.driver.quit();
        }

    }
}
