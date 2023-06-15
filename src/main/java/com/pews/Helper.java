package com.pews;

import java.util.Scanner;

public class Helper {
    public void healHelper(Scanner scanner) {
        double weight;
        double height;
        String sex;

        System.out.print("请输入您的体重(单位为kg): ");
        weight = scanner.nextDouble();
        System.out.print("请输入您的身高(单位为m): ");
        height = scanner.nextDouble();

        if (weight <= 0 || height <= 0 || weight >= 300 || height >= 2.5) {
            System.out.println("非法输入!");
            return;
        }

        System.out.print("请输入您的性别(男 / 女): ");
        sex = scanner.next();

        double BMI = (weight / (height * height));

        if (sex.equals("男")) {
            if (BMI < 20) {
                System.out.println("您的体重过轻！您的BMI值为：" + BMI);
            } else if (BMI < 25 && BMI >= 20) {
                System.out.println("您的体重适中！您的BMI值为：" + BMI);
            } else if (BMI < 30 && BMI >= 25) {
                System.out.println("您的体重过重！您的BMI值为：" + BMI);
            } else if (BMI < 35 && BMI >= 30) {
                System.out.println("您的体重肥胖！您的BMI值为：" + BMI);
            } else {
                System.out.println("您的体重非常肥胖！您的BMI值为：" + BMI);
            }
        } else if (sex.equals("女")) {
            if (BMI < 19) {
                System.out.println("您的体重过轻！您的BMI值为：" + BMI);
            } else if (BMI < 24 && BMI >= 19) {
                System.out.println("您的体重适中！您的BMI值为：" + BMI);
            } else if (BMI < 29 && BMI >= 24) {
                System.out.println("您的体重过重！您的BMI值为：" + BMI);
            } else if (BMI < 34 && BMI >= 29) {
                System.out.println("您的体重肥胖！您的BMI值为：" + BMI);
            } else if (BMI >= 34) {
                System.out.println("您的体重非常肥胖！您的BMI值为：" + BMI);
            }
        } else {
            System.out.println("您的性别输入有误！");
        }
    }
}
