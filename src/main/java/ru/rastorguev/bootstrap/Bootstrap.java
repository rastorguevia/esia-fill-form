package ru.rastorguev.bootstrap;

import jfork.nproperty.ConfigParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.rastorguev.info.BrowserInfo;
import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.info.PersonInfo;

import static ru.rastorguev.constant.Constant.*;
import static ru.rastorguev.util.Utils.*;

public class Bootstrap {

    private WebDriver webDriver;
    private PersonInfo personInfo;
    private ChildInfo childInfo;
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


    @FindBy(xpath = "//*[contains(@id, 'email')]")
    private WebElement email;

    @FindBy(xpath = "//*[contains(@id, 'phone')]")
    private WebElement phone;




    @FindBy(xpath = "//*[contains(@id, 'childLastName')]")
    private WebElement childSurnameField;

    @FindBy(xpath = "//*[contains(@id, 'childFirstName')]")
    private WebElement childNameField;

    @FindBy(xpath = "//*[contains(@id, 'childMiddleName')]")
    private WebElement childPatronymicField;

    @FindBy(xpath = "//*[contains(@id, 'ChildBirthdate')]")
    private WebElement childBirthdateField;

    @FindBy(xpath = "//*[contains(@id, 'childBirthPlace')]")
    private WebElement childBirthPlaceField;


    @FindBy(xpath = "//*[contains(@id, 'ChildDocSeries')]")
    private WebElement childDocSeriesField;

    @FindBy(xpath = "//*[contains(@id, 'ChildDocNumber')]")
    private WebElement childDocNumberField;

    @FindBy(xpath = "//*[contains(@id, 'ChildDocNumberIssued')]")
    private WebElement childDocIssuedByField;

    @FindBy(xpath = "//*[contains(@id, 'ChildDocDate')]")
    private WebElement childDocIssuedDateField;

    @FindBy(xpath = "//*[contains(@id, 'ChildActEntry')]")
    private WebElement childActRecordNumberField;


    @FindBy(xpath = "//*[contains(@id, 'regRegion')]")
    private WebElement childRegionField;

    @FindBy(xpath = "//*[contains(@id, 'regDistrict')]")
    private WebElement childDistrictField;

    @FindBy(xpath = "//*[contains(@id, 'regCity')]")
    private WebElement childCityField;

    @FindBy(xpath = "//*[contains(@id, 'regStreet')]")
    private WebElement childStreetField;

    @FindBy(xpath = "//*[contains(@id, 'regHouse')]")
    private WebElement childHouseField;

    @FindBy(xpath = "//*[contains(@id, 'regFlat')]")
    private WebElement childApartmentField;



    @FindBy(xpath = "//*[contains(@id, 'resiRegion')]")
    private WebElement childRegionStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiDistrict')]")
    private WebElement childDistrictStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiCity')]")
    private WebElement childCityStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiStreet')]")
    private WebElement childStreetStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiHouse')]")
    private WebElement childHouseStayField;

    @FindBy(xpath = "//*[contains(@id, 'resiFlat')]")
    private WebElement childApartmentStayField;


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


        //TODO сделать очистку полей перед записью
        //TODO выбор галочек
        //TODO выбор муниципалитета?
        //TODO сделать выбор выпадающих списков
        //TODO сделать проверку на то что если поле в файле не заполнено - не заполнять форму


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

        childSurnameField.sendKeys(utf8Charset(childInfo.getChildSurname()));
        childNameField.sendKeys(utf8Charset(childInfo.getChildName()));
        childPatronymicField.sendKeys(utf8Charset(childInfo.getChildPatronymic()));
        childBirthdateField.sendKeys(utf8Charset(childInfo.getChildBirthdate()));
        childBirthPlaceField.sendKeys(utf8Charset(childInfo.getChildBirthPlace()));

        childDocSeriesField.sendKeys(utf8Charset(childInfo.getChildDocSeries()));
        childDocNumberField.sendKeys(utf8Charset(childInfo.getChildDocNumber()));
        childDocIssuedByField.sendKeys(utf8Charset(childInfo.getChildDocIssuedBy()));
        childDocIssuedDateField.sendKeys(utf8Charset(childInfo.getChildDocIssuedDate()));
        childActRecordNumberField.sendKeys(utf8Charset(childInfo.getChildActRecordNumber()));

        childRegionField.sendKeys(utf8Charset(childInfo.getChildRegion()));
        childDistrictField.sendKeys(utf8Charset(childInfo.getChildDistrict()));
        childCityField.sendKeys(utf8Charset(childInfo.getChildCity()));
        childStreetField.sendKeys(utf8Charset(childInfo.getChildStreet()));
        childHouseField.sendKeys(utf8Charset(childInfo.getChildHouse()));
        childApartmentField.sendKeys(utf8Charset(childInfo.getChildApartment()));

        childRegionStayField.sendKeys(utf8Charset(childInfo.getChildRegionStay()));
        childDistrictStayField.sendKeys(utf8Charset(childInfo.getChildDistrictStay()));
        childCityStayField.sendKeys(utf8Charset(childInfo.getChildCityStay()));
        childStreetStayField.sendKeys(utf8Charset(childInfo.getChildStreetStay()));
        childHouseStayField.sendKeys(utf8Charset(childInfo.getChildHouseStay()));
        childApartmentStayField.sendKeys(utf8Charset(childInfo.getChildApartmentStay()));

        email.sendKeys(utf8Charset(personInfo.getEmail()));
        phone.sendKeys(utf8Charset(personInfo.getPhone()));

    }

    private void init() throws Exception {
        browserInfo = new BrowserInfo();
        ConfigParser.parse(browserInfo, "info.ini");

        personInfo = new PersonInfo();
        ConfigParser.parse(personInfo, "info.ini");

        childInfo = new ChildInfo();
        ConfigParser.parse(childInfo, "info.ini");

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
