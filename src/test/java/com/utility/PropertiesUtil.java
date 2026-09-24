package com.utility;

import com.constants.Env;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static String readProperty(Env env,String propertyName)  {
        File propfile=new File(System.getProperty("user.dir")+"\\config\\"+env+".properties");
       // C:\Users\SCIndia\IdeaProjects\UI_TestAutomation_Framework
       // System.out.println(System.getProperty("user.dir"));
        FileReader filereader= null;
        Properties properties=new Properties();
        try {
            filereader = new FileReader(propfile);
            properties.load(filereader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        String value= properties.getProperty(propertyName);
      return value;

    }
}
