package case_study.controller;

import case_study.common.ExceptionManagement;

import java.util.Scanner;

public class PromotionController {
    public static void promotionManagement(){
        Scanner scanner= new Scanner(System.in);
        boolean flag= true;
        do {
            int number =0;
            System.out.println(" PromotionManagement");
            System.out.println(
                           "\n 1. Display list customers use service" +
                            "\n 2.Display list customers get voucher" +
                            "\n 3. Return main menu" );
            number= ExceptionManagement.exception(scanner,"chức năng bạn chọn là:");
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
