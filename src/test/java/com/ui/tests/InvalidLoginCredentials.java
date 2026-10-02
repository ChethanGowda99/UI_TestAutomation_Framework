package com.ui.tests;

import com.ui.pojo.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginCredentials extends TestBase
{
    private static final String INVALD_EMAIL_ADDRESS="chethan@gmail.com";
    private static final String INVALD_PASSWORD="Test@1234";
    @Test(description = " Verifies if the proper error message shows, when we enter the inavlid credentials",groups = {"e2e","sanity"}
            )

    public void loginTest()
    {

        //String userName=homepage.goToLoginPage()
        // .doLoginWith("test12@test.com","Test@1234").getUserName();
        Assert.assertEquals(homepage.goToLoginPage()
                .doLoginWithInvalidCredentials(INVALD_EMAIL_ADDRESS,INVALD_PASSWORD).getErrorMessage(),"Authentication failed.");





    }
}
