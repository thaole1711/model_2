package tu;

import com.sun.source.tree.Tree;
import demo.entity.Student;
import thuc_hanh_demo.sinh_vien.HocSinh;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        HocSinh hocSinh1 = new HocSinh(1, "heo1");
        HocSinh hocSinh2 = new HocSinh(2, "heo2");
        HocSinh hocSinh3 = new HocSinh(3, "heo3");
        HocSinh hocSinh4 = new HocSinh(4, "heo4");
        HocSinh hocSinh5 = new HocSinh(5, "heo5");


            Map<HocSinh, Integer> hocSinhMap = new LinkedHashMap<>();
            hocSinhMap.put(hocSinh1,1);
            hocSinhMap.put(hocSinh2,2);
            hocSinhMap.put(hocSinh3,3);
            hocSinhMap.put(hocSinh4,4);
            hocSinhMap.put(hocSinh5,5);
            HocSinh hocSinh6= new HocSinh(5,"heo5");
            if(hocSinhMap.containsKey(hocSinh6)){
                hocSinhMap.put(hocSinh6,hocSinhMap.get(hocSinh6)+10);
            }else {
                hocSinhMap.put(hocSinh6,1);
            }
        Set<HocSinh> hocSinhs= hocSinhMap.keySet();
            for (HocSinh hocSinh: hocSinhs){
                System.out.println(hocSinh.getName()+"+"+hocSinhMap.get(hocSinh));
            }



//        Set<HocSinh> hocSinhSet = new LinkedHashSet<>();
//        HocSinh student1 = new HocSinh(1, "tam1");
//        HocSinh student2 = new HocSinh(2, "tam2");
//        HocSinh student3 = new HocSinh(2, "tam2");
//        HocSinh student4 = new HocSinh(3, "tam3");
//        HocSinh student5 = new HocSinh(4, "tam4");
//        HocSinh student6 = new HocSinh(5, "tam5");
//        System.out.println(student2.hashCode());
//        System.out.println(student3.hashCode());
//        hocSinhSet.add(student1);
//        hocSinhSet.add(student2);
//        hocSinhSet.add(student3);
//        hocSinhSet.add(student4);
//        hocSinhSet.add(student5);
//        for (HocSinh hs : hocSinhSet) {
//            System.out.println(hs);
//        }
//        Map<HocSinh, Integer> sinhIntegerMap = new TreeMap<>();
//        sinhIntegerMap.put(student1, 1);
//        sinhIntegerMap.put(student2, 3);
//        sinhIntegerMap.put(student3, 2);
//        sinhIntegerMap.put(student4, 1);
//        sinhIntegerMap.put(student1, 3);
//        sinhIntegerMap.put(student5, 3);
//        sinhIntegerMap.put(student6, 3);
//
//        HocSinh sinh = new HocSinh(1, "tam4");
//        if (sinhIntegerMap.containsKey(sinh)) {
//            sinhIntegerMap.put(sinh, sinhIntegerMap.get(sinh) + 20);
//        } else {
//            sinhIntegerMap.put(sinh, 1);
//        }
//        Set<HocSinh> sinhSet = sinhIntegerMap.keySet();
//        for (HocSinh hocSinh : sinhSet) {
//            System.out.println("học sinh" + hocSinh.getName() + "--vắng:" + sinhIntegerMap.get(hocSinh));
//        }
//        Set<HocSinh> sinhs = sinhIntegerMap.keySet();
//        for (HocSinh hocSinh : sinhs) {
//            System.out.println("hoc viên:"+hocSinh.getName()+"vắng nghỉ:"+sinhIntegerMap.get(hocSinh));
//            Set<Map.Entry<HocSinh,Integer>> entrys=sinhIntegerMap.entrySet();
//            for (Map.Entry<HocSinh,Integer> e:entrys){
//                System.out.println((e.getKey().getName()+":"+e.getValue()));
//            }
//        }
//


    }
}

