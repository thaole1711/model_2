package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.repository;

import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ComparatorByPriceDecrease;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ComparatorByPriceIncrease;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.FindId;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ReadAndWriteFile;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.view.PhoneView;

import java.util.*;

public class PhoneRepository implements IPhoneRepository {
    public final String PHONE_FILE = "D:\\codegym\\module2\\module2\\src\\ss12_set_map\\bai_tap\\chuong_trinh_quan_ly_san_pham\\data\\phone.csv";

    Scanner scanner = new Scanner(System.in);

    boolean append = true;
    boolean noAppend = false;

    @Override
    public void add(Phone phone) {
        List<String> stringList = new ArrayList<>();
        stringList.add(phone.getInfoToFile());
        ReadAndWriteFile.writeFileCSV(PHONE_FILE, stringList, append);
    }

    @Override
    public void findId(int id) {
        List<Phone> phoneList = findAll();
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getId() == id) {
                FindId.flag = true;
                break;
            }
        }

    }

    @Override
    public void update(Phone phone) {
        List<Phone> phoneList = findAll();
        for (int i = 0; i < phoneList.size(); i++) {
            if (phone.getId() == phoneList.get(i).getId()) {
                phoneList.set(i, phone);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Phone phone1 : phoneList) {
            stringList.add(phone1.getInfoToFile());
        }
        ReadAndWriteFile.writeFileCSV(PHONE_FILE, stringList, noAppend);
    }

    @Override
    public boolean delete(int id) {
        List<Phone> phones = findAll();
        boolean check = false;
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId() == id) {
                check = true;
                phones.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Phone phone : phones) {
            stringList.add(phone.getInfoToFile());
        }
        ReadAndWriteFile.writeFileCSV(PHONE_FILE, stringList, noAppend);
        return check;

//        for (int i = 0; i < phoneList.size(); i++) {
//            if (phoneList.get(i).getId() == id) {
//                phoneList.remove(i);
//                System.out.println(phoneList);
//                System.out.println("bạn đã xóa điện thoai " + phoneList.get(i).getName());
//                break;
//            }
//            System.out.println("không tìm thấy id bạn nhập");
//        }

    }

    @Override
    public List<Phone> findAll() {
        List<Phone> phoneList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PHONE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Phone phone = new Phone(Integer.parseInt(array[0]), array[1], Long.parseLong(array[2]));
            phoneList.add(phone);
        }
        return phoneList;

    }

    @Override
    public void seach(String name) {
        List<Phone> phoneList = findAll();
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
        List<Phone> phoneList = findAll();
        Collections.sort(phoneList, new ComparatorByPriceIncrease());
        PhoneView.display(phoneList);
//        for (Phone phone: phoneList) {
//            System.out.println(phone);
//        }
    }

    public void decreaseSort() {
        List<Phone> phoneList = findAll();
        Collections.sort(phoneList, new ComparatorByPriceDecrease());
//        for (Phone phone : phoneList) {
//            System.out.println(phone);
//        }

    }
}
