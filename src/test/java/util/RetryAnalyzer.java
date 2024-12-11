package util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0; // Current retry attempt
    private static final int maxRetryCount = 3; // Max retry attempts
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount < maxRetryCount){
            retryCount++;
            return true; // Retry the test
        }
        return false;
    }
}
