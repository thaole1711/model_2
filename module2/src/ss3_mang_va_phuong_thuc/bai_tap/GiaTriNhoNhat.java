package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] array= new int[5];
        for (int i = 0; i <array.length; i++) {
            System.out.println("nhập phần tử vi tri:"+i);
            array[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("giá trị nhỏ nhất là:"+min);


    }
}
