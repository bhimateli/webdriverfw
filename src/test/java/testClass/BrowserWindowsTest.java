package testClass;

import common.BaseInitClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.BrowserWindows;

public class BrowserWindowsTest extends BaseInitClass {

   WebDriver driver;


   @Test
    public void browserWindowsTest() throws InterruptedException {

      driver = BaseInitClass.launchApplication();
      BrowserWindows obj = new BrowserWindows(driver);
       obj.windowHandles(driver);
   }

   @AfterTest
   public void tearDown(){
      driver.quit();
   }
}
