package ru.rastorguev.thread;

import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.clearAndFill;
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

            clearAndFill(formPage.regionField, personInfo.getRegion());
            clearAndFill(formPage.districtField, personInfo.getDistrict());
            clearAndFill(formPage.cityField, personInfo.getCity());
            clearAndFill(formPage.streetField, personInfo.getStreet());
            clearAndFill(formPage.houseField, personInfo.getHouse());
            clearAndFill(formPage.apartmentField, personInfo.getApartment());

            clearAndFill(formPage.regionStayField, personInfo.getRegionStay());
            clearAndFill(formPage.districtStayField, personInfo.getDistrictStay());
            clearAndFill(formPage.cityStayField, personInfo.getCityStay());
            clearAndFill(formPage.streetStayField, personInfo.getStreetStay());
            clearAndFill(formPage.houseStayField, personInfo.getHouseStay());
            clearAndFill(formPage.apartmentStayField, personInfo.getApartmentStay());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
