package ru.rastorguev.thread;

import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.clearAndFill;
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

            clearAndFill(formPage.surnameField, personInfo.getSurname());
            clearAndFill(formPage.nameField, personInfo.getName());
            clearAndFill(formPage.patronymicField, personInfo.getPatronymic());
            clearAndFill(formPage.birthdateField, personInfo.getBirthdate());
            //applicantType
            //relationshipType

            //docType
            clearAndFill(formPage.docSeriesField, personInfo.getDocSeries());
            clearAndFill(formPage.docNumberField, personInfo.getDocNumber());
            clearAndFill(formPage.docIssuedByField, personInfo.getDocIssuedBy());
            clearAndFill(formPage.docIssuedDateField, personInfo.getDocIssuedDate());
            clearAndFill(formPage.docValidUntilField, personInfo.getDocValidUntil());
            clearAndFill(formPage.departmentCodeField, personInfo.getDepartmentCode());

            clearAndFill(formPage.email, personInfo.getEmail());
            clearAndFill(formPage.phone, personInfo.getPhone());

            if ("1".equals(personInfo.getAgreement())) formPage.agreement.click();
            if ("1".equals(personInfo.getConfirmOrder())) formPage.confirmOrder.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
