package ss14_thuc_hanh_sap_xep.thuc_hanh.minh_hoa_sap_xep_noi_bot;

public class Thuat_toan_noi_bot {
    public static void main(String[] args) {
       int[] arr= BubbleSort(list);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static int[] list={2,3,5,6,1,8,9};
    public static int[] BubbleSort(int[] list) {

        for (int i = 0; i < list.length; i++) {
            boolean flag = true;
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int tempt = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tempt;
                    flag = false;
                }

            }
            if (flag) {
                break;
            }
        }
        return list;

    }
}
