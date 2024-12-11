package testClass;

import common.BaseInitClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class SeleniumExample {
    WebDriver driver;

    @Test
    public void  actionClassExample(){
        driver = BaseInitClass.launchApplication();

        Actions act = new Actions(driver);
        WebElement element= driver.findElement(By.id(""));
        WebElement element2 = driver.findElement(By.id(""));
        act.moveToElement(element).contextClick().build().perform();
        act.dragAndDrop(element,element2).build().perform();
        act.doubleClick().build().perform();

}


}
