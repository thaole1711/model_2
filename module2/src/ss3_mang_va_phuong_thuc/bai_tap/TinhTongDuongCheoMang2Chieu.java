package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheoMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so hang va so cot bang nhau");
        System.out.println("nhap so hang:");
        int rowls= scanner.nextInt();
        System.out.println("nhap so cot:");
        int cols=scanner.nextInt();
        double[][] array= new double[rowls][];
        for (int i = 0; i < rowls; i++) {
            array[i]= new double[cols];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhap gia tri cua phan tu"+i+j);
              array[i][j]=scanner.nextDouble();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        double sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==j){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("tong duong cheo la:"+sum);

    }

}
