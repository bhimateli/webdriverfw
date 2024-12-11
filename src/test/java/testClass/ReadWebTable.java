package testClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ReadWebTable {

    @Test
    public void readWebTable(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Finding number of Rows
        List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@id='content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a']/div/div/table[1]/tbody/tr[1]/td[1]"));
        int rowCount = rowsNumber.size();
        System.out.println("No of rows in this table : " + rowCount);

        //Finding number of Columns
        List<WebElement> colNumber = driver.findElements(By.xpath("//*[@id=\"content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a\"]/div/div/table[1]/thead/tr/th[1]"));
        int columnCount = colNumber.size();
        System.out.println("No of columns in this table : " + columnCount);




        driver.get("");

    }
}
