package sele100;

import common.BaseInitClass;
import common.Configurations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.*;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumExample extends BaseInitClass {

    WebDriver driver;
    Configurations configurationObj = Configurations.getInstance();
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();
         String basePath = configurationObj.getUrlBasePath();
         driver.get("https://google.com");

        driver.findElement(By.id("APjFqb")).sendKeys("Bhimashankar Teli");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id(""));
        WebElement target = driver.findElement(By.linkText(""));

        action.dragAndDrop(source, target);

        Select select = new Select(driver.findElement(By.partialLinkText("")));
        select.deselectAll();
        select.selectByIndex(1);
        select.selectByValue("Bhima");
        select.selectByVisibleText("Oracle");
        select.getOptions();
       boolean value = select.isMultiple();

       if(value){
           System.out.println("The value is TRUE");
       }



    }
    @Test
    public void getWinodwsHandles(){

      driver.switchTo().frame("");
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().to("");
      driver.navigate().forward();;
      driver.manage().timeouts().implicitlyWait(12, TimeUnit.MINUTES);

       String parent = driver.getWindowHandle();
       Set<String> setOfWindows = driver.getWindowHandles();

        for (String childWindow : setOfWindows) {
            if (!parent.equals(childWindow)) {
                driver.switchTo().window(childWindow);
                System.out.println(driver.switchTo().window(childWindow).getTitle());

            }
            driver.switchTo().window(parent);
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
