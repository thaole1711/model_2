package ss15_exception_error.thuc_hanh.thuc_hanh.arrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
      Integer[] arr=  arrayExample.createRandom();
        Scanner scanner= new Scanner(System.in);
        System.out.println("\nnhập chỉ số của một phần tử bất kì:");
        int number=scanner.nextInt();
        try{
            System.out.println("giá tri của phần tử có chỉ số "+number+"là:"+arr[number]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
