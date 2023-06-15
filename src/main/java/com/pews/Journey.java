package com.pews;

public class Journey {
    private int date;
    private String position;

    public Journey(int date, String position) {
        this.date = date;
        this.position = position;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Journey{" +
                "date=" + date +
                ", position='" + position + '\'' +
                '}';
    }
}
