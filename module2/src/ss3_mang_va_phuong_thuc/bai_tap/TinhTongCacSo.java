package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TinhTongCacSo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" nhap so hang: ");
        int rowls= scanner.nextInt();
        System.out.println("nhap so cot:");
        int cowls= scanner.nextInt();
        double[][] array= new double[rowls][];
        for (int i = 0; i < rowls; i++) {
           array[i]=new double[cowls];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhap gia tri cua vi tri:"+i+j);
                array[i][j]=scanner.nextDouble();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("nhap cot muon tinh tong :");
        double sum=0;
        int choiceRowl=scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j =choiceRowl ; j <=choiceRowl; j++) {
                sum+=array[i][j];
            }
        }
        System.out.println("tong la:"+sum);
    }
}
