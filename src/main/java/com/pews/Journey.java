package com.pews;

import java.util.Date;

public class Journey {
    private Date date;
    private String position;

    public Journey(Date date, String position) {
        this.date = date;
        this.position = position;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
        String str = String.format("%tF", date);
        return "Journey{" +
                "date=" + str +
                ", position='" + position + '\'' +
                '}';
    }
}
