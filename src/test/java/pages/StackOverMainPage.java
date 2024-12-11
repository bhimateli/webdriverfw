package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StackOverMainPage {
    @FindBy(xpath = "/html/body/header/div/nav/ol/li[4]/a")
    WebElement searchContent;

    @FindBy(xpath="/html/body/div[4]/div[1]/button[1]")
            WebElement cookies;
  @FindBy(xpath = "/html/body/header/div/nav/ol/li[3]/a")
          WebElement clickOnLogin;

  @FindBy(id="email")
          WebElement email;
  @FindBy(id="password")
          WebElement password;

    WebDriver driver;

    public StackOverMainPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    public void clickOnCommunity(){

        searchContent.click();
    }
    public void    clickOnCookies(){

        cookies.click();
    }

    public void clickOnLogin(){
        clickOnLogin.click();
    }

    public void sendEmail(){
        email.sendKeys("bteli.selenium");
    }
    public void sendPassword(){
        password.sendKeys("testmail");
    }
}
