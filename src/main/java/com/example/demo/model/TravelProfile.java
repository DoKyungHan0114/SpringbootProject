package com.example.demo.model;
import jakarta.persistence.Entity;

@Entity
public class TravelProfile extends UserProfile {
    private String destination;
    private double budget;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
