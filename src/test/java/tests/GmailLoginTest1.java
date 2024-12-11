package tests;

import common.SeleniumBase;
import org.testng.annotations.Test;
import util.DriverFactory;

public class GmailLoginTest1 extends SeleniumBase {

    @Test
    public void testInboxPage() {
        // Navigate to the inbox page after logging in
        DriverFactory.getDriver().get("https://mail.google.com/mail/u/0/#inbox");

        // Your test logic here for the inbox page
        System.out.println("Gmail inbox test 1 completed");
    }
}
