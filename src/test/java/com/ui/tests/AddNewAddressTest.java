package com.ui.tests;

import com.ui.pages.MyAccountPage;
import com.ui.pojo.AddressPOJO;
import com.utility.FakerAddressUtility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewAddressTest extends TestBase
{
    private MyAccountPage myAccountPage;
    private AddressPOJO addressPOJO;

    @BeforeMethod
    public void setUp() {
        myAccountPage = homepage.goToLoginPage().doLoginWith("test12@test.com", "Test@1234");
        addressPOJO = FakerAddressUtility.getFakerAddress();
    }
    @Test
    public void addNewAddress()
    {
        myAccountPage.goToAddAddressPage().saveAddress(addressPOJO);
    }
}
