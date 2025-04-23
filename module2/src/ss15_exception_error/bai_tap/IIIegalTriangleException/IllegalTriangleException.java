package ss15_exception_error.bai_tap.IIIegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhập cạnh thứ nhất:");
            int number1 = scanner.nextInt();
            System.out.println("nhập cạnh thứ hai:");
            int number2 = scanner.nextInt();
            System.out.println("nhập cạnh thứ ba:");
            int number3 = scanner.nextInt();
            Trianggle trianggle = new Trianggle(number1, number2, number3);
            System.out.println("là ba canh của tam giác");
        } catch (NumberFormatException e){
            System.out.println("nhap bằng số");
        }catch (Exception e){
            e.getMessage();
        }

}
    }
