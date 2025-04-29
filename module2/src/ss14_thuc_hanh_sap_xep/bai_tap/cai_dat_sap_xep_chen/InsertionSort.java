package ss14_thuc_hanh_sap_xep.bai_tap.cai_dat_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap đo dài của mảng");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("nhập phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSort(array);

    }

    public static void insertionSort(int[] list) {
        int index, temp;
        for (int i = 1; i < list.length; i++) {
            index = i;
            temp = list[i];
            while (index > 0 && temp < list[i - 1]) {
                list[index] = list[index - 1];
                index--;
            }
            list[index] = temp;
        }
        System.out.println(Arrays.toString(list));

    }
}
