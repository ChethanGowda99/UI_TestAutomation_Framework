package com.ui.tests;


import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest3 {
    public static void main(String[] args)
    {

        HomePage homepage=new HomePage(Browser.CHROME);
        String userName=homepage.goToLoginPage()
               .doLoginWith("test12@test.com","Test@1234").getUserName();
        System.out.println(userName);




    }

}
