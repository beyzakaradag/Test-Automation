package Base;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BaseLibrary extends Data{


public static WebDriver webDriver;

@Step("url bilgisi alınır")
public String getCurrentUrl(){

    return webDriver.getCurrentUrl();
}
@Step("Metin karşılaştırılması sağlanır.")
public void assertEqualsText(String actualMessage,String expectedMessage) {

    Assert.assertEquals(actualMessage, expectedMessage);
    screenshot();
}
@Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot(){
    return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
}
}
