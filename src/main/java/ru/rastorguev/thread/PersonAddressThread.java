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
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.districtField, systemInfo.getClearSwitch(), personInfo.getDistrict());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.cityField, systemInfo.getClearSwitch(), personInfo.getCity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.streetField, systemInfo.getClearSwitch(), personInfo.getStreet());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.houseField, systemInfo.getClearSwitch(), personInfo.getHouse());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.apartmentField, systemInfo.getClearSwitch(), personInfo.getApartment());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            clearAndFill(formPage.regionStayField, systemInfo.getClearSwitch(), personInfo.getRegionStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.districtStayField, systemInfo.getClearSwitch(), personInfo.getDistrictStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.cityStayField, systemInfo.getClearSwitch(), personInfo.getCityStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.streetStayField, systemInfo.getClearSwitch(), personInfo.getStreetStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.houseStayField, systemInfo.getClearSwitch(), personInfo.getHouseStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.apartmentStayField, systemInfo.getClearSwitch(), personInfo.getApartmentStay());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
