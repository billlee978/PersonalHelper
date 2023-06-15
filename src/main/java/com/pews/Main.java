package com.pews;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        int command = 0;
        while (command != 0) {
            System.out.println("请输入你要使用的功能: ");
            System.out.println("1. 个人健康检测");
            System.out.println("2. 个人收支记录");
            System.out.println("3. 个人行程记录");
            System.out.println("4. 个人生活记录");
            System.out.println("-1. 退出系统");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.print("请输入你的体重(以kg为单位)：");
                    double weight = scanner.nextDouble();
                    System.out.print("请输入你的身高(以m为单位)：");
                    double height = scanner.nextDouble();
                    helper.healHelper(weight, height);
                    break;
                case 4:
                    System.out.print("请输入你的生活事件：");
                    scanner.nextLine();  // Consume newline left-over
                    String event = scanner.nextLine();
                    helper.recordLifeEvent(event);
                    helper.displayLifeEvents();
                    break;
                case -1:
                    System.out.println("感谢使用，祝您生活愉快～");
                    break;
                default:
                    System.out.println("错误输入!");
            }
        }
    }
}