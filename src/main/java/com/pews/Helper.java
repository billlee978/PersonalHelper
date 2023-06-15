package com.pews;

import java.util.Scanner;

public class Helper {
    private MoneyHelper moneyHelper = new MoneyHelper();

    public void healHelper(double weight, double height) {
        double BMI = (weight / (height * height));
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
