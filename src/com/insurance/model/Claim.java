package com.insurance.model;

public class Claim {

    //create fields
    private String claimNumber;
    private String dateField;
    private String description;
    private String state;
    private double amount;
    private String dateResolved;
    private String policyNumber;

    public Claim(String claimNumber, String dateField, String description, String state, double amount, String dateResolved, String policyNumber) {
        this.claimNumber = claimNumber;
        this.dateField = dateField;
        this.description = description;
        this.state = state;
        this.amount = amount;
        this.dateResolved = dateResolved;
        this.policyNumber = policyNumber;
    }



    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getDateField() {
        return dateField;
    }

    public void setDateField(String dateField) {
        this.dateField = dateField;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDateResolved() {
        return dateResolved;
    }

    public void setDateResolved(String dateResolved) {
        this.dateResolved = dateResolved;
    }
}
