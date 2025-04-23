package tu;

import demo.entity.Student;
import thuc_hanh_demo.sinh_vien.HocSinh;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<HocSinh> hocSinhSet = new HashSet<>();
        HocSinh student1 = new HocSinh(1, "tam1");
        HocSinh student2 = new HocSinh(2, "tam2");
        HocSinh student3 = new HocSinh(2, "tam2");
        HocSinh student4 = new HocSinh(3, "tam3");
        HocSinh student5 = new HocSinh(4, "tam4");
        HocSinh student6 = new HocSinh(5, "tam5");
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
        Map<HocSinh, Integer> sinhIntegerMap = new HashMap<>();
        sinhIntegerMap.put(student1, 1);
        sinhIntegerMap.put(student2, 1);
        sinhIntegerMap.put(student3, 1);
        sinhIntegerMap.put(student4, 1);
        sinhIntegerMap.put(student1, 3);
        Set<HocSinh> sinhs = sinhIntegerMap.keySet();
        for (HocSinh hocSinh : sinhs) {
            System.out.println(sinhIntegerMap.get(hocSinh));
        }



    }
}

