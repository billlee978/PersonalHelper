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
        String string = Integer.toString(date);
        if (date < 100000){
            string = "0" + date;
        }
        return "Journey{" +
                "date=" + string.substring(0, 2) + "年" +
                string.substring(2, 4) + "月" +
                string.substring(4) + "日" +
                ", position='" + position + '\'' +
                '}';
    }
}
