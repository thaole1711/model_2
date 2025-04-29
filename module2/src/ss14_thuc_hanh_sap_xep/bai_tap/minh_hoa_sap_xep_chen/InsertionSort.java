package ss14_thuc_hanh_sap_xep.bai_tap.minh_hoa_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list={3,2,5,1,6};
        insertionSort(list);
        System.out.println(Arrays.toString(list));

    }

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }

    }
}
