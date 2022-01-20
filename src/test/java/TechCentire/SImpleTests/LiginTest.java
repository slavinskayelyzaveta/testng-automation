package TechCentire.SImpleTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LiginTest {
    private WebDriver driver;
    @BeforeMethod
    public void driverSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    @Test
    public void loginWithValidCredentials() {
        driver.get("http://automationpractice.com/index.php");
        WebElement singInLink = driver.findElement(By.partialLinkText("Sing in"));
    }
    @Test
    public void loginWithInvalidCredentials() {

    }
}
