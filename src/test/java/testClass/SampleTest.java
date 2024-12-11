package testClass;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import util.RetryAnalyzer;

public class SampleTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testRetryLogic(){
        System.out.println("Executing testRetryLogic...");
        Assert.fail("Failing test to demonstrate retry logic");
    }
}
