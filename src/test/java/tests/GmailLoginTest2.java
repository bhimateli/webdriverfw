package tests;

import common.SeleniumBase;
import org.testng.annotations.Test;
import util.DriverFactory;

public class GmailLoginTest2 extends SeleniumBase {
    @Test
    public void testComposeEmail() {
        // Navigate to the compose email page after logging in
        DriverFactory.getDriver().get("https://mail.google.com/mail/u/0/#compose");

        // Your test logic here for composing an email
        System.out.println("Gmail compose email test 2 completed");
    }
}

