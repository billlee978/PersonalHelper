package com.pews;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    private MoneyHelper moneyHelper = new MoneyHelper();
    List<LifeEvent> lifeEvents = new ArrayList<>();

    public String  healHelper(double weight, double height) {
        // 23n - 18e + 2 = 7
        if (weight <= 0 || weight>= 300) {
            return "体重值不合法！";
        }
        if (height <= 0 || height >= 2.5) {
            return "身高值不合法！";
        }

        double BMI = (weight / (height * height));

        if (BMI < 20) {
            return String.format ("您的体重过轻！您的 BMI 值为：%.2f", BMI);
        } else if (BMI < 25) {
            return String.format ("您的体重适中！您的 BMI 值为：%.2f", BMI);
        } else if (BMI < 30) {
            return String.format ("您的体重过重！您的 BMI 值为：%.2f", BMI);
        } else if (BMI < 35) {
            return String.format ("您的体重肥胖！您的 BMI 值为：%.2f", BMI);
        } else {
            return String.format ("您的体重非常肥胖！您的 BMI 值为：%.2f", BMI);
        }
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
