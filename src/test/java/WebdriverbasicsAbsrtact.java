import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class WebdriverbasicsAbsrtact extends Webdriverbasics {


    @Test
    public void F(){

        String title = driver.getTitle();
        System.out.println(title);
        WebElement getid = driver.findElement(By.xpath("//*[@id=\"toast-4fed9b82-e84c-4fa9-8d63-c539be37fb04\"]/div/div/div/div[2]/div/div[2]/a"));
        System.out.println(getid.getAttribute("class")+getid);
        System.out.println(getid.getTagName());
        //System.out.println(getid);
    }

}
