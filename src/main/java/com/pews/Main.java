package com.pews;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        JourneyFunction journeyFunction = new JourneyFunction();
        int command = 0;
        while (command != -1) {
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
                    System.out.print("请输入您的体重(单位为kg): ");
                    double weight = scanner.nextDouble();
                    System.out.print("请输入您的身高(单位为m): ");
                    double height = scanner.nextDouble();
                    System.out.println(helper.healHelper(weight, height));
                    break;
                case 2:
                    helper.moneyHelper();
                    break;
                case 3:
                    int command3 = 999;
                    while (command3 != -1){
                        System.out.println("请输入你要使用的功能:");
                        System.out.println("1.查询记录");
                        System.out.println("2.新增记录");
                        System.out.println("3.删除记录");
                        System.out.println("-1. 退出功能");
                        command3 = scanner.nextInt();
                        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                        switch (command3) {
                            case 1:
                                for (Journey journey : journeyFunction.getJourneys()) {
                                    System.out.println(journey.toString());
                                }
                                break;
                            case 2:
                                int flag2 = 0;
                                Date t = null;
                                while (flag2 == 0){
                                    System.out.println("请输入日期（如2023年4月13日输入2023-04-13）：");
                                    String date = scanner.next();
                                    try {
                                        t = ft.parse(date);
                                        flag2 = 1;
                                    } catch (ParseException e){
                                        System.out.println("格式错误，请重新输入！");
                                    }
                                }
                                System.out.println("请输入地点：");
                                String position = scanner.next();
                                journeyFunction.journey(t, position);
                                break;
                            case 3:
                                int flag3 = 0;
                                Date deleteDate = null;
                                while (flag3 == 0){
                                    System.out.println("请输入日期（如2023年4月13日输入2023-04-13）：");
                                    String date = scanner.next();
                                    try {
                                        deleteDate = ft.parse(date);
                                        flag3 = 1;
                                    } catch (ParseException e){
                                        System.out.println("格式错误，请重新输入！");
                                    }
                                }
                                System.out.println("请输入地点：");
                                String deletePosition = scanner.next();
                                journeyFunction.delete(deleteDate, deletePosition);
                                break;
                            case -1:
                                break;
                            default:
                                System.out.println("错误输入!");
                                break;
                        }
                    }
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
                    break;
            }
        }
    }
}