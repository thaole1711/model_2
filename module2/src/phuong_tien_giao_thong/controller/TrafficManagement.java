package phuong_tien_giao_thong.controller;

import java.util.Scanner;
public class TrafficManagement {

    public static void displayMenu() {
        Scanner scanner= new Scanner(System.in);
        TypeOfVehicleController typeOfVehicleController = new TypeOfVehicleController();
        boolean flag=true;
        do {
        System.out.println("----CHUONG TRINH QUAN LY PHUONG TIEN GIAO THONG---"+
                "\n chon chuc nang:"+
                "\n 1. them moi chuc nang" +
                "\n 2. hien thi chuc nang"+
                "\n 3. xoa phuong tien"+
                "\n 4. thoat");
            System.out.println("nhap so ban chon:");
        int number= scanner.nextInt();
            switch (number){
                case 1:
                  typeOfVehicleController.add();
                    break;
                case 2:
                    typeOfVehicleController.display();
                    break;
                case 3:
                   typeOfVehicleController.delete();
                    break;
                case 4:
                    System.out.println("thoat chuong trinh");
                    System.exit(0);
                    break;
                default:
                    flag=false;
                    System.out.println("ban hay chon tu 1 den 4");
            }
        }while (flag);

    }
}
