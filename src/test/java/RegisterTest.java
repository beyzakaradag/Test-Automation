import Base.BaseTest;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {



    @Test(description = "Başarılı kullanıcı kaydı")
    public void RegisterSuccessful(){

        webDriver.get("https://www.sosyopix.com/uye-ol");

        String Name = "Beyza Karadag";
        String Email = "testUser@gmail.com";
        String Password = "Beyz.14.";

//        loginPage.clickRegister();

        registerPage.fillName("text")
                .fillEmail("text")
                .fillPassword("text")
                .clickRegister();


//        webDriver.findElement(By.name("Name")).sendKeys(Name);
//        webDriver.findElement(By.name("Email")).sendKeys(Email);
//        webDriver.findElement(By.name("Password")).sendKeys(Password);



        WebElement kvkkLabel = webDriver.findElement(By.id("acceptKvkkLabel"));
        kvkkLabel.click();

        WebElement acceptLabel = webDriver.findElement(By.id("acceptLabel"));
        acceptLabel.click();

        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(),'Üye Ol')]"));
        loginButton.click();

        System.out.println(webDriver.getCurrentUrl());

        webDriver.quit();
    }
}
