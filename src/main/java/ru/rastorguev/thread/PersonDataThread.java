package ru.rastorguev.thread;

import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.info.SystemInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.constant.Constant.ONE;
import static ru.rastorguev.util.Utils.clearAndFill;

public class PersonDataThread implements Runnable{

    private final FormPage formPage;
    private final PersonInfo personInfo;
    private final SystemInfo systemInfo;

    public PersonDataThread(FormPage page, PersonInfo info, SystemInfo sys) {
        formPage = page;
        personInfo = info;
        systemInfo = sys;
    }

    @Override
    public void run() {
        try {

            clearAndFill(formPage.surnameField, systemInfo.getClearSwitch(), personInfo.getSurname());
            clearAndFill(formPage.nameField, systemInfo.getClearSwitch(), personInfo.getName());
            clearAndFill(formPage.patronymicField, systemInfo.getClearSwitch(), personInfo.getPatronymic());
            clearAndFill(formPage.birthdateField, systemInfo.getClearSwitch(), personInfo.getBirthdate());
            //applicantType
            //relationshipType

            //docType
            clearAndFill(formPage.docSeriesField, systemInfo.getClearSwitch(), personInfo.getDocSeries());
            clearAndFill(formPage.docNumberField, systemInfo.getClearSwitch(), personInfo.getDocNumber());
            clearAndFill(formPage.docIssuedByField, systemInfo.getClearSwitch(), personInfo.getDocIssuedBy());
            clearAndFill(formPage.docIssuedDateField, systemInfo.getClearSwitch(), personInfo.getDocIssuedDate());
            clearAndFill(formPage.docValidUntilField, systemInfo.getClearSwitch(), personInfo.getDocValidUntil());
            clearAndFill(formPage.departmentCodeField, systemInfo.getClearSwitch(), personInfo.getDepartmentCode());

            clearAndFill(formPage.email, systemInfo.getClearSwitch(), personInfo.getEmail());
            clearAndFill(formPage.phone, systemInfo.getClearSwitch(), personInfo.getPhone());

            if (ONE.equals(personInfo.getAgreement())) formPage.agreement.click();
            if (ONE.equals(personInfo.getConfirmOrder())) formPage.confirmOrder.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
