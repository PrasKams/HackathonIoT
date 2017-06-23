import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Prasanna on 21/05/2017.
 */
public class OpenIETestNG {
    static String iePath = "D:/Work/Setups/";
    public static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.out.println("******************************************************************************");
        System.out.println("Launching IE browser");
        System.setProperty("webdriver.ie.driver", iePath+"IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testgoogleinIEBrowser(){
        driver.navigate().to("http://google.co.uk");
        String strTitle = driver.getTitle();
        System.out.println("Title" + strTitle);
        Assert.assertTrue("Page title doesn;t match", strTitle.equalsIgnoreCase("Google"));

    }

    @AfterClass
    public static void tearDown(){
        if (driver!=null){
            System.out.println("Closing Ie Browser");
            driver.quit();
        }
    }
}
