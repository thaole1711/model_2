package case_study.controller;

import case_study.common.ExceptionManagement;

import java.util.Scanner;

public class CustomerController {
    public static void customerManagement(){
        Scanner scanner= new Scanner(System.in);
        boolean flag= true;

        do {
            int number=0;
            System.out.println("Customer Management");
            System.out.println(
                            "\n 1. Display list customers" +
                            "\n 2. Add new customer" +
                            "\n 3. Edit customer" +
                            "\n 4. Return main menu"
                           );
         number= ExceptionManagement.exception(scanner, "\n chức năng bạn chọn là:");
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
