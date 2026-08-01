package com.ui.pages;

import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class LoginPage extends BrowserUtility
{
 private static final By EMAIL_TEXTBOX_LOCATOR= By.id("email");
    private static final  By PASSWORD_TEXTBOX_LOCATOR = By.id("passwd");
    private static final  By SIGNIN_BUTTON_LOCATOR = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public MyAccountPage doLoginWith(String emailAddress, String Password)
    {
        enterText(EMAIL_TEXTBOX_LOCATOR,emailAddress);
        enterText(PASSWORD_TEXTBOX_LOCATOR,Password);
        clickOn(SIGNIN_BUTTON_LOCATOR);
        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        return myAccountPage;
    }


}
