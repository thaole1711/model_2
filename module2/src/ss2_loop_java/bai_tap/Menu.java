package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. print the rectangle");
        System.out.println("2. print the square triangle");
        System.out.println("3. print isosceles triangle");
        System.out.println("4 exit");
        System.out.println("enter number:");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();

                }
                break;
            case 2:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
                System.out.println();
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 1; j <= 6 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.exit(4);
        }

    }
}

