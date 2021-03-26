package ru.rastorguev.bootstrap;

import jfork.nproperty.ConfigParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.rastorguev.info.BrowserInfo;
import ru.rastorguev.info.PersonInfo;

import java.nio.charset.StandardCharsets;

import static ru.rastorguev.constant.Constant.*;
import static ru.rastorguev.util.Utils.*;

public class Bootstrap {

    private WebDriver webDriver;
    private PersonInfo personInfo;
    private BrowserInfo browserInfo;

    @FindBy(xpath = "//*[contains(@id, 'LastName')]")
    private WebElement surnameField;

    @FindBy(xpath = "//*[contains(@id, 'FirstName')]")
    private WebElement nameField;

    @FindBy(xpath = "//*[contains(@id, 'MiddleName')]")
    private WebElement patronymicField;

    @FindBy(xpath = "//*[contains(@id, 'ApplBirthdate')]")
    private WebElement birthdateField;



    @FindBy(xpath = "//*[contains(@id, 'Series')]")
    private WebElement docSeriesField;

    @FindBy(xpath = "//*[contains(@id, 'Number')]")
    private WebElement docNumberField;

    @FindBy(xpath = "//*[contains(@id, 'Issued')]")
    private WebElement docIssuedByField;

    @FindBy(xpath = "//*[contains(@id, 'AppDocDate')]")
    private WebElement docIssuedDateField;

    @FindBy(xpath = "//*[contains(@id, 'ExpiryDate')]")
    private WebElement docValidUntilField;

    @FindBy(xpath = "//*[contains(@id, 'UnitCode')]")
    private WebElement departmentCodeField;



    @FindBy(xpath = "//*[contains(@id, 'regARegion')]")
    private WebElement regionField;

    @FindBy(xpath = "//*[contains(@id, 'regADistrict')]")
    private WebElement districtField;

    @FindBy(xpath = "//*[contains(@id, 'regACity')]")
    private WebElement cityField;

    @FindBy(xpath = "//*[contains(@id, 'regAStreet')]")
    private WebElement streetField;

    @FindBy(xpath = "//*[contains(@id, 'regAHouse')]")
    private WebElement houseField;

    @FindBy(xpath = "//*[contains(@id, 'regAFlat')]")
    private WebElement apartmentField;



    @FindBy(xpath = "//*[contains(@id, 'resiARegion')]")
    private WebElement regionStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiADistrict')]")
    private WebElement districtStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiACity')]")
    private WebElement cityStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiAStreet')]")
    private WebElement streetStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiAHouse')]")
    private WebElement houseStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiAFlat')]")
    private WebElement apartmentStayField;



    public Bootstrap() throws Exception {
        init();
    }

    public void start() throws Exception {
        openPageInitElements();
        processPage();
    }

    private void processPage() throws Exception {

       // webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //WebDriverWait wait = new WebDriverWait(webDriver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'form-group')]")));


        surnameField.sendKeys(utf8Charset(personInfo.getSurname()));
        nameField.sendKeys(utf8Charset(personInfo.getName()));
        patronymicField.sendKeys(utf8Charset(personInfo.getPatronymic()));
        birthdateField.sendKeys(utf8Charset(personInfo.getBirthdate()));
        //applicantType
        //relationshipType

        //docType
        docSeriesField.sendKeys(utf8Charset(personInfo.getDocSeries()));
        docNumberField.sendKeys(utf8Charset(personInfo.getDocNumber()));
        docIssuedByField.sendKeys(utf8Charset(personInfo.getDocIssuedBy()));
        docIssuedDateField.sendKeys(utf8Charset(personInfo.getDocIssuedDate()));
        docValidUntilField.sendKeys(utf8Charset(personInfo.getDocValidUntil()));
        departmentCodeField.sendKeys(utf8Charset(personInfo.getDepartmentCode()));

        regionField.sendKeys(utf8Charset(personInfo.getRegion()));
        districtField.sendKeys(utf8Charset(personInfo.getDistrict()));
        cityField.sendKeys(utf8Charset(personInfo.getCity()));
        streetField.sendKeys(utf8Charset(personInfo.getStreet()));
        houseField.sendKeys(utf8Charset(personInfo.getHouse()));
        apartmentField.sendKeys(utf8Charset(personInfo.getApartment()));

        regionStayField.sendKeys(utf8Charset(personInfo.getRegionStay()));
        districtStayField.sendKeys(utf8Charset(personInfo.getDistrictStay()));
        cityStayField.sendKeys(utf8Charset(personInfo.getCityStay()));
        streetStayField.sendKeys(utf8Charset(personInfo.getStreetStay()));
        houseStayField.sendKeys(utf8Charset(personInfo.getHouseStay()));
        apartmentStayField.sendKeys(utf8Charset(personInfo.getApartmentStay()));




    }

    private void init() throws Exception {
        browserInfo = new BrowserInfo();
        ConfigParser.parse(browserInfo, "info.ini");

        personInfo = new PersonInfo();
        ConfigParser.parse(personInfo, "info.ini");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

//        options.addArguments("--no-sandbox");
//        options.addArguments("--headless");
//        options.addArguments("--no-proxy-server");
//        options.addArguments("--disable-gpu");
//        options.addArguments("disable-infobars");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--disable-dev-shm-usage");

        System.setProperty(DRIVER_PATH_KEY, browserInfo.getChromeDriverPath());
        webDriver = new ChromeDriver(options);
    }

    private void openPageInitElements() {
        webDriver.get(browserInfo.getWebsite());
        PageFactory.initElements(webDriver, this);
    }

}
