package testClass;

import common.BaseInitClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.StackOverMainPage;

public class stackOverFlowPageDuplciate extends BaseInitClass {

    WebDriver driver;
    StackOverMainPage obj;
    @BeforeClass
    public void setup(){
        driver = BaseInitClass.launchApplication();
        obj = new StackOverMainPage(driver);
    }


   @Test
    public void stackOverFlowPage1() {


     obj.sendEmail();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
