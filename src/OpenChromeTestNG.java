import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

/**
 * Created by Prasanna on 21/05/2017.
 */
public class OpenChromeTestNG {
    static String chromepath ="D:/Work/Setups/";
    public static WebDriver driver;
    @BeforeClass
    public static void SetUp(){
        System.out.println("************************************************************************************");
        System.out.println("Launching chrmoe browser");
        System.setProperty("webdriver.chrome.driver",chromepath+"chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testgoogletitleinchrome() throws InterruptedException {
        driver.navigate().to("http://youtube.com");
        String pgTitle = driver.getTitle();
        Assert.assertTrue("Page Title Doesn't match", pgTitle.equalsIgnoreCase("YouTube"));
        WebElement searchTxt = driver.findElement(By.cssSelector("#masthead-search-term"));
        searchTxt.sendKeys("thunder imagine dragons");
        WebElement searchbtn = driver.findElement(By.id("search-btn"));
        searchbtn.click();
        sleep(5000);

        //WebElement link = driver.findElement(By.partialLinkText("AJR - Weak (OFFICIAL MUSIC VIDEO)"));
        WebElement link = driver.findElement(By.cssSelector("[title = 'Imagine Dragons - Thunder']"));
        link.click();
        sleep(99999);
    }
    @AfterClass
    public static void tearDown(){
        if (driver!=null){
            System.out.println("Closing Chrome Browser");
            driver.quit();
        }
    }
}
