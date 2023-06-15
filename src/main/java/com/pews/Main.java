package com.pews;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        System.out.println("请输入你要使用的功能: ");
        System.out.println("1. 个人健康检测");
        System.out.println("2. 个人收支记录");
        System.out.println("3. 个人行程记录");
        System.out.println("4. 个人生活记录");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.print("请输入你的体重：");
                double weight = scanner.nextDouble();
                System.out.print("请输入你的身高：");
                double height = scanner.nextDouble();
                System.out.println(helper.healHelper(weight, height));
            default:
                System.out.println("错误输入!");
        }
    }
}