package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BaseTest {

    public  RegisterPage fillName(String text){
         webDriver.findElement(By.name("Name")).sendKeys(text);
        return this;
}

    public  RegisterPage fillEmail(String text){
        webDriver.findElement(By.name("Email")).sendKeys(Email);
        return this;
    }

    public  RegisterPage fillPassword(String text){
        webDriver.findElement(By.name("Password")).sendKeys(Password);
        return this;
    }

    public RegisterPage clickRegister() {
        webDriver.findElement(By.xpath("//button[contains(text(),'Üye Ol')]"));
        return this;
    }


}
