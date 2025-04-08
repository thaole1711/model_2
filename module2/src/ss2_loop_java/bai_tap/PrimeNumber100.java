package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class PrimeNumber100 {
    public static void main(String[] args) {
        int number=2;
        while (number<100){
            boolean flag= true;
            for (int i = 2; i <=Math.sqrt(number) ; i++) {
                if(number%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(number+",");
            }
            number++;
        }
    }
}
