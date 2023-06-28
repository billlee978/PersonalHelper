package com.pews;

import java.util.ArrayList;
import java.util.Date;

public class JourneyFunction {
    private ArrayList<Journey> journeys = new ArrayList<Journey>();

    public ArrayList<Journey> getJourneys(){
        return journeys;
    }
    public void journey(Date date, String position){
        journeys.add(new Journey(date, position));
    }

    public void delete(Date date, String position){
        journeys.removeIf(journey -> journey.getDate().equals(date) && journey.getPosition().equals(position));
    }

}
