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
            clearAndFill(formPage.childNameField, systemInfo.getClearSwitch(), childInfo.getChildName());
            clearAndFill(formPage.childPatronymicField, systemInfo.getClearSwitch(), childInfo.getChildPatronymic());
            clearAndFill(formPage.childBirthdateField, systemInfo.getClearSwitch(), childInfo.getChildBirthdate());
            clearAndFill(formPage.childBirthPlaceField, systemInfo.getClearSwitch(), childInfo.getChildBirthPlace());

            clearAndFill(formPage.childDocSeriesField, systemInfo.getClearSwitch(), childInfo.getChildDocSeries());
            clearAndFill(formPage.childDocNumberField, systemInfo.getClearSwitch(), childInfo.getChildDocNumber());
            clearAndFill(formPage.childDocIssuedByField, systemInfo.getClearSwitch(), childInfo.getChildDocIssuedBy());
            clearAndFill(formPage.childDocIssuedDateField, systemInfo.getClearSwitch(), childInfo.getChildDocIssuedDate());
            clearAndFill(formPage.childActRecordNumberField, systemInfo.getClearSwitch(), childInfo.getChildActRecordNumber());

            if (ONE.equals(childInfo.getChildSpecialConditions())) formPage.childSpecialConditions.click();
            if (ONE.equals(childInfo.getChildAdaptedEducational())) formPage.childAdaptedEducational.click();
            if (ONE.equals(childInfo.getChildPreferentialRightToStudy())) formPage.childPreferentialRightToStudy.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
