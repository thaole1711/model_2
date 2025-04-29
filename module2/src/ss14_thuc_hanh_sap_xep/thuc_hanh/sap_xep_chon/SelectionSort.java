package ss14_thuc_hanh_sap_xep.thuc_hanh.sap_xep_chon;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list={3,5,2,1,6,8};
        selectionSort(list);

    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int minIndex = i;
            int min = list[i];
            for (int j = i + 1; j < list.length; j++) {
              if(min>list[j]){
                  minIndex=j;
                  min=list[j];
              }
            }
            if(minIndex!=i){
              int  temp= list[minIndex];
              list[minIndex]=list[i];
              list[i]=temp;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
