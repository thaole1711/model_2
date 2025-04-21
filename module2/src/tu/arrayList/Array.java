package tu.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[] args) {
//        ArrayList<IntegerArray> lst1=new ArrayList<>();
//       ArrayList<IntegerArray> lst= new ArrayList<>(List.of(1,7,3,4,5));
//       ArrayList<IntegerArray>lst2= new ArrayList<>(5);
//      Collections.sort(lst);
//     System.out.println(" sau sắp xếp"+lst);
//
//      System.out.println(lst.indexOf(4));
//        System.out.println("duyêt for");
//      for (int vl : lst){
//           System.out.println(vl);
//        for (int i = 0; i < lst.size(); i++) {
//            int vl= lst.get(i);
//            System.out.println(vl);
//        }
        ArrayList<Integer> lst3=new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(lst3);
//        lst3.add(7);
//        lst3.add(8);
//        System.out.println("ms add là");
//        System.out.println(lst3);
//        lst3.add(1,99);
//        System.out.println(lst3);
//        System.out.println(lst3.size());
//        System.out.println(lst3.get(3));
//lst3.remove(2);
//        System.out.println("sau xoa"+lst3);

      lst3.set(2,99);
        System.out.println("sau doi"+lst3);




    }

}
