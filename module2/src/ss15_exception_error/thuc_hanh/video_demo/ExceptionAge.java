package ss15_exception_error.thuc_hanh.video_demo;

import java.util.Scanner;

public class ExceptionAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("nhập tuổi");
            try {
                age =Integer.parseInt(scanner.nextLine()) ;
                checkAge(age);
                flag = false;
            } catch (MyAgeException e) {
                System.out.println(e.getMessage());
//                System.out.println("Nhập sai tuổi");
//                System.out.println("nhập lai tuôi");
            } catch (NumberFormatException e) {
                System.out.println("nhạp số");
            }

        }
        System.out.println("tuoi là " + age);
    }

    public static boolean checkAge(int age) throws MyAgeException {
        if (age < 0) {
//            throw new MyAgeException("tuổi nhỏ hơn 0");
        } else if (age > 120) {
//            throw new MyAgeException("tuoir lớn hơn 120");
        }
        return true;
    }

}