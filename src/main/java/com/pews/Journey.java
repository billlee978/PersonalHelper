package com.pews;

public class Journey {
    private String date;
    private String position;

    public Journey(String date, String position) {
        this.date = date;
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
                "date=" + date.substring(0, 2) + "年" +
                date.substring(2, 4) + "月" +
                date.substring(4) + "日" +
                ", position='" + position + '\'' +
                '}';
    }
}
