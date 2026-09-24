package com.ui.listeners;

import com.constants.Env;
import com.utility.JSONUtility;
import com.utility.PropertiesUtil;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer
{
   //private static final int max_number_of_attempts=Integer.parseInt(PropertiesUtil.readProperty(Env.DEV,"max_number_of_attempts"));
   private static final int max_number_of_attempts= JSONUtility.readJSON(Env.QA).getMax_number_of_attempts();
    private static int currentAttempt=1;
    @Override
    public boolean retry(ITestResult result) {
        if(currentAttempt<=max_number_of_attempts)
        {
            currentAttempt++;
            return true;
        }
        return false;
    }
}
