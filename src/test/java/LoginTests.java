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


    @Test(description = "Başarılı kullanıcı girişi")
    public void LoginSuccessful(){

        loginPage.fillEmail(Email)
                .fillPassword(Password)
                .clickLogin();
//Assert.assertEquals(getCurrentUrl(), "https://www.sosyopix.com/giris");
        System.out.println(webDriver.getCurrentUrl());
assertEqualsText(getCurrentUrl(),overViewUrl);
    }
    @Test(description = "Başarısız kullanıcı girişi")
    public void LoginUnSuccessful(){



//        webDriver.findElement(By.name("Email")).sendKeys("sansar3salvo@hotmail.com");
//        webDriver.findElement(By.name("Password")).sendKeys("Beyz.14.9");
//
//        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(),'Giriş Yap')]"));
//        loginButton.click();

        loginPage.fillEmail(Email)
                .fillPassword("v")
                .clickLogin();

        String actualMessage = loginPage.getErrorMessage();
        System.out.println("Text Found: " + actualMessage);

        String expectedMessage = "Şifren veya e-mail adresin hatalı! Tekrar kontrol edebilir misin?";
            assertEqualsText(actualMessage, expectedMessage);
//Şifren veya e-mail adresin hatalı! Tekrar kontrol edebilir misin?
    }

//    @Test(description = "Zorunlu karakter kontrolü")
//    public void LoginRequiredController(){
//        loginPage.fillEmail(Email).clickLogin();
//        String actualMessage = loginPage.getErrorMessage();
//        assertEqualsText(actualMessage, ErrorRequiredMessage);
//    }

}
