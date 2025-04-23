package ss15_exception_error.thuc_hanh.thuc_hanh.arrayIndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Integer[] array= new Integer[100];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= rd.nextInt(100);
            System.out.print(array[i]+" ");
        }
        return array;
    }
}
