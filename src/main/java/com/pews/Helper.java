package com.pews;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    private MoneyHelper moneyHelper = new MoneyHelper();
    List<LifeEvent> lifeEvents = new ArrayList<>();

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

    public void moneyHelper() {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要使用的功能: ");
            System.out.println("1. 显示收入记录");
            System.out.println("2. 显示支出记录");
            System.out.println("3. 添加收入记录");
            System.out.println("4. 添加支出记录");
            System.out.println("5. 显示当前余额");
            System.out.println("-1. 返回上一级目录");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    moneyHelper.showIncomeRecord();
                    break;
                case 2:
                    moneyHelper.showConsumeRecord();
                    break;
                case 3:
                    moneyHelper.addIncomeRecord();
                    break;
                case 4:
                    moneyHelper.addConsumeRecord();
                    break;
                case 5:
                    moneyHelper.showBalance();
                    break;
                case -1:
                    return;
                default:
                    System.out.println("错误输入!");
                    break;
            }
        }
    }
}
