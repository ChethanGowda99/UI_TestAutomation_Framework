package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest1 {
    public static void main(String[] args) {
        WebDriver wd = new ChromeDriver();
       // wd.get("https://automationpractice.techwithjatin.com/");
        //BrowserUtility browserUtility=new BrowserUtility(wd);
       // browserUtility.goToWebsite("https://automationpractice.techwithjatin.com/");
       // browserUtility.maximizeWindow();
        //maximize the browser window
        //method chinning
       // wd.manage().window().maximize();
       //WebElement clickOnSignin =wd.findElement(By.xpath("//a[contains(text(),\"Sign in\")]"));
       By signInLinkLocator =By.xpath("//a[contains(text(),\"Sign in\")]");
       //WebElement signInLinkWebElement =wd.findElement(signInLinkLocator);//find element!!
       //signInLinkWebElement.click();
       // browserUtility.clickOn(signInLinkLocator);
       By emailTextBoxlocator= By.id("email");
       //WebElement emailTextBoxWebElement= wd.findElement(emailTextBoxlocator);
       //emailTextBoxWebElement.sendKeys("test12@test.com");
       // browserUtility.enterText(emailTextBoxlocator,"test12@test.com");
       By PasswordTextBoxlocator = By.id("passwd");
       //WebElement PasswordTextBoxWebElement =wd.findElement(PasswordTextBoxlocator);
       //PasswordTextBoxWebElement.sendKeys("Test@1234");
       // browserUtility.enterText(PasswordTextBoxlocator,"Test@1234");

        By signinButtonlocator = By.id("SubmitLogin");
       // WebElement signinButtonWebelement =wd.findElement(signinButtonlocator);
       // signinButtonWebelement.click();
        //browserUtility.clickOn(signinButtonlocator);








    }

}
