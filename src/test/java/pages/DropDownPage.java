package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage {
    @FindBy(className="mega-dropdown")
    WebElement geekCourses;
    WebDriver driver;
    public  DropDownPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void getDropDownOptions(WebDriver driver){
       // Select select = new Select(driver.findElement(By.className("mega-dropdown")));

        List<WebElement> options;
                geekCourses.click();
       // System.out.println("The options are"+options);
    }
}
