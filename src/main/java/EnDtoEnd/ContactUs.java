package EnDtoEnd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.* ;  //implicitly

import java.time.Duration;



public class ContactUs {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        driver.get("http://automationpractice.com/index.php");

        String actualTitle = driver.getTitle();

        assertEquals(actualTitle,"My Store", "Title do ton match");





        ((JavascriptExecutor) driver).executeScript(("window.scrollTo(0, document.body.scrollHeight)"));




    }
}
class car{

}
