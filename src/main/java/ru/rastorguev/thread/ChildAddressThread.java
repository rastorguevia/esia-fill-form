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

            clearAndFill(formPage.childRegionField, systemInfo.getClearSwitch(), childInfo.getChildRegion());
            clearAndFill(formPage.childDistrictField, systemInfo.getClearSwitch(), childInfo.getChildDistrict());
            clearAndFill(formPage.childCityField, systemInfo.getClearSwitch(), childInfo.getChildCity());
            clearAndFill(formPage.childStreetField, systemInfo.getClearSwitch(), childInfo.getChildStreet());
            clearAndFill(formPage.childHouseField, systemInfo.getClearSwitch(), childInfo.getChildHouse());
            clearAndFill(formPage.childApartmentField, systemInfo.getClearSwitch(), childInfo.getChildApartment());

            clearAndFill(formPage.childRegionStayField, systemInfo.getClearSwitch(), childInfo.getChildRegionStay());
            clearAndFill(formPage.childDistrictStayField, systemInfo.getClearSwitch(), childInfo.getChildDistrictStay());
            clearAndFill(formPage.childCityStayField, systemInfo.getClearSwitch(), childInfo.getChildCityStay());
            clearAndFill(formPage.childStreetStayField, systemInfo.getClearSwitch(), childInfo.getChildStreetStay());
            clearAndFill(formPage.childHouseStayField, systemInfo.getClearSwitch(), childInfo.getChildHouseStay());
            clearAndFill(formPage.childApartmentStayField, systemInfo.getClearSwitch(), childInfo.getChildApartmentStay());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
