package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BaseTest {

    @Step("İsim soyisim alanı doldurulur")
    public  RegisterPage fillName(String text){
         webDriver.findElement(By.name("Name")).sendKeys(text);
        return this;
}

    @Step("Email alanı doldurulur")
    public  RegisterPage fillEmail(String text){
        webDriver.findElement(By.name("Email")).sendKeys(Email);
        return this;
    }

    @Step("Password alanı doldurulur")
    public  RegisterPage fillPassword(String text){
        webDriver.findElement(By.name("Password")).sendKeys(Password);
        return this;
    }

    @Step("Üye ol butonuna tıklanır")
    public RegisterPage clickRegister() {
        webDriver.findElement(By.xpath("//button[contains(text(),'Üye Ol')]"));
        screenshot();
        return this;
    }


}
