package testClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectClassEXample {

@Test
    public void selectElement() throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        driver.get("https://bstackdemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       List<WebElement>  links = driver.findElements(By.id("a"));

       for(WebElement link:links){
           String url = link.getAttribute("href");
           verifyLink(url);
           Thread.sleep(500);
       }

    /*    Select sel = new Select(driver.findElement(By.id("")));

        sel.selectByValue("India");
        sel.selectByIndex(9);
        sel.selectByVisibleText("India");
*/
   driver.quit();
    }

    private void verifyLink(String url) throws IOException {
        URL link = new URL("https://google.com");
        HttpURLConnection connection = (HttpURLConnection) link.openConnection();
        connection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
        connection.connect();

        if (connection.getResponseCode() == 200) {
            System.out.println(url + "https://google.com " + connection.getResponseMessage());
        } else {
            System.out.println(url + " - " + connection.getResponseMessage() + " - " + "is a broken link");
        }
    }
}
