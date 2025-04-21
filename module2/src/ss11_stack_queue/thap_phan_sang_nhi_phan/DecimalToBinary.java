package ss11_stack_queue.thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer>stack= new Stack<>();
        System.out.println("nhập số: ");
        int number= scanner.nextInt();
        while (number>0){
            number=number/2;
            int tempt= (int) Math.floor(number%2);
            stack.push(tempt);
        }
        System.out.println(stack);
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) +" ");
        }
    }



}
