package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common;

import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;

import java.util.Comparator;

public class ComparatorByPriceIncrease implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return(int)( o1.getPrice()- o2.getPrice());
    }
}
