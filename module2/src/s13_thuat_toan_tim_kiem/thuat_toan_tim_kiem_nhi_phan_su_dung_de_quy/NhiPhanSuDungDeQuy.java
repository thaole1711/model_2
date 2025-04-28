package s13_thuat_toan_tim_kiem.thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.*;

public class NhiPhanSuDungDeQuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size cua mang:");
        int number = scanner.nextInt();
        Integer[] list = new Integer[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhap phan tu cho mang:");
            list[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        int[] arr = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            arr[i] = list[i];
        }
        System.out.println("nhap value:");
        int value = scanner.nextInt();
        int kq = binarySearch(arr, 0, list.length - 1, value);
        System.out.println("vi tri index la:" + kq);
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (right >= left) {
            if (arr[middle] == value) {
                return middle;
            }
            if (value > arr[middle]) {
                return binarySearch(arr, middle + 1, right, value);
            }
            if (value < arr[middle]) {
                return binarySearch(arr, left, middle - 1, value);
            }
        }
        return -1;


    }
}
