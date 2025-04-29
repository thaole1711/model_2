package case_study.controller;

import java.util.Scanner;

public class EmployeeManagementController {
   private static Scanner scanner = new Scanner(System.in);
    public static void employeeManagement(){
        boolean flag= true;

        do{
            int number=0;
            System.out.println("Employee Management ");
            System.out.println(
                    "\n 1.Display list employess" +
                    "\n 2. Add new employee" +
                    "\n 3. Edit employee" +
                    "\n 4. Return main menu" +
                    "\n chức năng bạn chon là:" );
            try {
                number= scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("nhập số từ 1 đến 4 ");
            }
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
