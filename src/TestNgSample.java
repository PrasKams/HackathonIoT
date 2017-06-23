import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/**
 * Created by Prasanna on 31/05/2017.
 */
public class TestNgSample {
    @BeforeTest
    public void openDBConnection(){
        System.out.println("I will execute before any test executes as a pre req, like opening browser or retriving test set from source");

    }

    @AfterTest
    public void postReq(){
        System.out.println("I will execute after any tests executes for eg closing browser or quiting db connection");
    }

    @Test
    public void test01(){
        System.out.println("I am in first test case");

    }

    @Test
    public void test02(){
        System.out.println("i am in second test case");
    }

    @Test
    public void test03(){
        System.out.println("i am in third test case");
    }

    @BeforeMethod
    public void openBrowser(){
        System.out.println("i will be executed before each test method");
    }

    @AfterMethod
    public void closeBrowser(){
        System.out.println("i will be executed after each test method");
    }
}
