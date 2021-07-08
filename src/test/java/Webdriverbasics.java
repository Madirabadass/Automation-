import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Webdriverbasics {
    WebDriver driver;

    @BeforeTest
    public void setupdriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.betway.co.za");
       //JavascriptExecutor js = (JavascriptExecutor)driver;

    }
    @AfterTest
    public void closetest(){

        driver.close();
        driver.quit();

    }
}
