import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {

    @Test(description = "Başarılı kullanıcı kaydı")
    public void RegisterSuccessful(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.sosyopix.com/uye-ol");


        webDriver.findElement(By.name("Name")).sendKeys("Beyza Karadag");
        webDriver.findElement(By.name("Email")).sendKeys("sansar3salvo@hotmail.com");
        webDriver.findElement(By.name("Password")).sendKeys("Beyz.14.");

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
