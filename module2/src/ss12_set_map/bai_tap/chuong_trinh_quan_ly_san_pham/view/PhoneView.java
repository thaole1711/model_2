package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.view;

import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;

import java.util.Scanner;

public class PhoneView {
    Phone phone = new Phone();
    private static Scanner scanner = new Scanner(System.in);

    public Phone add() {
        System.out.println("nhập id điện thoại");
        int idAdd = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên điện thoại");
        String nameAdd = scanner.nextLine();
        System.out.println("nhập giá điện thoại");
        double priceAdd = Double.parseDouble(scanner.nextLine());
        Phone phone = new Phone(idAdd, nameAdd, priceAdd);
        return phone;
    }

    public int delete() {
        System.out.println("nhập id xóa điện thoại:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        return idDelete;
    }

    public String seach() {
        System.out.println("nhập tên điện thoại cần tìm:");
        String nameSeach = scanner.nextLine();
        return nameSeach;
    }

    public Phone Update(int id) {
        System.out.println("nhập tên thay đổi");
        String nameUpdate = scanner.nextLine();
        phone.setName(nameUpdate);
        System.out.println("nhập giá thay đổi");
        Double priceUpdate = Double.parseDouble(scanner.nextLine());
        phone.setPrice(priceUpdate);
        Phone phoneUpdate = new Phone(id, nameUpdate, priceUpdate);
        System.out.println(phoneUpdate);
        return phoneUpdate;
    }

    public int findId() {
        System.out.println("nhập id thay đổi điện thoại:");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        return idUpdate;
    }


}
