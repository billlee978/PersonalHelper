package com.pews;

import java.util.ArrayList;

public class JourneyFunction {
    private ArrayList<Journey> journeys = new ArrayList<Journey>();

    public ArrayList<Journey> getJourneys(){
        return journeys;
    }
    public void journey(int date, String position){
        journeys.add(new Journey(date, position));
    }

    public void delete(int date, String position){
        journeys.remove(new Journey(date, position));
    }

}
