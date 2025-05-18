package Base;

import Pages.LoginPage;
import Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{

    public static RegisterPage registerPage = new RegisterPage();
    public static LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void openBrowser(){
         webDriver = new ChromeDriver();
        webDriver.get("https://www.sosyopix.com/giris");
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void CloseBrowser(){
        webDriver.quit();


    }
}
