package com.utility;

import com.ui.pojo.User;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReaderUtility
{
    public static Iterator<User> readexcelFile(String fileName)
    {
        //xlsx class xssworkbook
        File xlsxfile=new File(System.getProperty("user.dir")+"//testData//"+fileName);
        XSSFWorkbook xssworkbook= null;
        Iterator<Row> rowIterator;
        XSSFSheet xssfSheet;
        User user;
        Row row;
        Cell emailAddressCell;
        Cell passwordCell;
        List<User> userList;
        try {
            xssworkbook = new XSSFWorkbook(xlsxfile);
             xssfSheet =xssworkbook.getSheet("UserTestData");
            rowIterator=xssfSheet.iterator();
            rowIterator.next();//skkipping column name
            userList=new ArrayList<User>();

            while (rowIterator.hasNext())
            {
                row=rowIterator.next();
                emailAddressCell =row.getCell(0);
                passwordCell =row.getCell(1);
                user= new User(emailAddressCell.toString(),passwordCell.toString());
                userList.add(user);
            }
            xssworkbook.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
        return userList.iterator();

    }
}
