package ss11_stack_queue.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        String[] array = string.toLowerCase().split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (!(stack.pop().equals(queue.poll()))) {
                System.out.println("không phải palindrome");
                break;
            }
            if(stack.isEmpty()){
                System.out.println("palindrome");
            }
        }


    }
}
