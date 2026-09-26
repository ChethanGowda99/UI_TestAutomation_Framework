package com.ui.tests;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LamdaTestUtility;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase
{
    protected HomePage homepage;
    private boolean isLamdatest;
    @Parameters({"browser","isLamdatest","isHeadless"})
    @BeforeMethod(description = "Load the homapage of the website")

    public void setup(
            @Optional("chrome") String browser,
            @Optional("true") boolean isLamdatest,
            @Optional("false") boolean isHeadless, ITestResult result)
    {
        this.isLamdatest=isLamdatest;

        WebDriver lambdaDriver;
        if(isLamdatest)
        {
            lambdaDriver=LamdaTestUtility.itializeLamdaTestSession(browser,result.getMethod().getMethodName());
             homepage=new HomePage(lambdaDriver);
        }
        else {
            //on local mechaine
            homepage = new HomePage(Browser.valueOf(browser.toUpperCase()), isHeadless);
        }
    }
    public BrowserUtility getInstance()
    {
        return homepage;
    }


}
