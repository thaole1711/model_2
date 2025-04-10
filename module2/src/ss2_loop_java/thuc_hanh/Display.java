package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
     Menu();
    }
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        byte number ;
        do {

            System.out.println("menu");
            System.out.println("1.display");
            System.out.println("2.add");
            System.out.println("3.delete");
            System.out.println("4. update");
            System.out.println("5. search");
            System.out.println("6.exit");
            System.out.println("nhập số bạn chọn");
            number = scanner.nextByte();
            switch (number) {
                case 1:
                    System.out.println("display");
                    break;
                case 2:
                    System.out.println("Add");
                    break;
                case 3:
                    System.out.println("Delete");
                    break;
                case 4:
                    System.out.println("Update");
                    break;
                case 5:
                    System.out.println("search");
                    break;
                case 6:
                    System.out.println("exit");
                    break;
            }
        }while (number!=6);
    }
}
