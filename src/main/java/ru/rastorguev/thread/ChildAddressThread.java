package ru.rastorguev.thread;

import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.clearAndFill;
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

            if ("1".equals(childInfo.getChildAddressMatch())) formPage.childAddressMatch.click();

            clearAndFill(formPage.childRegionField, childInfo.getChildRegion());
            clearAndFill(formPage.childDistrictField, childInfo.getChildDistrict());
            clearAndFill(formPage.childCityField, childInfo.getChildCity());
            clearAndFill(formPage.childStreetField, childInfo.getChildStreet());
            clearAndFill(formPage.childHouseField, childInfo.getChildHouse());
            clearAndFill(formPage.childApartmentField, childInfo.getChildApartment());

            clearAndFill(formPage.childRegionStayField, childInfo.getChildRegionStay());
            clearAndFill(formPage.childDistrictStayField, childInfo.getChildDistrictStay());
            clearAndFill(formPage.childCityStayField, childInfo.getChildCityStay());
            clearAndFill(formPage.childStreetStayField, childInfo.getChildStreetStay());
            clearAndFill(formPage.childHouseStayField, childInfo.getChildHouseStay());
            clearAndFill(formPage.childApartmentStayField, childInfo.getChildApartmentStay());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
