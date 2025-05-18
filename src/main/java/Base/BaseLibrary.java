package Base;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BaseLibrary extends Data{


public static WebDriver webDriver;
public String getCurrentUrl(){

    return webDriver.getCurrentUrl();
}
public void assertEqualsText(String actualMessage,String expectedMessage) {

    Assert.assertEquals(actualMessage, expectedMessage);
}
}
