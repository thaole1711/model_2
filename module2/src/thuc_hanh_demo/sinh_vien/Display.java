package thuc_hanh_demo.sinh_vien;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
     Menu();
    }
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        HocSinh hocSinh=new HocSinh();
        byte number ;
        boolean flag=true;
        do {

            System.out.println("menu");
            System.out.println("1.display");
            System.out.println("2.add");
            System.out.println("3.delete");
            System.out.println("4. update");
            System.out.println("5. search");
            System.out.println("6.exit");
            System.out.println("nhập số bạn chọn :");
            number = scanner.nextByte();
            switch (number) {
                case 1:
                   hocSinh.display(); ;
                    break;
                case 2:
                    hocSinh.add();
                    hocSinh.display();
                    break;
                case 3:
                    hocSinh.Delete();
                    hocSinh.display();
                    break;
                case 4:
                    System.out.println("Update");
                    break;
                case 5:
                    System.out.println("search");
                    break;
                case 6:
                    System.out.println("exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("bạn hãy chọn từ 1 đến 6");
            }
        }while (flag);
    }
}
