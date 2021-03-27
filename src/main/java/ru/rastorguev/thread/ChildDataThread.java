package ru.rastorguev.thread;

import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.pages.FormPage;

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

            formPage.childSurnameField.sendKeys(utf8Charset(childInfo.getChildSurname()));
            formPage.childNameField.sendKeys(utf8Charset(childInfo.getChildName()));
            formPage.childPatronymicField.sendKeys(utf8Charset(childInfo.getChildPatronymic()));
            formPage.childBirthdateField.sendKeys(utf8Charset(childInfo.getChildBirthdate()));
            formPage.childBirthPlaceField.sendKeys(utf8Charset(childInfo.getChildBirthPlace()));

            formPage.childDocSeriesField.sendKeys(utf8Charset(childInfo.getChildDocSeries()));
            formPage.childDocNumberField.sendKeys(utf8Charset(childInfo.getChildDocNumber()));
            formPage.childDocIssuedByField.sendKeys(utf8Charset(childInfo.getChildDocIssuedBy()));
            formPage.childDocIssuedDateField.sendKeys(utf8Charset(childInfo.getChildDocIssuedDate()));
            formPage.childActRecordNumberField.sendKeys(utf8Charset(childInfo.getChildActRecordNumber()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
