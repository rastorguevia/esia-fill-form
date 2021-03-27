package ru.rastorguev.thread;

import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.utf8Charset;

public class ChildAddressThread implements Runnable{

    private final FormPage formPage;
    private final ChildInfo childInfo;


    public ChildAddressThread(FormPage page, ChildInfo info) {
        formPage = page;
        childInfo = info;
    }

    @Override
    public void run() {
        try {

            formPage.childRegionField.sendKeys(utf8Charset(childInfo.getChildRegion()));
            formPage.childDistrictField.sendKeys(utf8Charset(childInfo.getChildDistrict()));
            formPage.childCityField.sendKeys(utf8Charset(childInfo.getChildCity()));
            formPage.childStreetField.sendKeys(utf8Charset(childInfo.getChildStreet()));
            formPage.childHouseField.sendKeys(utf8Charset(childInfo.getChildHouse()));
            formPage.childApartmentField.sendKeys(utf8Charset(childInfo.getChildApartment()));

            formPage.childRegionStayField.sendKeys(utf8Charset(childInfo.getChildRegionStay()));
            formPage.childDistrictStayField.sendKeys(utf8Charset(childInfo.getChildDistrictStay()));
            formPage.childCityStayField.sendKeys(utf8Charset(childInfo.getChildCityStay()));
            formPage.childStreetStayField.sendKeys(utf8Charset(childInfo.getChildStreetStay()));
            formPage.childHouseStayField.sendKeys(utf8Charset(childInfo.getChildHouseStay()));
            formPage.childApartmentStayField.sendKeys(utf8Charset(childInfo.getChildApartmentStay()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
