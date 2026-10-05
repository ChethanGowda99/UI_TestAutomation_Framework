package com.utility;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojo.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CSVReaderUtility
{
    public static Iterator<User> readCSV(String filename)
    {

        File csvfile=new File(System.getProperty("user.dir")+"//testData//"+filename);
        FileReader fileReader=null;
        CSVReader csvReader;
        String[] line;
        List<User> userArrayList;
        User userData;
        try {
             fileReader=new FileReader(csvfile);
             csvReader=new CSVReader(fileReader);
             csvReader.readNext();
             userArrayList=new ArrayList<User>();
           while ((line=csvReader.readNext())!=null)
           {  userData=new User(line[0],line[1]);
              userArrayList.add(userData);
          }
           for(User user:userArrayList)
           {
               System.out.println(user);
           }
            //System.out.println(Arrays.toString(data));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException |IOException e) {
            throw new RuntimeException(e);
        }

       return userArrayList.iterator();
    }
}
