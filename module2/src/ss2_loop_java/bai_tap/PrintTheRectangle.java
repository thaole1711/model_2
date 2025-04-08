package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class PrintTheRectangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập chiều dài hình chữ nhật ");
        int length= scanner.nextInt();
        System.out.println("Nhập chiều rộng hình chữ nhật");
        int width= scanner.nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
