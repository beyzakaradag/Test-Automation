import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTests.class);
    LoginPage  loginPage = new LoginPage();

    @Test(description = "Başarılı kullanıcı girişi")
    public void LoginSuccessful(){

        loginPage.fillEmail("testUser")
                .fillPassword("test")
                .clickLogin();

        System.out.println(webDriver.getCurrentUrl());

    }
    @Test(description = "Başarısız kullanıcı girişi")
    public void LoginUnSuccessful(){

        webDriver.findElement(By.name("Email")).sendKeys("sansar3salvo@hotmail.com");
        webDriver.findElement(By.name("Password")).sendKeys("Beyz.14.9");

        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(),'Giriş Yap')]"));
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement errorSpan = wait.until(driver -> {
            WebElement el = driver.findElement(By.cssSelector(".text-danger.field-validation-valid"));
            String text = el.getText().trim();
            return !text.isEmpty() ? el : null;
        });

        String actualMessage = errorSpan.getText().trim();
        System.out.println("Text Found: " + actualMessage);

        String expectedMessage = "Şifren veya e-mail adresin hatalı! Tekrar kontrol edebilir misin?";
        Assert.assertEquals(actualMessage, expectedMessage);
//Şifren veya e-mail adresin hatalı! Tekrar kontrol edebilir misin?
    }
}
