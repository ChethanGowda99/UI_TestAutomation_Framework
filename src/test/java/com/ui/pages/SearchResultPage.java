package com.ui.pages;

import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchResultPage extends BrowserUtility
{
    private static final By PRODUCT_LISTING_TITLE=By.xpath("//span[@class=\"lighter\"]");
    private static final By ALL_PRODUCT_LISTS_NAME=By.xpath("//h5[@itemprop=\"name\"]/a");
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    public String getMeSearchResultTitle()
    {
        return getVisibleText(PRODUCT_LISTING_TITLE);
    }
    public boolean getAllDressName(String keywords)
    {
       List<String> keywordsList=Arrays.asList(keywords.toLowerCase().split(" "));
       List<String> productNamesList= getAllVisibleText(ALL_PRODUCT_LISTS_NAME);
       boolean result= productNamesList.stream().anyMatch(name ->(keywordsList.stream().anyMatch(name.toLowerCase()::contains)));
       return result;
    }

}
