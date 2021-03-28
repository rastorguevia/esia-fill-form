package ru.rastorguev.thread;

import org.openqa.selenium.support.ui.Select;
import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.pages.FormPage;

import static ru.rastorguev.util.Utils.utf8Charset;

public class DropDownListThread implements Runnable {

    private final FormPage formPage;
    private final PersonInfo personInfo;
    private final ChildInfo childInfo;

    public DropDownListThread(FormPage page, PersonInfo info, ChildInfo child) {
        formPage = page;
        personInfo = info;
        childInfo = child;
    }

    @Override
    public void run() {

        try {
            Select select = new Select(formPage.municipality);
            select.selectByVisibleText(utf8Charset(personInfo.getMunicipality()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            formPage.municipalityButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            Select select = new Select(formPage.applicantType);
            select.selectByVisibleText(utf8Charset(personInfo.getApplicantType()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Select select = new Select(formPage.relationshipType);
            select.selectByVisibleText(utf8Charset(personInfo.getRelationshipType()));
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            Select select = new Select(formPage.docType);
            select.selectByVisibleText(utf8Charset(personInfo.getDocType()));
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            Select select = new Select(formPage.childDocType);
            select.selectByVisibleText(utf8Charset(childInfo.getChildDocType()));
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            Select select = new Select(formPage.educationLanguage);
            select.selectByVisibleText(utf8Charset(childInfo.getEducationLanguage()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Select select = new Select(formPage.nativeLanguage);
            select.selectByVisibleText(utf8Charset(childInfo.getNativeLanguage()));
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            Select select = new Select(formPage.rebate);
            select.selectByVisibleText(utf8Charset(childInfo.getRebate()));
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            Select select = new Select(formPage.organization);
            select.selectByVisibleText(utf8Charset(childInfo.getOrganization()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Select select = new Select(formPage.grade);
            select.selectByVisibleText(utf8Charset(childInfo.getGrade()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
