package com.ui.tests;


import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.ui.pojo.User;
import com.utility.LoggerUtility;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({com.ui.listeners.TestListener.class})
public class LoginTest3 extends TestBase


{

   @Test(description = " Verifies with the valid user is able to login in to the application",groups = {"e2e","sanity"}
   , dataProviderClass =com.ui.dataprovider.LoginDataProvider.class,dataProvider = "LoginTestDataProvider")

    public void loginTest(User user)
    {

        //String userName=homepage.goToLoginPage()
              // .doLoginWith("test12@test.com","Test@1234").getUserName();
        Assert.assertEquals(homepage.goToLoginPage()
                .doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName() ,"Qa MS");





    }
    @Test(description = " Verifies with the valid user is able to login in to the application",groups = {"e2e","sanity"}
            , dataProviderClass =com.ui.dataprovider.LoginDataProvider.class,dataProvider = "LoginTestCSVDataProvider")

    public void loginCSVTest(User user)
    {

        //String userName=homepage.goToLoginPage()
        // .doLoginWith("test12@test.com","Test@1234").getUserName();
        Assert.assertEquals(homepage.goToLoginPage()
                .doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName() ,"Qa MS");





    }

    @Test(description = " Verifies with the valid user is able to login in to the application",groups = {"e2e","sanity"}
            , dataProviderClass =com.ui.dataprovider.LoginDataProvider.class,dataProvider = "LoginTestExcelDataProvider"
    )

    public void loginExcelTest(User user)
    {


        //String userName=homepage.goToLoginPage()
        // .doLoginWith("test12@test.com","Test@1234").getUserName();
        Assert.assertEquals(homepage.goToLoginPage()
                .doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName() ,"Qa MS1");





    }

}
