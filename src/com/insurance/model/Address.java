package com.insurance.model;

public class Address {
    private int buildingNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;
    private String country;

    public Address(int buildingNumber, String streetName, String city, String state, int zipCode, String country) {
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    //Policy p1 = new Policy(101,"1011","Health Insurance",50000.0,50.0,"2022-10-10","2023-10-10","Active",true);
    //policyMap.put(101, p1); Deepak??
    //try new code
    //added new method
    //added new search functionality
    //added new update address functionality

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
