package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.repository;

import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ComparatorByPriceDecrease;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ComparatorByPriceIncrease;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.FindId;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;

import java.util.*;

public class PhoneRepository implements IPhoneRepository {

    Scanner scanner = new Scanner(System.in);
    public static List<Phone> phoneList = new ArrayList<>();
static {
    phoneList.add(new Phone(6,"samsung",10000));
    phoneList.add(new Phone(2,"nokia",13000));
    phoneList.add(new Phone(3,"iphone",150000));
}
    @Override
    public void add(Phone phone) {
        phoneList.add(phone);
    }
    @Override
    public void findId(int id) {
        for (Phone phone : phoneList) {
            if (phone.getId() == id) {
                FindId.flag = true;
                break;
            }
        }
    }

    @Override
    public void update(Phone phone) {
        for (int i = 0; i < phoneList.size(); i++) {
            if (phone.getId() == phoneList.get(i).getId()) {
                phoneList.set(i, phone);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getId() == id) {
                phoneList.remove(i);
                System.out.println(phoneList);
                System.out.println("bạn đã xóa điện thoai " + phoneList.get(i).getName());
                break;
            }
            System.out.println("không tìm thấy id bạn nhập");
        }

    }

    @Override
    public void display() {
        System.out.println(phoneList);
    }

    @Override
    public void seach(String name) {
        boolean found = false;
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getName().contains(name)) {
                found = true;
                System.out.println(phoneList.get(i));
            }
        }
        if (!found) {
            System.out.println("không tìm thấy điện thoại bạn tìm");
        }
    }

    @Override
    public void increaseSort() {
        Collections.sort(phoneList, new ComparatorByPriceIncrease());
        System.out.print(phoneList);
    }

    public void decreaseSort() {
        Collections.sort(phoneList, new ComparatorByPriceDecrease());
        System.out.println(phoneList);
    }


}
