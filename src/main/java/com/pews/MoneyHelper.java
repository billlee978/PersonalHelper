package com.pews;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyHelper {
    private double balance = 10000;
    private ArrayList<MoneyRecord> moneyIncomeRecordArrayList = new ArrayList<>();
    private ArrayList<MoneyRecord> moneyConsumeRecordArrayList = new ArrayList<>();

    public void addIncomeRecord() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String description;
            double amount = 0;
            System.out.println("输入收入描述：");
            description = sc.nextLine();
            if (description == null) {
                System.out.println("描述不能为空");
                continue;
            } else {
                System.out.println("输入收入金额：");
                amount = sc.nextDouble();
                if (amount <= 0) {
                    System.out.println("输入的金额有误");
                    continue;
                }
            }
            balance += amount;
            moneyIncomeRecordArrayList.add(new MoneyRecord(description, amount));
            System.out.println("添加成功");
            return;
        }
    }

    public void addConsumeRecord() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String description;
            double amount = 0;
            System.out.println("输入支出描述：");
            description = sc.nextLine();
            if (description == null) {
                System.out.println("描述不能为空");
                continue;
            } else {
                System.out.println("输入支出金额：");
                amount = sc.nextDouble();
                if (amount <= 0) {
                    System.out.println("输入的金额有误");
                    continue;
                }
            }
            balance -= amount;
            moneyConsumeRecordArrayList.add(new MoneyRecord(description, amount));
            System.out.println("添加成功");
            return;
        }
    }

    public void showIncomeRecord() {
        if (moneyIncomeRecordArrayList.size() == 0) {
            System.out.println("当前没有收入记录");
            return;
        }
        System.out.println("收入记录：");
        for (int i = 0; i < moneyIncomeRecordArrayList.size(); i++) {
            System.out.println("----------" + (i + 1) + "----------");
            System.out.println("描述：" + moneyIncomeRecordArrayList.get(i).getDescription());
            System.out.println("收入: " + moneyIncomeRecordArrayList.get(i).getAmount());
        }
    }

    public void showConsumeRecord() {
        if (moneyConsumeRecordArrayList.size() == 0) {
            System.out.println("当前没有支出记录");
            return;
        }
        System.out.println("支出记录：");
        for (int i = 0; i < moneyConsumeRecordArrayList.size(); i++) {
            System.out.println("----------" + (i + 1) + "----------");
            System.out.println("描述：" + moneyConsumeRecordArrayList.get(i).getDescription());
            System.out.println("收入: " + moneyConsumeRecordArrayList.get(i).getAmount());
        }
    }

    public void showBalance() {
        if (balance < 0) {
            System.out.println("当前已透支");
            return;
        }
        System.out.println("余额：" + balance);
    }
}
