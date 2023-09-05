package com.insurance.model;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String phone;

    public Customer(String customerId, String firstName, String lastName, String dateOfBirth, String email, String phone, String customerName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
    }

    //Policy p1 = new Policy(101,"1011","Health Insurance",50000.0,50.0,"2022-10-10","2023-10-10","Active",true);
    //policyMap.put(101, p1); Deepak??
    //try new code
    //added new method
    //added new search functionality
    //added new update address functionality
    //Policy p1 = new Policy(101,"1011","Health Insurance",50000.0,50.0,"2022-10-10","2023-10-10","Active",true);
    //policyMap.put(101, p1); Deepak??
    //try new code
    //added new method
    //added new search functionality
    //added new update address functionality
    //Policy p1 = new Policy(101,"1011","Health Insurance",50000.0,50.0,"2022-10-10","2023-10-10","Active",true);
    //policyMap.put(101, p1); Deepak??
    //try new code
    //added new method
    //added new search functionality
    //added new update address functionality


    //Policy p1 = new Policy(101,"1011","Health Insurance",50000.0,50.0,"2022-10-10","2023-10-10","Active",true);
    //policyMap.put(101, p1); Deepak??
    //try new code
    //added new method
    //added new search functionality
    //added new update address functionality
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
