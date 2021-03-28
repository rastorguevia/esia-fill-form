package ru.rastorguev.thread;

import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.info.SystemInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.clearAndFill;

public class PersonAddressThread implements Runnable{

    private final FormPage formPage;
    private final PersonInfo personInfo;
    private final SystemInfo systemInfo;

    public PersonAddressThread(FormPage page, PersonInfo info, SystemInfo sys) {
        formPage = page;
        personInfo = info;
        systemInfo = sys;
    }

    @Override
    public void run() {
        try {

            clearAndFill(formPage.regionField, systemInfo.getClearSwitch(), personInfo.getRegion());
            clearAndFill(formPage.districtField, systemInfo.getClearSwitch(), personInfo.getDistrict());
            clearAndFill(formPage.cityField, systemInfo.getClearSwitch(), personInfo.getCity());
            clearAndFill(formPage.streetField, systemInfo.getClearSwitch(), personInfo.getStreet());
            clearAndFill(formPage.houseField, systemInfo.getClearSwitch(), personInfo.getHouse());
            clearAndFill(formPage.apartmentField, systemInfo.getClearSwitch(), personInfo.getApartment());

            clearAndFill(formPage.regionStayField, systemInfo.getClearSwitch(), personInfo.getRegionStay());
            clearAndFill(formPage.districtStayField, systemInfo.getClearSwitch(), personInfo.getDistrictStay());
            clearAndFill(formPage.cityStayField, systemInfo.getClearSwitch(), personInfo.getCityStay());
            clearAndFill(formPage.streetStayField, systemInfo.getClearSwitch(), personInfo.getStreetStay());
            clearAndFill(formPage.houseStayField, systemInfo.getClearSwitch(), personInfo.getHouseStay());
            clearAndFill(formPage.apartmentStayField, systemInfo.getClearSwitch(), personInfo.getApartmentStay());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
