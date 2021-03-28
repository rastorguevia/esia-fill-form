package ru.rastorguev.thread;

import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.info.SystemInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.constant.Constant.ONE;
import static ru.rastorguev.util.Utils.clearAndFill;

public class ChildDataThread implements Runnable{

    private final FormPage formPage;
    private final ChildInfo childInfo;
    private final SystemInfo systemInfo;


    public ChildDataThread(FormPage page, ChildInfo info, SystemInfo sys) {
        formPage = page;
        childInfo = info;
        systemInfo = sys;
    }

    @Override
    public void run() {

        try {
            clearAndFill(formPage.childSurnameField, systemInfo.getClearSwitch(), childInfo.getChildSurname());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childNameField, systemInfo.getClearSwitch(), childInfo.getChildName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childPatronymicField, systemInfo.getClearSwitch(), childInfo.getChildPatronymic());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childBirthdateField, systemInfo.getClearSwitch(), childInfo.getChildBirthdate());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childBirthPlaceField, systemInfo.getClearSwitch(), childInfo.getChildBirthPlace());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            clearAndFill(formPage.childDocSeriesField, systemInfo.getClearSwitch(), childInfo.getChildDocSeries());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childDocNumberField, systemInfo.getClearSwitch(), childInfo.getChildDocNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childDocIssuedByField, systemInfo.getClearSwitch(), childInfo.getChildDocIssuedBy());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childDocIssuedDateField, systemInfo.getClearSwitch(), childInfo.getChildDocIssuedDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childActRecordNumberField, systemInfo.getClearSwitch(), childInfo.getChildActRecordNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (ONE.equals(childInfo.getChildSpecialConditions())) formPage.childSpecialConditions.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (ONE.equals(childInfo.getChildAdaptedEducational())) formPage.childAdaptedEducational.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (ONE.equals(childInfo.getChildPreferentialRightToStudy())) formPage.childPreferentialRightToStudy.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
