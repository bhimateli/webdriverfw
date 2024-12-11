package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class BrowserWindows {
    @FindBy(id="windowButton")
    WebElement windowElement;
    @FindBy(id="messageWindowButton")
    WebElement messageWindow;

    @FindBy(id="sampleHeading")
    WebElement sampleHeading;
    WebDriver driver;
    public  BrowserWindows(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void windowHandles(WebDriver driver) throws InterruptedException {

        windowElement.click();
        System.out.println(messageWindow.isEnabled());
        //if(messageWindow.isEnabled())
        Thread.sleep(10000);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(messageWindow)).click();
        String mainWindow = driver.getWindowHandle();

        System.out.println("Main Window ->"+mainWindow);

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Child window handle is" + allWindowHandles);

        Iterator<String> i1 = allWindowHandles.iterator();

       while(i1.hasNext()){

            String childWindow = i1.next();
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                 driver.close();
                System.out.println("Child window closed ->");
            }
       }

    }

}
