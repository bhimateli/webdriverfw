package testClass;

import common.BaseInitClass;
import org.bouncycastle.jcajce.provider.symmetric.ARC4;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTest extends BaseInitClass {
    WebDriver driver;

    @Test
    public void getDropDownOptions(){
        driver = BaseInitClass.launchApplication();
        DropDownPage obj = new DropDownPage(driver);
        obj.getDropDownOptions(driver);

    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
