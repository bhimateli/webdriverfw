package common;


import lombok.Getter;
import lombok.Setter;
import org.databene.commons.FileUtil;
import org.databene.feed4testng.FeedTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseInitClass extends FeedTest {
    public Properties prop;
    public FileInputStream file;
    public static WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(BaseInitClass.class);
    static Configurations configObj =  Configurations.getInstance();
    static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    @BeforeSuite(alwaysRun = true)
    @Parameters({ "config_file" })
    public void setUpTest(@Optional("C:\\Automation\\selenium\\src\\test\\resources\\MainDriver.Properties") String configFile) throws Exception {
        System.out.println("Begin class is going to begin");
        if (configFile.isEmpty()) {
            configFile = "C:\\Automation\\selenium\\src\\test\\resources\\MainDriver.Properties";
        }
        Initializer.init(configFile);
    }


    public static WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    // Set up WebDriver
    public static void setDriver(WebDriver driver) {
        threadLocalDriver.set(driver);
    }
    public static void initializeDriver(String browser) {
        WebDriver driver;
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        setDriver(driver);
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Quit WebDriver
    public static void quitDriver() {
        getDriver().quit();
        threadLocalDriver.remove();
    }



    public  static WebDriver launchApplication() {
        try {
            System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driver.get(configObj.getUrlBasePath());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Alert Site seems very slow!!!! Please increase the page load time out in util class");
            driver.close();

        }
        return driver;
    }

    public void screenShot(String filename) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {

            FileUtils.copyFile(source, new File(System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateName + ".png"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.getMessage();
        }
    }
}
