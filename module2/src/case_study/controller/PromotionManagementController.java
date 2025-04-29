package case_study.controller;

import java.util.Scanner;

public class PromotionManagementController {
    public static void promotionManagement(){
        Scanner scanner= new Scanner(System.in);
        boolean flag= true;
        do {
            int number =0;
            System.out.println(" PromotionManagement");
            System.out.println(
                           "\n 1. Display list customers use service" +
                            "\n 2.Display list customers get voucher" +
                            "\n 3. Return main menu" +
                            "\n chức năng bạn chọn là:");
            boolean isNumber = true;
            do{
                try {
                    number = scanner.nextInt();
                    flag =false;
                } catch (NumberFormatException e) {
                    System.out.println("nhập số từ 1 đến 6");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }while(isNumber);
            switch (number){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    flag =false;
                    break;
                default:
                    System.out.println("nhập lại từ 1 đến 4");
            }
        }while (flag);
    }
}
