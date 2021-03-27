package ru.rastorguev.thread;

import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.utf8Charset;

public class PersonDataThread implements Runnable{

    private final FormPage formPage;
    private final PersonInfo personInfo;

    public PersonDataThread(FormPage page, PersonInfo info) {
        formPage = page;
        personInfo = info;
    }

    @Override
    public void run() {
        try {

            formPage.surnameField.sendKeys(utf8Charset(personInfo.getSurname()));
            formPage.nameField.sendKeys(utf8Charset(personInfo.getName()));
            formPage.patronymicField.sendKeys(utf8Charset(personInfo.getPatronymic()));
            formPage.birthdateField.sendKeys(utf8Charset(personInfo.getBirthdate()));
            //applicantType
            //relationshipType

            //docType
            formPage.docSeriesField.sendKeys(utf8Charset(personInfo.getDocSeries()));
            formPage.docNumberField.sendKeys(utf8Charset(personInfo.getDocNumber()));
            formPage.docIssuedByField.sendKeys(utf8Charset(personInfo.getDocIssuedBy()));
            formPage.docIssuedDateField.sendKeys(utf8Charset(personInfo.getDocIssuedDate()));
            formPage.docValidUntilField.sendKeys(utf8Charset(personInfo.getDocValidUntil()));
            formPage.departmentCodeField.sendKeys(utf8Charset(personInfo.getDepartmentCode()));

            formPage.email.sendKeys(utf8Charset(personInfo.getEmail()));
            formPage.phone.sendKeys(utf8Charset(personInfo.getPhone()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
