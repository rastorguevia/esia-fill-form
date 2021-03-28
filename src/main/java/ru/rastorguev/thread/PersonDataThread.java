package ru.rastorguev.thread;

import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.info.SystemInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.constant.Constant.ONE;
import static ru.rastorguev.util.Utils.clearAndFill;

public class PersonDataThread implements Runnable {

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.nameField, systemInfo.getClearSwitch(), personInfo.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.patronymicField, systemInfo.getClearSwitch(), personInfo.getPatronymic());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.birthdateField, systemInfo.getClearSwitch(), personInfo.getBirthdate());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.docSeriesField, systemInfo.getClearSwitch(), personInfo.getDocSeries());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.docNumberField, systemInfo.getClearSwitch(), personInfo.getDocNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.docIssuedByField, systemInfo.getClearSwitch(), personInfo.getDocIssuedBy());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.docIssuedDateField, systemInfo.getClearSwitch(), personInfo.getDocIssuedDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.docValidUntilField, systemInfo.getClearSwitch(), personInfo.getDocValidUntil());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.departmentCodeField, systemInfo.getClearSwitch(), personInfo.getDepartmentCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            clearAndFill(formPage.email, systemInfo.getClearSwitch(), personInfo.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.phone, systemInfo.getClearSwitch(), personInfo.getPhone());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (ONE.equals(personInfo.getAgreement())) formPage.agreement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (ONE.equals(personInfo.getConfirmOrder())) formPage.confirmOrder.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
