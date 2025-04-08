package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[4];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("nhập phần tự ở vị trí" + i);
            array1[i] = scanner.nextInt();
        }
        System.out.println("mảng 1 là:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.println("nhập phần tự ở vị trí" + i);
            array2[i] = scanner.nextInt();
        }

        System.out.println("mảng 2 là:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        int[] array3 = new int[9];
        for (int i = 0; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length+i]=array2[i];
        }
        System.out.println("mảng 3 là:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]+"\t");
        }

    }
}
