package com.pews;

import java.util.ArrayList;
import java.util.List;

public class Helper {
    List<LifeEvent> lifeEvents = new ArrayList<>();

    public void healHelper(double weight, double height){
        // ... (keep your original healHelper function)
    }

    public void recordLifeEvent(String eventDescription) {
        lifeEvents.add(new LifeEvent(eventDescription));
        System.out.println("生活事件已保存。");
    }

    public void displayLifeEvents() {
        System.out.println("你的生活事件：");
        for (LifeEvent event : lifeEvents) {
            System.out.println(event.description);
        }
    }
}
