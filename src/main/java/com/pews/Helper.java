package com.pews;

public class Helper {
    public String healHelper(double weight, double height){
        return "Your BMI is: " + (weight / (height * height));
    }
}
