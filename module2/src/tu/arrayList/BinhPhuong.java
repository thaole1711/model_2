package tu.arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BinhPhuong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập n");
        int n=scanner.nextInt();
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu vào thứ:"+(i+1));
            int so=scanner.nextInt();
            arrayList.add(so);

            }
        System.out.println(arrayList);
        ArrayList <Integer> binhPhuong= new ArrayList<>();
        for(int bp : arrayList){
            binhPhuong.add(bp*bp);

        }
        System.out.println(binhPhuong);
        int count=0;
        for(int dem : binhPhuong){
            if(dem>50){
                count++;
            }

        }
        System.out.println(count);
    }
}
