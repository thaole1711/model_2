package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int rows = scanner.nextInt();
        System.out.println("nhập số cột");
        int cols = scanner.nextInt();
        double[][] array = new double[rows][];
        for (int i = 0; i < rows; i++) {
            array[i] = new double[cols];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhập phần tử của mảng vào" + i + j);
                array[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        double max = array[0][0];
        int value1 = 0;
        int value2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    value1 = i;
                    value2 = j;
                }
            }
        }
        System.out.println("giá trị lớn nhất là:" + max + "tọa độ là:" + value1 + ":" + value2);

    }
}
