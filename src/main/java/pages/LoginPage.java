package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPage {
    private WebDriver driver;

    // Locators for login page
    private By userIdField = By.id("userId"); // Replace with actual ID
    private By passwordField = By.id("password"); // Replace with actual ID
    private By loginButton = By.id("loginButton"); // Replace with actual ID
    private By singIn = By.xpath("//*[@id=\"root\"]/div[1]/header/div/div[4]/a[2]");
    private By emailId = By.xpath("//*[@id=\"identifierId\"]");
    private By next = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");

    public LoginPage() {
        this.driver = DriverFactory.getDriver(); // Get the shared WebDriver instance
    }

    public void login(String userId, String password) {
        driver.findElement(singIn).click();
        driver.findElement(emailId).sendKeys(userId);
        driver.findElement(next).click();
      //  driver.findElement(passwordField).sendKeys(password);
      //  driver.findElement(loginButton).click();
    }
}