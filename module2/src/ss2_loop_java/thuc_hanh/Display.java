package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {

    }
    public static void Menu(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập số bạn chọn");
            byte number= scanner.nextByte();
            switch (number){
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
                    System.out.println("exist");
                    break;
            }

    }
}
