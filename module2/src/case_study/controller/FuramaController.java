package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag =true;
        do {
            int number=0;
            System.out.println("CHỨC NĂNG CHƯƠNG TRÌNH");
            System.out.println("lựa chọn chức năng:" +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. exit" +
                    "\n chức năng bạn chọn là:");

            boolean isNumber = true;
            do{
                try {
                    number = Integer.parseInt(scanner.nextLine());
                    isNumber =false;
                } catch (NumberFormatException e) {
                    System.out.println("nhập số từ 1 đến 6");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }while(isNumber);

            switch (number) {
                case 1:
                    EmployeeManagementController.employeeManagement();
                    break;
                case 2:
                    CustomerManagementController.customerManagement();
                    break;
                case 3:
                    FacilityManagementController.facilityManagement();
                    break;
                case 4:
                    BookingManagementController.bookingManagement();
                    break;
                case 5:
                    PromotionManagementController.promotionManagement();
                    break;
                case 6:
                    System.out.println("thoát chương trình");
                    flag = false;
                    break;
                default:
                    System.out.println("nhập lại từ 1 đến 6");
            }
        } while (flag);
    }

}
