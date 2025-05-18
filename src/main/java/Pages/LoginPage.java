package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest {

    public LoginPage fillEmail(String Email) {
        webDriver.findElement(By.name("Email")).sendKeys(Email);
        return this;
    }
    public LoginPage fillPassword(String Password) {
        webDriver.findElement(By.name("Password")).sendKeys(Password);
        return this;
    }
    public LoginPage clickLogin() {
        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(),'Giriş Yap')]"));
        loginButton.click();        return this;
    }


}

