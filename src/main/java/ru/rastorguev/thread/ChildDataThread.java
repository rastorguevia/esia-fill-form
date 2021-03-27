package ru.rastorguev.thread;

import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.clearAndFill;
import static ru.rastorguev.util.Utils.utf8Charset;

public class ChildDataThread implements Runnable{

    private final FormPage formPage;
    private final ChildInfo childInfo;


    public ChildDataThread(FormPage page, ChildInfo info) {
        formPage = page;
        childInfo = info;
    }

    @Override
    public void run() {
        try {

            clearAndFill(formPage.childSurnameField, childInfo.getChildSurname());
            clearAndFill(formPage.childNameField, childInfo.getChildName());
            clearAndFill(formPage.childPatronymicField, childInfo.getChildPatronymic());
            clearAndFill(formPage.childBirthdateField, childInfo.getChildBirthdate());
            clearAndFill(formPage.childBirthPlaceField, childInfo.getChildBirthPlace());

            clearAndFill(formPage.childDocSeriesField, childInfo.getChildDocSeries());
            clearAndFill(formPage.childDocNumberField, childInfo.getChildDocNumber());
            clearAndFill(formPage.childDocIssuedByField, childInfo.getChildDocIssuedBy());
            clearAndFill(formPage.childDocIssuedDateField, childInfo.getChildDocIssuedDate());
            clearAndFill(formPage.childActRecordNumberField, childInfo.getChildActRecordNumber());

            if ("1".equals(childInfo.getChildSpecialConditions())) formPage.childSpecialConditions.click();
            if ("1".equals(childInfo.getChildAdaptedEducational())) formPage.childAdaptedEducational.click();
            if ("1".equals(childInfo.getChildPreferentialRightToStudy())) formPage.childPreferentialRightToStudy.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
