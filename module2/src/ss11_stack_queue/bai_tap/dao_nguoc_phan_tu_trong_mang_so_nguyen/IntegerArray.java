package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen;

import ss11_stack_queue.thuc_hanh.MyGenericStack;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class IntegerArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));


    }
}
