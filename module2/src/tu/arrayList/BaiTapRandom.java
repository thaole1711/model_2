package tu.arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaiTapRandom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhạp sô lương cần tạo");
        int n=scanner.nextInt();
        Random rd= new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ngauNhien= rd.nextInt(1,101);
            list.add(ngauNhien);
        }
        System.out.println(list);

    }
}
