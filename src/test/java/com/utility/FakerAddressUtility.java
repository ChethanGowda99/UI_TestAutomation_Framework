package com.utility;

import com.github.javafaker.Faker;
import com.ui.pojo.AddressPOJO;

import java.util.Locale;

public class FakerAddressUtility
{

    public static void main(String[] args) {
        getFakerAddress();
    }
    public static AddressPOJO  getFakerAddress()
    {
        Faker faker= new Faker(Locale.US);

       AddressPOJO addressPOJO=new AddressPOJO(faker.company().name(),faker.address().buildingNumber(),faker.address().city(),faker.numerify("56210"),
               "9743503833","9743503933"
               ,"save address",
               "home address",faker.address().state(),faker.address().country());


        return addressPOJO;
    }
}
