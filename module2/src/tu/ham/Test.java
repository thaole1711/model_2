package tu.ham;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 2, 8};
        int[] b = new int[15];
        //tim kiem
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, -1));

    }
}
