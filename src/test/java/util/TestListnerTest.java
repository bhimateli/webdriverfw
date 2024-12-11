package util;

import com.aventstack.extentreports.Status;

import common.BaseInitClass;
import common.ExtentManager;
import common.ExtentTestManager;
import org.testng.*;

public class TestListnerTest extends BaseInitClass implements ITestListener  {
  //  ExtentSparkReporter htmlReporter = new ExtentSparkReporter("C:\\Automation\\extentReport.html");
  //  ExtentReports extent = new ExtentReports();
//
  //  public ExtentTest logger;
  public void onFinish(ITestContext context) {
      System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
      ExtentTestManager.endTest();
      ExtentManager.getInstance().flush();
  }
    @Override
    public void onTestStart(ITestResult result) {
        ExtentTestManager.startTest(result.getMethod().getMethodName());

              System.out.println(
                "============================================================================================================================");
        System.out.println("STARTED - " + result.getTestClass().getName() + "#" + result.getName());
        System.out.println(
                "============================================================================================================================");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        ExtentTestManager.getTest().log(Status.PASS, "Test passed");
       /* logger=extent.createTest(tr.getName()); // create new entry in th report
        logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN)); */// send the passed information to the report with GREEN color highlighted
        System.out.println(
                "============================================================================================================================");
        System.out.println("PASSED - " + tr.getTestClass().getName() + "#" + tr.getName());
        System.out.println(
                "============================================================================================================================");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
        logger.info("Error",result.getThrowable());

      //  logger.log(LogStatus.INFO, result.getThrowable());
       /* logger=extent.createTest(result.getName()); // create new entry in th report
        logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName(),ExtentColor.RED));*/ // send the passed information to the report with GREEN color highlighted
        screenShot(result.getName());
        System.out.println(
                "============================================================================================================================");
        System.out.println("FAILED - " + result.getTestClass().getName() + "#" + result.getName());


        System.out.println(
                "============================================================================================================================");
        System.out.println(
                "============================================================================================================================");
        System.out.println("FAILURE REASON");
        System.out.println(result.getThrowable());
        System.out.println(
                "============================================================================================================================");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
      //  logger=extent.createTest(tr.getName()); // create new entry in th report
      //  logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
        System.out.println(
                "============================================================================================================================");
        System.out.println("SKIPPED - " + tr.getTestClass().getName() + "#" + tr.getName());
        System.out.println(
                "============================================================================================================================");
    }




}


