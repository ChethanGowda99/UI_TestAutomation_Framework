package com.ui.tests;

import com.ui.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductSearch extends TestBase
{
    private MyAccountPage myAccountPage;
    private static final String SEARCH_ITEM="Mens Wallet";
    @BeforeMethod
    public void setUp()
    {
        myAccountPage= homepage.goToLoginPage().doLoginWith("test12@test.com","Test@1234");
    }
    @Test (description = "verify if logged user is able to search for product and correct products are displayed",groups = {"e2e,smoke"})
    public void verifyProductSearch()
    {

   boolean actualresult= myAccountPage.searchForaProduct(SEARCH_ITEM).getAllDressName(SEARCH_ITEM);
        Assert.assertEquals(actualresult,true);

    }
}
