package case_study.controller;

import case_study.common.ExceptionManagement;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    public static void facilityManagement(){
        boolean flag= true;

        do{
            int number=0;
            System.out.println("FacilityManagement ");
            System.out.println(
                           "\n 1.Display list facility" +
                            "\n 2. Add new facility" +
                            "\n 3. Display list facility maintenance" +
                            "\n 4. Return main menu"
                             );
           number= ExceptionManagement.exception(scanner," chức năng bạn chon là:");
            switch (number){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    flag= false;
                    break;
                default:
                    System.out.println("nhập lại từ 1 đến 4");
            }
        }while (flag);
    }
}
