package com.ui.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ui.tests.TestBase;
import com.utility.BrowserUtility;
import com.utility.ExcelReaderUtility;
import com.utility.ExtentReporterUtility;
import com.utility.LoggerUtility;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListener implements ITestListener
{
    Logger logger  = LoggerUtility.getLogger(this.getClass());
    ExtentSparkReporter extentSparkReporter;
    ExtentReports  extentReports;
   ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {
      logger.info(result.getMethod().getMethodName());
      logger.info(result.getMethod().getDescription());
      logger.info(Arrays.toString(result.getMethod().getGroups()));
      ExtentReporterUtility.createExtentTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info(result.getMethod().getMethodName()+""+"PASSED");
        ExtentReporterUtility.getTest().log(Status.PASS,result.getMethod().getMethodName()+""+"PASSED");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.info(result.getMethod().getMethodName()+""+"FAILED");
        logger.info(result.getThrowable().getMessage());
        ExtentReporterUtility.getTest().log(Status.FAIL,result.getMethod().getMethodName()+""+"FAILED");
        ExtentReporterUtility.getTest().log(Status.FAIL,result.getThrowable().getMessage());
      Object testclass = result.getInstance();
       BrowserUtility browserUtility=((TestBase)testclass).getInstance();
       logger.info("capturing screenshot for the failed test");
       String screenshotpath =browserUtility.takeScreenshot(result.getMethod().getMethodName());
        logger.info("capturing screenshot fot HTML file");
        ExtentReporterUtility.getTest().addScreenCaptureFromPath(screenshotpath);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info(result.getMethod().getMethodName()+""+"SKIPPED");
        ExtentReporterUtility.getTest().log(Status.SKIP,result.getMethod().getMethodName()+""+"SKIPPED");
    }

    @Override
    public void onStart(ITestContext context) {

        logger.info("Test suite started");
        ExtentReporterUtility.setupSparkReporter("reports.html");
    }
    @Override
    public void onFinish(ITestContext context) {
        logger.info("Test suite completed");
        ExtentReporterUtility.flushReport();

    }
}
