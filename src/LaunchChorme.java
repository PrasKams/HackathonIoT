import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

/**
 * Created by Prasanna on 18/05/2017.
 */
public class LaunchChorme {
    public static String driverPath = "D:/Work/Setups/";
    public static WebDriver driver;

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://google.co.uk");
        driver.quit();
    }

}
