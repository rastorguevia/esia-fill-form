package ru.rastorguev.thread;

import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.utf8Charset;

public class PersonAddressThread implements Runnable{

    private final FormPage formPage;
    private final PersonInfo personInfo;

    public PersonAddressThread(FormPage page, PersonInfo info) {
        formPage = page;
        personInfo = info;
    }

    @Override
    public void run() {
        try {

            formPage.regionField.sendKeys(utf8Charset(personInfo.getRegion()));
            formPage.districtField.sendKeys(utf8Charset(personInfo.getDistrict()));
            formPage.cityField.sendKeys(utf8Charset(personInfo.getCity()));
            formPage.streetField.sendKeys(utf8Charset(personInfo.getStreet()));
            formPage.houseField.sendKeys(utf8Charset(personInfo.getHouse()));
            formPage.apartmentField.sendKeys(utf8Charset(personInfo.getApartment()));

            formPage.regionStayField.sendKeys(utf8Charset(personInfo.getRegionStay()));
            formPage.districtStayField.sendKeys(utf8Charset(personInfo.getDistrictStay()));
            formPage.cityStayField.sendKeys(utf8Charset(personInfo.getCityStay()));
            formPage.streetStayField.sendKeys(utf8Charset(personInfo.getStreetStay()));
            formPage.houseStayField.sendKeys(utf8Charset(personInfo.getHouseStay()));
            formPage.apartmentStayField.sendKeys(utf8Charset(personInfo.getApartmentStay()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
