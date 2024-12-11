package testClass;

import common.BaseInitClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.ActionClass;

public class ActionTest extends BaseInitClass {
    WebDriver driver;

    @Test
    public void getTheBGColor() {
       driver= BaseInitClass.launchApplication();
        ActionClass actionObj = new ActionClass(driver);
        actionObj.mouseHoveranddisplayBgColor(driver);
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
