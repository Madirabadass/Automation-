import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Testsauclabs {


WebDriver driver;


    @Test
    public  void f() throws MalformedURLException {

        String username = "oauth-sarielsm-faf1b";
        String sauceAccessKey = "04b5c537-de89-4008-a705-8842751b20d6";


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", username);
        capabilities.setCapability("accessKey", sauceAccessKey);
        capabilities.setCapability("browserName", "Safari");
        capabilities.setCapability("platform", "macOS 10.13");
        capabilities.setCapability("version", "11.1");


        driver = new RemoteWebDriver(new URL("https://oauth-sarielsm-faf1b:04b5c537-de89-4008-a705-8842751b20d6@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.resetApp();

        driver.get("https://www.betway.co.za/");
        System.out.println("title of page is: " + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"toast-4fed9b82-e84c-4fa9-8d63-c539be37fb04\"]/div/div/div/div[2]/div/div[2]/a")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("menuMobileNumber")).click();
        driver.findElement(By.id("menuMobileNumber")).sendKeys("0763275672");
        driver.findElement(By.id("menuPassword")).sendKeys("casino13");
        driver.findElement(By.id("mobileLoginBtn")).click();


    }
        //driver = new RemoteWebDriver(new URL("https://OsirisQA:22dee050-d643-47e7-b5ce-859d0452a1d9@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);

    //driver = new IOSDriver<MobileElement>(new URL("https://OsirisQA:22dee050-d643-47e7-b5ce-859d0452a1d9@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);

/*
    @Test
     public void l(){

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //driver.resetApp();

            driver.get("https://www.betway.co.za/");
            System.out.println("title of page is: " + driver.getTitle());
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"toast-4fed9b82-e84c-4fa9-8d63-c539be37fb04\"]/div/div/div/div[2]/div/div[2]/a")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.id("menuMobileNumber")).click();
            driver.findElement(By.id("menuMobileNumber")).sendKeys("0763275672");
            driver.findElement(By.id("menuPassword")).sendKeys("casino13");
            driver.findElement(By.id("mobileLoginBtn")).click();


        }
        @After
        public void loginios()
        {
            driver.close();
            driver.quit();

        }
          /*
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        //capabilities.setCapability(MobileCapabilityType.APP, "[PATH_TO_YOUR_.APP_FILE_THAT_YOU_COMPILED]");
        // capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability("useNewWDA", false);
       // NetworkInterface testInfo;
        //capabilities.setCapability("name", testInfo.getDisplayName());

        */
}
