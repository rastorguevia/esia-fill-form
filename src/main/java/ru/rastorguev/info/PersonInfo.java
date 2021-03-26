package ru.rastorguev.info;

import jfork.nproperty.Cfg;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PersonInfo {

    //ЗАЯВИТЕЛЬ
    @Cfg("surname")
    private String surname;
    @Cfg("name")
    private String name;
    @Cfg("patronymic")
    private String patronymic;
    @Cfg("birthdate")
    private String birthdate;
    //applicantType
    //relationshipType

    //УДОСТОВЕРЕНИЕ ЛИЧНОСТИ
    //docType
    @Cfg("docSeries")
    private String docSeries;
    @Cfg("docNumber")
    private String docNumber;
    @Cfg("docIssuedBy")
    private String docIssuedBy;
    @Cfg("docIssuedDate")
    private String docIssuedDate;
    @Cfg("docValidUntil")
    private String docValidUntil;
    @Cfg("departmentCode")
    private String departmentCode;

    //АДРЕС МЕСТА ЖИТЕЛЬСТВА
    @Cfg("region")
    private String region;
    @Cfg("district")
    private String district;
    @Cfg("city")
    private String city;
    @Cfg("street")
    private String street;
    @Cfg("house.building.structure")
    private String house;
    @Cfg("apartment")
    private String apartment;

    //АДРЕС МЕСТА ПРИБЫВАНИЯ
    @Cfg("regionStay")
    private String regionStay;
    @Cfg("districtStay")
    private String districtStay;
    @Cfg("cityStay")
    private String cityStay;
    @Cfg("streetStay")
    private String streetStay;
    @Cfg("house.building.structureStay")
    private String houseStay;
    @Cfg("apartmentStay")
    private String apartmentStay;

}
