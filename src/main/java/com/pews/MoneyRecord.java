package com.pews;

public class MoneyRecord {
    private String description;
    private double amount;

    public MoneyRecord() {
    }

    public MoneyRecord(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
