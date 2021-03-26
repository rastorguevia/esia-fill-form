package ru.rastorguev.info;

import jfork.nproperty.Cfg;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChildInfo {

    //ДАННЫЕ РЕБЕНКА
    @Cfg("childSurname")
    private String childSurname;
    @Cfg("childName")
    private String childName;
    @Cfg("childPatronymic")
    private String childPatronymic;
    @Cfg("childBirthdate")
    private String childBirthdate;
    @Cfg("childBirthPlace")
    private String childBirthPlace;

    //СВЕДЕНИЯ О ДОКУМЕНТЕ, УДОСТОВЕРЯЮЩЕМ ЛИЧНОСТЬ
    //docType
    @Cfg("childDocSeries")
    private String childDocSeries;
    @Cfg("childDocNumber")
    private String childDocNumber;
    @Cfg("childDocIssuedBy")
    private String childDocIssuedBy;
    @Cfg("childDocIssuedDate")
    private String childDocIssuedDate;
    @Cfg("childActRecordNumber")
    private String childActRecordNumber;

    //АДРЕС МЕСТА ЖИТЕЛЬСТВА
    @Cfg("childRegion")
    private String childRegion;
    @Cfg("childDistrict")
    private String childDistrict;
    @Cfg("childCity")
    private String childCity;
    @Cfg("childStreet")
    private String childStreet;
    @Cfg("childHouse.building.structure")
    private String childHouse;
    @Cfg("childApartment")
    private String childApartment;

    //АДРЕС МЕСТА ПРИБЫВАНИЯ
    @Cfg("childRegionStay")
    private String childRegionStay;
    @Cfg("childDistrictStay")
    private String childDistrictStay;
    @Cfg("childCityStay")
    private String childCityStay;
    @Cfg("childStreetStay")
    private String childStreetStay;
    @Cfg("childHouse.building.structureStay")
    private String childHouseStay;
    @Cfg("childApartmentStay")
    private String childApartmentStay;

}
