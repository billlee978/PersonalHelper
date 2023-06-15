package com.pews;


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
                    helper.healHelper(scanner);
                    break;
                case 2:
                    helper.moneyHelper();
                case 3:
                    System.out.println("请输入你要使用的功能:");
                    System.out.println("1.查询记录");
                    System.out.println("2.新增记录");
                    System.out.println("3.删除记录");
                    System.out.println("-1. 退出功能");
                    int command3 = scanner.nextInt();
                    switch (command3){
                        case 1:
                            for (Journey journey : journeyFunction.getJourneys()){
                                System.out.println(journey.toString());
                            }
                            break;
                        case 2:
                            System.out.println("请输入日期（如2023年4月13日输入230413）：");
                            int date = scanner.nextInt();
                            System.out.println("请输入地点：");
                            String position = scanner.nextLine();
                            journeyFunction.journey(date, position);
                            break;
                        case 3:
                            System.out.println("请输入日期（如2023年4月13日输入230413）：");
                            int deleteDate = scanner.nextInt();
                            System.out.println("请输入地点：");
                            String deletePosition = scanner.nextLine();
                            journeyFunction.delete(deleteDate, deletePosition);
                            break;
                        case -1:
                            break;
                        default:
                            System.out.println("错误输入!");
                    }
                case -1:
                    System.out.println("感谢使用，祝您生活愉快～");
                    break;
                default:
                    System.out.println("错误输入!");
            }
        }
    }
}