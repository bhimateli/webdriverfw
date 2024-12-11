package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;

public class ActionPage {

    /*
    create driver object and try to use action class to intitiate objects
     */

    WebDriver driver;

    @Test
    public void acitonMethod(){
        driver = new ChromeDriver();

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(""))).moveToElement(driver.findElement(By.id(""))).perform();
        act.dragAndDrop(driver.findElement(By.id("")), driver.findElement(By.id("")) ).build();
        // double click
        act.doubleClick(driver.findElement(By.id(""))).perform();
        WebElement element = driver.findElement(By.id(""));


    }

    @Test
    public void selectExample(){

        Select select = new Select(driver.findElement(By.id("")));
        select.selectByVisibleText("Test");
        select.selectByIndex(2);
        select.selectByValue("Bhima");
    }

    @Test
    public void handleWindows(){

        driver.findElement(By.id("")).click();
        String originalWindow = driver.getWindowHandle();
       Set<String> windows = driver.getWindowHandles();
        for(String windoHandle: windows){
            driver.switchTo().window(windoHandle);
            System.out.println("Switched to new window: " + driver.getTitle());

            // Perform actions in the new window
            WebElement element = driver.findElement(By.id("someElementInNewWindow"));
            element.click();

            // Close the new window
            driver.close();
        }
    driver.switchTo().window(originalWindow);
    }

}
