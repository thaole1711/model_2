package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.controller;

import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ComparatorByPriceIncrease;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.FindId;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.repository.PhoneRepository;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.sevice.PhoneSevice;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.view.PhoneView;

import java.util.List;
import java.util.Scanner;

public class PhoneController {
    public static Scanner scanner = new Scanner(System.in);
    PhoneView phoneView = new PhoneView();
    PhoneSevice phoneSevice = new PhoneSevice();

    public void menuPhone() {
        int number;
        do {
            System.out.println("---MENU ĐIỆN THOAI---");
            System.out.println("Chương trình quản lý điện thoại:" +
                    "\n 1. thêm điện thoại" +
                    "\n 2.sửa thông điện thoại theo id" +
                    "\n 3. xóa dien thoại theo id" +
                    "\n 4. hiển thị danh sách diện thoại" +
                    "\n 5. tìm kiếm điện thoại theo tên" +
                    "\n 6. sắp xếp điện thoai tăng dần, giảm dần theo giá" +
                    "\n 7. thoát chương trình" +
                    "\n So bạn chọn là:");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    Phone phoneNew = phoneView.add();
                    phoneSevice.add(phoneNew);
                    System.out.println(phoneNew);
                    break;
                case 2:
                    int id = phoneView.findId();
                    phoneSevice.findId(id);
                    if (!FindId.flag) {
                        System.out.println("không tim thấy");
                    } else {
                        Phone phone1 = phoneView.update(id);
                        phoneSevice.update(phone1);
                        System.out.println("Cap nhat thanh cong");
                        FindId.flag = false;
                    }

                    break;
                case 3:
                    int idDelete = phoneView.delete();
                    boolean check = phoneSevice.delete(idDelete);
                    if (check) {
                        System.out.println("xóa thành công");
                    } else {
                        System.out.println("không tim thay");
                    }
                    break;
                case 4:
                    List<Phone> phones = phoneSevice.findAll();
                    for (Phone phone : phones) {
                        System.out.println(phone);
                    }
                    break;
                case 5:
                    String nameSeach = phoneView.seach();
                    phoneSevice.seach(nameSeach);
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    System.out.println("thoát chương trình");
                    System.exit(0);
            }
        } while (number != 7);
    }

    public void sort() {
        System.out.println("bạn sắp xếp điện thoại theo:" +
                "\n 1. tăng dần" +
                "\n 2. giam dần" +
                "\n 3. thoát" +
                "\n bạn chọn số:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            List<Phone> phones = phoneSevice.findAll();
            phones.sort(new ComparatorByPriceIncrease());
            PhoneView.display(phones);

        } else if (number == 2) {
            phoneSevice.decreaseSort();
        } else {
            System.out.println("thoát chương trinh");
            System.exit(0);
        }
    }

}
