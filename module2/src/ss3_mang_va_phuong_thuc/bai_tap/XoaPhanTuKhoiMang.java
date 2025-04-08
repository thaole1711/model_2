package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử cần xóa");
        int numberDelete = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberDelete) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("không tìm thấy phần tử cần xóa");
        } else {
            for (int i = index_del; i < array.length-1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
