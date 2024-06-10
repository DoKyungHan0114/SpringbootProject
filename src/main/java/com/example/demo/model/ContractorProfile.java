package com.example.demo.model;


import jakarta.persistence.Entity;

@Entity
public class ContractorProfile extends UserProfile {
    private String contractType;
    private double hourlyRate;

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

