package com.insurance.model;

import java.util.UUID;

public class Policy {
  private String policyId;
  private String customerId;
  private String policyType;
  private double coverageAmount;
  private double premiumAmount;
  private String startDate;
  private String endDate;
  private String status;
  private boolean isClaimed;

    public Policy(String customerId, String policyType, double coverageAmount,
                  double premiumAmount, String startDate, String endDate, String status, boolean isClaimed) {
        this.policyId = String.valueOf(UUID.randomUUID()) ;
        this.customerId = customerId;
        this.policyType = policyType;
        this.coverageAmount = coverageAmount;
        this.premiumAmount = premiumAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.isClaimed = isClaimed;
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
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isClaimed() {
        return isClaimed;
    }

    public void setClaimed(boolean claimed) {
        isClaimed = claimed;
    }
}
