package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionClass {
    @FindBy(linkText="Home")
    WebElement home;
    @FindBy(xpath = "//html/body/div"
            + "/table/tbody/tr/td"
            + "/table/tbody/tr/td"
            + "/table/tbody/tr/td"
            + "/table/tbody/tr")
    WebElement tdHome;

    WebDriver driver;
    public ActionClass(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

public void mouseHoveranddisplayBgColor(WebDriver driver){

    Actions act = new Actions(driver) ;

    Action mouseOverHome = act
            .moveToElement(home)
            .build();

    String bgColor = tdHome.getCssValue("background-color");
    System.out.println("Before hover: " + bgColor);
    mouseOverHome.perform();
    bgColor = tdHome.getCssValue("background-color");
    System.out.println("After hover: " + bgColor);

}

}
