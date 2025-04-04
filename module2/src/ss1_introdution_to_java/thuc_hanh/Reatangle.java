package ss1_introdution_to_java.thuc_hanh;

import java.util.Scanner;

public class Reatangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter width:");
        width= scanner.nextFloat();
        System.out.println(" enter height");
        height=scanner.nextFloat();
        System.out.println("area is"+ width*height);
    }
}
