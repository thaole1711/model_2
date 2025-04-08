package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int[] arrayNew = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phần tử vào vi trí" + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("nhập số cần chèn vào");
        int number = scanner.nextInt();
        System.out.println("nhập vi trí can chèn vào");
        int index = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (index <= -1 || index > array.length - 1) {
                System.out.println("không chèn được phan tử vào");
            }
        }
        for (int i = 0; i < arrayNew.length; i++) {
            if (i < index) {
                arrayNew[i] = array[i];
            } else if (i == index) {
                arrayNew[i] = number;

            } else {
                arrayNew[i] = array[i - 1];
            }
        }
        System.out.println(Arrays.toString(arrayNew));

    }
}
