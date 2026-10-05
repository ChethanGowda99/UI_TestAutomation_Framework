package com.ui.pojo;

public class AddressPOJO
{
    private String company;
    private String addressLine1;
    private String city;
    private String postCode;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String otherInfo;
    private String addressAlias;
    private String state;
    private String country;

    public AddressPOJO(String company,String addressLine1,String city,String postCode,String homePhoneNumber
    ,String mobilePhoneNumber,String otherInfo,String addressAlias,String state, String country) {
        this.company = company;
        this.addressLine1=addressLine1;
        this.city=city;
        this.postCode=postCode;
        this.homePhoneNumber=homePhoneNumber;
        this.mobilePhoneNumber=mobilePhoneNumber;
        this.otherInfo=otherInfo;
        this.addressAlias=addressAlias;
        this.state=state;
        this.country=country;
    }

    public String getCompany() {
        return company;
    }

    public String getCity() {
        return city;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getPostCode() {

        return postCode;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public String getAddressAlias() {
        return addressAlias;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "AddressPOJO{" +
                "company='" + company + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", otherInfo='" + otherInfo + '\'' +
                ", addressAlias='" + addressAlias + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
