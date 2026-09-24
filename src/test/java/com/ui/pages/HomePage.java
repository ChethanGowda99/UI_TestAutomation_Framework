package com.ui.pages;

import com.constants.Browser;
import com.constants.Env;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;
import com.utility.PropertiesUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class HomePage extends BrowserUtility
{
    private static final By SIGN_IN_LINK_LOCATOR =By.xpath("//a[contains(text(),\"Sign in\")]");

    public HomePage(Browser browserName,boolean isHeadless)
    {
        super(browserName,isHeadless);//calls parent constructor from child class constructor
        goToWebsite(JSONUtility.readJSON(Env.QA).getUrl());
    }
    public HomePage(WebDriver driver)
    {
        super(driver);
        goToWebsite(JSONUtility.readJSON(Env.QA).getUrl());
    }

    public LoginPage goToLoginPage()
    {
        clickOn(SIGN_IN_LINK_LOCATOR);
        LoginPage loginPage=new LoginPage(getDriver());
                return loginPage;
    }

}
