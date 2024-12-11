package util;

import lombok.extern.java.Log;
import org.testng.Reporter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileSource {
    public Properties loadParameters(String configFile) {
        Properties prop = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(configFile);
            System.out.println("inputStream Value"+configFile);
            prop.load(inputStream);
           // prop.load(PropertyFileSource.class.getResourceAsStream(configFile));
        }
             catch (IOException e1) {
                System.out.println("Exception while loading properties file:::" + configFile);
                Reporter.log("Exception while loading properties file:::" + configFile);
                e1.printStackTrace();
            }
         finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.print("Exception in loadParameters(1P)::" + configFile);
                    Reporter.log("Exception in loadParameters(1P)::" + configFile);
                    e.printStackTrace();
                }
            }
        }
        return prop;
    }
}
