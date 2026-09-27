package com.utility;

import com.constants.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public abstract class BrowserUtility
{
    private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
    public WebDriver getDriver() {
        return driver.get();
    }


    public BrowserUtility(WebDriver driver) {
        this.driver.set(driver);//intialize the instance veriable diver
    }
    public BrowserUtility(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            driver.set(new ChromeDriver());

        }
       else if( browserName.equalsIgnoreCase("edge"))
        {
            driver.set(new EdgeDriver());
        }
       else {
            System.out.println("Invalid browsername....please select valid brwoser");
        }
    }


    public BrowserUtility(Browser browserName)
    {
        if(browserName==Browser.CHROME)
        {
            driver.set(new ChromeDriver());

        }
        else if( browserName==Browser.EDGE)
        {
            driver.set(new EdgeDriver());
        }
        else if( browserName==Browser.FIREFOX)
        {
            driver.set(new FirefoxDriver());
        }

        else {
            System.out.println("Invalid browsername....please select valid brwoser");
        }
    }

    public BrowserUtility(Browser browserName, Boolean isHeadless)
    {
        if(browserName==Browser.CHROME )
        {
            if(isHeadless) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless=old");
                options.addArguments("--window-size=1920,1020");
                driver.set(new ChromeDriver(options));
            }
            else {
                driver.set(new ChromeDriver());
            }

        }
        else if( browserName==Browser.EDGE)
        {
            driver.set(new EdgeDriver());
        }
        else if( browserName==Browser.FIREFOX)
        {
            driver.set(new FirefoxDriver());
        }

        else {
            System.out.println("Invalid browsername....please select valid brwoser");
        }
    }


    public void goToWebsite(String url)
    {
        driver.get().get(url);
    }
    public void maximizeWindow()
    {
        driver.get().manage().window().maximize();
    }
    public void clickOn(By locator)
    {
        WebElement element =driver.get().findElement(locator);//find element!!
        element.click();
    }
    public void enterText(By locator ,String texttoenter)
    {
        WebElement element= driver.get().findElement(locator);
        element.sendKeys(texttoenter);
    }
    public String getVisibleText(By locator)
    {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element= driver.get().findElement(locator);
        return element.getText();
    }
public String takeScreenshot(String name)
    {
        System.out.println("STEP 1: Screenshot method started");

        WebDriver webDriver = getDriver();

        System.out.println("STEP 2: Actual driver = " + webDriver);
        System.out.println("STEP 3: Driver class = " +
                (webDriver != null ? webDriver.getClass().getName() : "NULL"));

        TakesScreenshot screenshot=(TakesScreenshot) webDriver;
        System.out.println("STEP 4: Driver converted to TakesScreenshot");
       File screenshotdata =screenshot.getScreenshotAs(OutputType.FILE);
        System.out.println("STEP 5: Screenshot captured");
        Date date=new Date();
        SimpleDateFormat formate = new SimpleDateFormat("HH-mm-ss-SSS");
       String timeStamp =formate.format(date);

       String path="./screenshot/"+name+"-"+timeStamp+".png";

       File screenshotFile=new File(path);
        try {
            FileUtils.copyFile(screenshotdata,screenshotFile);
            System.out.println("STEP 6: Screenshot copied successfully");
            System.out.println("Screenshot path = " + path);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        return path;
    }




}
