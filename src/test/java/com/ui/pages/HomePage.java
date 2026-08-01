package com.ui.pages;

import com.constants.Browser;
import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class HomePage extends BrowserUtility
{
    private static final By SIGN_IN_LINK_LOCATOR =By.xpath("//a[contains(text(),\"Sign in\")]");

    public HomePage(Browser browserName)
    {
        super(browserName);//calls parent constructor from child class constructor
        goToWebsite("https://automationpractice.techwithjatin.com/");
    }
    public LoginPage goToLoginPage()
    {
        clickOn(SIGN_IN_LINK_LOCATOR);
        LoginPage loginPage=new LoginPage(getDriver());
                return loginPage;
    }

}
