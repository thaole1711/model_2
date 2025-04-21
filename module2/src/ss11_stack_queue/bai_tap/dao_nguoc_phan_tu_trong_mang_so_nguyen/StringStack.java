package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen;

import java.util.Arrays;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        String string = " le thu thao";
        String[] mWord = string.split("");
        System.out.println(Arrays.toString(mWord));
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
        }

        String stringWord = String.join("", mWord);
        System.out.println(stringWord);


    }
}
