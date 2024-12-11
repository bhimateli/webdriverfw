package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver.set(new ChromeDriver());
        }
        return driver.get();

    }

    public static void closeDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Remove the driver from the ThreadLocal variable
        }
    }
}