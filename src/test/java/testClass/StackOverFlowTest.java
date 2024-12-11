package testClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import common.BaseInitClass;
import common.Configurations;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.StackOverMainPage;



public class StackOverFlowTest extends BaseInitClass {

    WebDriver driver;
    StackOverMainPage obj;

    @BeforeClass
    public void setup(){
        driver = BaseInitClass.launchApplication();
        obj = new StackOverMainPage(driver);
    }
  /*  @Test
    public void stackOverFlowPage() {


       // obj.clickOnCookies();


    }*/

    @Test
    public void stackOverFlowPage1() throws InterruptedException {
    obj.clickOnLogin();
    obj.sendEmail();
    Thread.sleep(4000);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
