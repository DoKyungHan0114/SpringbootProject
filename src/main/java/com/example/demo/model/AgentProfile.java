package com.example.demo.model;

import jakarta.persistence.Entity;


@Entity
public class AgentProfile extends UserProfile {
    private String agencyName;
    private int numberOfClients;

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }
}