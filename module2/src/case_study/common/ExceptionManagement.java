package case_study.common;

import java.util.Scanner;

public class ExceptionManagement {
    public static int exception(Scanner scanner,String message) {
        int number = 0;
        boolean isFlag = true;
      while (isFlag){
          try {
              System.out.println(message);
            number = Integer.parseInt(scanner.nextLine());
            isFlag = false;
        } catch (NumberFormatException e) {
            System.out.println("nhâp số");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        return number;
    }

}