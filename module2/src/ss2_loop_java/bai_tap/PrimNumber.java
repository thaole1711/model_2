package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class PrimNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("số lượng số nguyên tố cần in ra là:");
        int number=scanner.nextInt();
        int count=0;
        int N=2;
        while (count<number){
            boolean flag= true;
            for (int i = 2; i < N; i++) {
                if(N%i ==0){
                    flag =false;
                    break;
                }
            }
            if(flag==true){
                System.out.print( N+"," );
                count++;
            }
            N++;
        }
    }
}
