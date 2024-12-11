package common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import util.DriverFactory;

public class SeleniumBase {
    @BeforeClass
    public void setUp() {
        // Open Gmail login page and log in once for all tests in the thread
        DriverFactory.getDriver().get("https://mail.google.com");

        LoginPage loginPage = new LoginPage();
        loginPage.login("bteli.selenium@gmail.com", "99999"); // Replace with actual credentials
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver after the test class has finished
        DriverFactory.closeDriver();
    }
}