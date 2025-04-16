package thuc_hanh_demo.sinh_vien;

import java.util.Comparator;

public class CompareByName implements Comparator<HocSinh> {
    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
