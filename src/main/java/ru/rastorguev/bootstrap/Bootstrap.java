package ru.rastorguev.bootstrap;

import jfork.nproperty.ConfigParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.info.SystemInfo;
import ru.rastorguev.pages.FormPage;
import ru.rastorguev.thread.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static ru.rastorguev.constant.Constant.*;
import static ru.rastorguev.util.Utils.clearAndFill;
import static ru.rastorguev.util.Utils.utf8Charset;

public class Bootstrap {

    private final WebDriver webDriver;
    private final PersonInfo personInfo;
    private final ChildInfo childInfo;
    private final SystemInfo systemInfo;
    private final FormPage formPage;

    public Bootstrap() throws Exception {
        systemInfo = new SystemInfo();
        ConfigParser.parse(systemInfo, FILE_NAME);

        personInfo = new PersonInfo();
        ConfigParser.parse(personInfo, FILE_NAME);

        childInfo = new ChildInfo();
        ConfigParser.parse(childInfo, FILE_NAME);

        formPage = new FormPage();

        ChromeOptions options = new ChromeOptions();
        options.addArguments(START_MAXIMIZED);

        System.setProperty(DRIVER_PATH_KEY, systemInfo.getChromeDriverPath());
        webDriver = new ChromeDriver(options);
    }

    public void start() throws Exception {
        webDriver.get(systemInfo.getWebsite());
        PageFactory.initElements(webDriver, formPage);

        //processPage();
        processPageInOrder();
    }

    //последовательное заполнение
    private void processPageInOrder() throws InterruptedException {
        //выбор муниципалитета
        try {
            Select select = new Select(formPage.municipality);
            select.selectByVisibleText(utf8Charset(personInfo.getMunicipality()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //нажатие кнопки выбора
        try {
            formPage.municipalityButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //ожидание появления одной большой формы "Данные заявителя"
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-12')]")));

        //заявитель и удостоверение личности
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

        //адреса заявителя

        try {
            clearAndFill(formPage.regionField, systemInfo.getClearSwitch(), personInfo.getRegion());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.districtField, systemInfo.getClearSwitch(), personInfo.getDistrict());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.cityField, systemInfo.getClearSwitch(), personInfo.getCity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.streetField, systemInfo.getClearSwitch(), personInfo.getStreet());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.houseField, systemInfo.getClearSwitch(), personInfo.getHouse());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.apartmentField, systemInfo.getClearSwitch(), personInfo.getApartment());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            clearAndFill(formPage.regionStayField, systemInfo.getClearSwitch(), personInfo.getRegionStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.districtStayField, systemInfo.getClearSwitch(), personInfo.getDistrictStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.cityStayField, systemInfo.getClearSwitch(), personInfo.getCityStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.streetStayField, systemInfo.getClearSwitch(), personInfo.getStreetStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.houseStayField, systemInfo.getClearSwitch(), personInfo.getHouseStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.apartmentStayField, systemInfo.getClearSwitch(), personInfo.getApartmentStay());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Thread.sleep(10000);
        WebDriverWait wait1 = new WebDriverWait(webDriver, 60);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-12')]")));

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
            Select select = new Select(formPage.childDocType);
            select.selectByVisibleText(utf8Charset(childInfo.getChildDocType()));
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


        WebDriverWait wait2 = new WebDriverWait(webDriver, 60);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-12')]")));

        try {
            if (ONE.equals(childInfo.getChildAddressMatch())) formPage.childAddressMatch.click();
        } catch (Exception e) {
            e.printStackTrace();
        }


        WebDriverWait wait3 = new WebDriverWait(webDriver, 60);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-12')]")));


        try {
            clearAndFill(formPage.childRegionField, systemInfo.getClearSwitch(), childInfo.getChildRegion());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childDistrictField, systemInfo.getClearSwitch(), childInfo.getChildDistrict());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childCityField, systemInfo.getClearSwitch(), childInfo.getChildCity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childStreetField, systemInfo.getClearSwitch(), childInfo.getChildStreet());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childHouseField, systemInfo.getClearSwitch(), childInfo.getChildHouse());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childApartmentField, systemInfo.getClearSwitch(), childInfo.getChildApartment());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            clearAndFill(formPage.childRegionStayField, systemInfo.getClearSwitch(), childInfo.getChildRegionStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childDistrictStayField, systemInfo.getClearSwitch(), childInfo.getChildDistrictStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childCityStayField, systemInfo.getClearSwitch(), childInfo.getChildCityStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childStreetStayField, systemInfo.getClearSwitch(), childInfo.getChildStreetStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childHouseStayField, systemInfo.getClearSwitch(), childInfo.getChildHouseStay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clearAndFill(formPage.childApartmentStayField, systemInfo.getClearSwitch(), childInfo.getChildApartmentStay());
        } catch (Exception e) {
            e.printStackTrace();
        }


        WebDriverWait wait4 = new WebDriverWait(webDriver, 60);
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-12')]")));


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


        WebDriverWait wait5 = new WebDriverWait(webDriver, 60);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-12')]")));

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

        WebDriverWait wait6 = new WebDriverWait(webDriver, 60);
        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-12')]")));

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


        WebDriverWait wait7 = new WebDriverWait(webDriver, 60);
        wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-6 col-sm-offset-3')]")));


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

        try {
            formPage.captcha.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void processPage() throws Exception {

        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'col-sm-12')]")));

        ExecutorService es = Executors.newFixedThreadPool(systemInfo.getThreadCount());
        es.execute(new PersonDataThread(formPage, personInfo, systemInfo));
        es.execute(new PersonAddressThread(formPage, personInfo, systemInfo));
        es.execute(new ChildDataThread(formPage, childInfo, systemInfo));
        es.execute(new ChildAddressThread(formPage, childInfo, systemInfo));
        es.execute(new DropDownListThread(formPage, personInfo, childInfo));
        es.shutdown();
        es.awaitTermination(15, TimeUnit.SECONDS);

        try {
            formPage.captcha.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
