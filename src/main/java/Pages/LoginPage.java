package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseTest {

    @Step("Email alanı doldurulur")
    public LoginPage fillEmail(String Email) {
        webDriver.findElement(By.name("Email")).sendKeys(Email);
        screenshot();
        return this;
    }

    @Step("Password alanı doldurulur")
    public LoginPage fillPassword(String Password) {
        webDriver.findElement(By.name("Password")).sendKeys(Password);
        return this;
    }

    @Step("Login butonuna tıklanılır")
    public LoginPage clickLogin() {
        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(),'Giriş Yap')]"));
        loginButton.click();        return this;
    }

    @Step("Hata mesajı alınır")
    public String getErrorMessage() {
    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    WebElement errorSpan = wait.until(driver -> {
        WebElement el = driver.findElement(By.cssSelector(".text-danger.field-validation-valid"));
        String text = el.getText().trim();
        return !text.isEmpty() ? el : null;
    });
   String actualMessage = errorSpan.getText().trim();
        return actualMessage;
}
    public LoginPage clickRegister() {
        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(),'Üye Ol')]"));
        loginButton.click();        return this;
    }

}

