package ru.rastorguev.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {

    //authorization
    @FindBy(xpath = "//*[contains(@class, 'btn-base small')]")
    public WebElement firstButton;
    @FindBy(xpath = "//*[contains(@id, 'login')]")
    public WebElement loginField;
    @FindBy(xpath = "//*[contains(@id, 'password')]")
    public WebElement passwordField;
    @FindBy(xpath = "//*[contains(@id, 'loginByPwdButton')]")
    public WebElement authButton;

    //person
    @FindBy(xpath = "//*[contains(@id, 'LastName')]")
    public WebElement surnameField;
    @FindBy(xpath = "//*[contains(@id, 'FirstName')]")
    public WebElement nameField;
    @FindBy(xpath = "//*[contains(@id, 'MiddleName')]")
    public WebElement patronymicField;
    @FindBy(xpath = "//*[contains(@id, 'ApplBirthdate')]")
    public WebElement birthdateField;
    @FindBy(xpath = "//*[contains(@id, 'applicantType')]")
    public WebElement applicantType;
    @FindBy(xpath = "//*[contains(@id, 'relType')]")
    public WebElement relationshipType;

    @FindBy(xpath = "//*[contains(@id, 'ApplicantDocumentType')]")
    public WebElement docType;
    @FindBy(xpath = "//*[contains(@id, 'Series')]")
    public WebElement docSeriesField;
    @FindBy(xpath = "//*[contains(@id, 'Number')]")
    public WebElement docNumberField;
    @FindBy(xpath = "//*[contains(@id, 'Issued')]")
    public WebElement docIssuedByField;
    @FindBy(xpath = "//*[contains(@id, 'AppDocDate')]")
    public WebElement docIssuedDateField;
    @FindBy(xpath = "//*[contains(@id, 'ExpiryDate')]")
    public WebElement docValidUntilField;
    @FindBy(xpath = "//*[contains(@id, 'UnitCode')]")
    public WebElement departmentCodeField;

    //person address
    @FindBy(xpath = "//*[contains(@id, 'regARegion')]")
    public WebElement regionField;
    @FindBy(xpath = "//*[contains(@id, 'regADistrict')]")
    public WebElement districtField;
    @FindBy(xpath = "//*[contains(@id, 'regACity')]")
    public WebElement cityField;
    @FindBy(xpath = "//*[contains(@id, 'regAStreet')]")
    public WebElement streetField;
    @FindBy(xpath = "//*[contains(@id, 'regAHouse')]")
    public WebElement houseField;
    @FindBy(xpath = "//*[contains(@id, 'regAFlat')]")
    public WebElement apartmentField;
    @FindBy(xpath = "//*[contains(@id, 'resiARegion')]")
    public WebElement regionStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiADistrict')]")
    public WebElement districtStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiACity')]")
    public WebElement cityStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiAStreet')]")
    public WebElement streetStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiAHouse')]")
    public WebElement houseStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiAFlat')]")
    public WebElement apartmentStayField;

    //contact information
    @FindBy(xpath = "//*[contains(@id, 'email')]")
    public WebElement email;
    @FindBy(xpath = "//*[contains(@id, 'phone')]")
    public WebElement phone;

    //child
    @FindBy(xpath = "//*[contains(@id, 'childLastName')]")
    public WebElement childSurnameField;
    @FindBy(xpath = "//*[contains(@id, 'childFirstName')]")
    public WebElement childNameField;
    @FindBy(xpath = "//*[contains(@id, 'childMiddleName')]")
    public WebElement childPatronymicField;
    @FindBy(xpath = "//*[contains(@id, 'ChildBirthdate')]")
    public WebElement childBirthdateField;
    @FindBy(xpath = "//*[contains(@id, 'childBirthPlace')]")
    public WebElement childBirthPlaceField;

    @FindBy(xpath = "//*[contains(@id, 'ChildDocumentType')]")
    public WebElement childDocType;
    @FindBy(xpath = "//*[contains(@id, 'ChildDocSeries')]")
    public WebElement childDocSeriesField;
    @FindBy(xpath = "//*[contains(@id, 'ChildDocNumber')]")
    public WebElement childDocNumberField;
    @FindBy(xpath = "//*[contains(@id, 'ChildDocNumberIssued')]")
    public WebElement childDocIssuedByField;
    @FindBy(xpath = "//*[contains(@id, 'ChildDocDate')]")
    public WebElement childDocIssuedDateField;
    @FindBy(xpath = "//*[contains(@id, 'ChildActEntry')]")
    public WebElement childActRecordNumberField;

    @FindBy(xpath = "//*[contains(@id, 'AddrSame')]")
    public WebElement childAddressMatch;

    //child address
    @FindBy(xpath = "//*[contains(@id, 'regRegion')]")
    public WebElement childRegionField;
    @FindBy(xpath = "//*[contains(@id, 'regDistrict')]")
    public WebElement childDistrictField;
    @FindBy(xpath = "//*[contains(@id, 'regCity')]")
    public WebElement childCityField;
    @FindBy(xpath = "//*[contains(@id, 'regStreet')]")
    public WebElement childStreetField;
    @FindBy(xpath = "//*[contains(@id, 'regHouse')]")
    public WebElement childHouseField;
    @FindBy(xpath = "//*[contains(@id, 'regFlat')]")
    public WebElement childApartmentField;
    @FindBy(xpath = "//*[contains(@id, 'resiRegion')]")
    public WebElement childRegionStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiDistrict')]")
    public WebElement childDistrictStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiCity')]")
    public WebElement childCityStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiStreet')]")
    public WebElement childStreetStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiHouse')]")
    public WebElement childHouseStayField;
    @FindBy(xpath = "//*[contains(@id, 'resiFlat')]")
    public WebElement childApartmentStayField;

    @FindBy(xpath = "//*[contains(@id, 'NeedAdapted')]")
    public WebElement childSpecialConditions;
    @FindBy(xpath = "//*[contains(@id, 'AgreeLeanAdaptedEP')]")
    public WebElement childAdaptedEducational;
    @FindBy(xpath = "//*[contains(@id, 'IsHaveChildPrivilege')]")
    public WebElement childPreferentialRightToStudy;

    @FindBy(xpath = "//*[contains(@id, 'AgreeHavePersonData')]")
    public WebElement agreement;
    @FindBy(xpath = "//*[contains(@id, 'LicenseAggrement')]")
    public WebElement confirmOrder;

    @FindBy(xpath = "//*[contains(@ng-model, 'choisedMu')]")
    public WebElement municipality;
    @FindBy(xpath = "//*[contains(@ng-click, 'submitChoise(choisedMu)')]")
    public WebElement municipalityButton;

    @FindBy(xpath = "//*[contains(@id, 'langs')]")
    public WebElement educationLanguage;
    @FindBy(xpath = "//*[contains(@id, 'leanlang')]")
    public WebElement nativeLanguage;

    @FindBy(xpath = "//*[contains(@id, 'Privilege')]")
    public WebElement rebate;

    @FindBy(xpath = "//*[contains(@id, 'school')]")
    public WebElement organization;
    @FindBy(xpath = "//*[contains(@id, 'schoolgroup')]")
    public WebElement grade;

    @FindBy(xpath = "//*[contains(@ng-model, 'userInput')]")
    public WebElement captcha;

}
