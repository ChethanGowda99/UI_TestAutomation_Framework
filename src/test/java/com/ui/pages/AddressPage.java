package com.ui.pages;

import com.ui.pojo.AddressPOJO;
import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AddressPage extends BrowserUtility
{
    private static final By COMPANY_TEXT_BOX_LOCATOR=By.id("company");
    private static final By ADDRESS1_TEXT_BOX_LOCATOR=By.id("address1");
    private static final By CITY_TEXT_BOX_LOCATOR=By.id("city");
    private static final By ZIPCODE_TEXT_BOX_LOCATOR=By.id("postcode");
    private static final By COUNTRY_DROPDOWN_LOCATOR=By.id("id_country");
    private static final By STATE_DROPDOWN_LOCATOR=By.id("id_state");
    private static final By HOME_PHONE_TEXT_BOX_LOCATOR=By.id("phone");
    private static final By MOBILE_PHONE_TEXT_BOX_LOCATOR=By.id("phone_mobile");
    private static final By OTHER_TEXT_BOX_LOCATOR=By.id("other");
    private static final By ADDRESS_ALIAS_TEXT_BOX_LOCATOR=By.id("alias");
    private static final By SAVE_ADDRESS_LOCATOR=By.id("submitAddress");


    public AddressPage(WebDriver driver) {
        super(driver);
    }
    public void saveAddress(AddressPOJO addressPOJO)
    {

        enterText(COMPANY_TEXT_BOX_LOCATOR,addressPOJO.getCompany());
        enterText(ADDRESS1_TEXT_BOX_LOCATOR,addressPOJO.getAddressLine1());
        enterText(CITY_TEXT_BOX_LOCATOR,addressPOJO.getCity());
        selectFromDropDown(STATE_DROPDOWN_LOCATOR,addressPOJO.getState());
        enterText(ZIPCODE_TEXT_BOX_LOCATOR,addressPOJO.getPostCode());
        selectFromDropDown(COUNTRY_DROPDOWN_LOCATOR,addressPOJO.getCountry());
        enterText(HOME_PHONE_TEXT_BOX_LOCATOR,addressPOJO.getHomePhoneNumber());
        enterText(MOBILE_PHONE_TEXT_BOX_LOCATOR,addressPOJO.getMobilePhoneNumber());
        enterText(OTHER_TEXT_BOX_LOCATOR,addressPOJO.getOtherInfo());
        clearText(ADDRESS_ALIAS_TEXT_BOX_LOCATOR);
        enterText(ADDRESS_ALIAS_TEXT_BOX_LOCATOR,addressPOJO.getAddressAlias());


        clickOn(SAVE_ADDRESS_LOCATOR);

    }

}
