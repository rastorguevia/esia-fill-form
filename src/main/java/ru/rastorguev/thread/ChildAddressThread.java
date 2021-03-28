package ru.rastorguev.thread;

import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.info.SystemInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.constant.Constant.ONE;
import static ru.rastorguev.util.Utils.clearAndFill;

public class ChildAddressThread implements Runnable{

    private final FormPage formPage;
    private final ChildInfo childInfo;
    private final SystemInfo systemInfo;


    public ChildAddressThread(FormPage page, ChildInfo info, SystemInfo sys) {
        formPage = page;
        childInfo = info;
        systemInfo = sys;
    }

    @Override
    public void run() {

        try {
            if (ONE.equals(childInfo.getChildAddressMatch())) formPage.childAddressMatch.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childRegionField, systemInfo.getClearSwitch(), childInfo.getChildRegion());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childDistrictField, systemInfo.getClearSwitch(), childInfo.getChildDistrict());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childCityField, systemInfo.getClearSwitch(), childInfo.getChildCity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childStreetField, systemInfo.getClearSwitch(), childInfo.getChildStreet());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childHouseField, systemInfo.getClearSwitch(), childInfo.getChildHouse());
        } catch (Exception e) {
           e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childApartmentField, systemInfo.getClearSwitch(), childInfo.getChildApartment());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            clearAndFill(formPage.childRegionStayField, systemInfo.getClearSwitch(), childInfo.getChildRegionStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childDistrictStayField, systemInfo.getClearSwitch(), childInfo.getChildDistrictStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childCityStayField, systemInfo.getClearSwitch(), childInfo.getChildCityStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childStreetStayField, systemInfo.getClearSwitch(), childInfo.getChildStreetStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childHouseStayField, systemInfo.getClearSwitch(), childInfo.getChildHouseStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childApartmentStayField, systemInfo.getClearSwitch(), childInfo.getChildApartmentStay());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
