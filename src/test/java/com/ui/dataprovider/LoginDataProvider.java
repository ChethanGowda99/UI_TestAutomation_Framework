package com.ui.dataprovider;

import com.google.gson.Gson;
import com.ui.pojo.TestData;
import com.ui.pojo.User;
import com.utility.CSVReaderUtility;
import com.utility.ExcelReaderUtility;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class LoginDataProvider
{
    @DataProvider(name="LoginTestDataProvider")
    public static Iterator<Object[]> loginDataprovider() throws FileNotFoundException
    {
        Gson gson=new Gson();
        File file=new File(System.getProperty("user.dir")+"\\testData\\logindata.json");
        FileReader fileReader=new FileReader(file);
        TestData testdata =gson.fromJson(fileReader, TestData.class);
        //List data = testdata.getData();
        List<Object[]> dataReturn=new ArrayList<Object[]>();
        for(User user:testdata.getData())
        {
            dataReturn.add(new Object[]{user} );
        }
        return dataReturn.iterator();



    }
    @DataProvider(name="LoginTestCSVDataProvider")
    public Iterator<User> loginCSVDataProvider()
    {
       return CSVReaderUtility.readCSV("loginData.csv");
    }

    @DataProvider(name="LoginTestExcelDataProvider")
    public Iterator<User> loginTestExcelDataProvider()
    {
        return ExcelReaderUtility.readexcelFile("UserData.xlsx");
    }
}
