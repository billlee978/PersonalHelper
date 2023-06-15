package com.pews;

public class Helper {
    public void healHelper(double weight, double height){
        if (weight <= 0 || height <= 0 || weight >= 300 || height >= 2.5) {
            System.out.println("非法输入!");
            return;
        }

        double BMI =  (weight / (height * height));
        String r = "";

        //根据 bmi 指数范围，来给r重新赋值
        if (BMI < 18.5) {
            r = "过轻";
        } else if (BMI <= 22.9) {
            r = "正常";
        } else if (BMI <= 24.9) {
            r = "偏胖";
        } else if (BMI <= 29.9) {
            r = "肥胖";
        } else if (BMI <= 40) {
            r = "重度肥胖";
        } else {
            r = "极度肥胖";
        }
        //打印最终结果
        System.out.println("您的BMI指数：" + BMI);

        System.out.println("您的体重属于：" + r);
    }
}
