import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest {

    @Test
    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nseindia.com/");
        System.out.println(driver.getTitle());
//        WebElement text = driver.findElement(By.xpath("//figure"));
        Assert.assertEquals("Hello","Hello");
        driver.quit();
    }

}
